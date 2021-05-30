package de.ckraus.commons.beans;

import de.ckraus.commons.logging.Logger;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public interface Bean extends InitializingBean {

    <T> Logger<T> getLogger();

    /**
     * Getter for configuration properties
     *
     * @return
     */
    Properties getProperties();

    /**
     * Getter for parameters
     *
     * @return
     */
    ConcurrentMap<String, Map.Entry<Class<?>, Object>> getParameters();

    /**
     * Setter for parameters
     *
     * @param mParams
     */
    void setParameters(ConcurrentMap<String, Map.Entry<Class<?>, Object>> mParams);

    /**
     * Getter for initialization flag
     *
     * @return
     */
    boolean isInitialized();

    /**
     * Setter for initialization flag
     *
     * @param bInitialized - boolean flag
     */
    void setInitialized(boolean bInitialized);

    /**
     * Delegates to {@link #initialize(boolean)} with {@code null} value.
     *
     * @return
     *
     * @throws BeanInitializationException
     */
    default boolean initialize() throws BeanInitializationException {
        return initialize(false);
    }

    /**
     * Initializes the bean. Boolean flag can be used to invoke a reinitialization. The return value indicates wether
     * the initialization was successful or not.
     *
     * @param bReinitialization
     *
     * @return
     *
     * @throws BeanInitializationException
     */
    default boolean initialize(boolean bReinitialization) throws BeanInitializationException {
        if (!this.isInitialized()) {
            this.setInitialized(true);
        }
        return bReinitialization;
    }

    @Override
    default void afterPropertiesSet() throws Exception {
        this.initialize();
    }

    /**
     * @param sKey
     * @param oValue
     *
     * @return
     */
    default Bean addParameter(String sKey, Object oValue) {
        if (StringUtils.isNotEmpty(sKey)) {
            if (null == oValue) {
                if (MapUtils.isNotEmpty(this.getParameters())) {
                    this.getParameters().remove(sKey);
                }
            }
            else {
                if (MapUtils.isEmpty(this.getParameters())) {
                    this.setParameters(new ConcurrentHashMap<>());
                }
                this.getParameters().put(sKey, Map.entry(oValue.getClass(), oValue));
            }
        }
        return this;
    }

    /**
     * TODO
     *
     * @param sKey
     * @param <T>
     *
     * @return
     */
    default <T> T getParameter(String sKey) {
        T param = null;

        if (MapUtils.isNotEmpty(this.getParameters())) {
            param = this.getParameter(sKey);
        }

        return param;
    }

    /**
     * @param mapParams
     *
     * @return
     */
    default Bean addParameters(Map<String, Map.Entry<Class<?>, Object>> mapParams) {
        if (MapUtils.isNotEmpty(this.getParameters())) {
            this.getParameters().putAll(mapParams);
        }
        return this;
    }

}
