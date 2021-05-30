package de.ckraus.commons.beans;

import org.springframework.beans.factory.BeanInitializationException;

public interface ResetableBean extends Bean {

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
        if (bReinitialization) {
            this.reset();
        }
        return Bean.super.initialize(bReinitialization);
    }

    /**
     * Causes a reset of this bean. All properties can be set to a null/initial value. The default implementation
     * ignores the configuration properties and the params map. Initialized flag is set to false.
     */
    default void reset() {
        this.setInitialized(false);
    }

}
