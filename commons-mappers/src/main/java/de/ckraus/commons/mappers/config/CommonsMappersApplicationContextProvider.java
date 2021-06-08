package de.ckraus.commons.mappers.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CommonsMappersApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Autowired
    private static CommonsMappersConfig commonsMappersConfig;

    /**
     * @return
     */
    public static synchronized ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public synchronized void setApplicationContext(ApplicationContext applicationContext) {
        CommonsMappersApplicationContextProvider.applicationContext = applicationContext;
    }

    /**
     * @return
     */
    public static synchronized CommonsMappersConfig getMapperConfig() {
        return commonsMappersConfig;
    }

    /**
     *
     * @param commonsMappersConfig
     */
    public synchronized void setMapperConfig(CommonsMappersConfig commonsMappersConfig) {
        CommonsMappersApplicationContextProvider.commonsMappersConfig = commonsMappersConfig;
    }
}
