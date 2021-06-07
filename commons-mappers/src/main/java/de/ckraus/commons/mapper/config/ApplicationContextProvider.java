package de.ckraus.commons.mapper.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Autowired
    private static MapperConfig mapperConfig;

    /**
     * @return
     */
    public static synchronized ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public synchronized void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextProvider.applicationContext = applicationContext;
    }

    /**
     * @return
     */
    public static synchronized MapperConfig getMapperConfig() {
        return mapperConfig;
    }

    /**
     *
     * @param mapperConfig
     */
    public synchronized void setMapperConfig(MapperConfig mapperConfig) {
        ApplicationContextProvider.mapperConfig = mapperConfig;
    }
}
