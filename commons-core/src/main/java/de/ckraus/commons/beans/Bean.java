package de.ckraus.commons.beans;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentMap;

public interface Bean {

    /**
     * Delegates to {@link #initialize(boolean)} with {@code null} value.
     * @return
     */
    default boolean initialize() {
        return initialize(false);
    }

    /**
     * Initializes the bean. Boolean flag can be used to invoke a reinitialization. The return value indicates
     * wether the initialization was successful or not.
     * @param bReinitialization
     * @return
     */
    boolean initialize(boolean bReinitialization);

    /**
     * Causes a reset of this bean. All properties can be set to a null/initial value. The default implementation
     * ignores the configuration properties and the params map.
     * Initialized flag is set to false.
     */
    void reset();

    /**
     * Getter for initialization flag
     * @return
     */
    boolean isInitialized();

    /**
     * Getter for the configuration properties
     * @return
     */
    Properties getConfigurationProperties();

    /**
     * Getter for the configuration properties
     * @return
     */
    <T> ConcurrentMap<String, Map.Entry<Class<T>, T>> getParams();

}
