package de.ckraus.commons.mapper.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;

    /**
     *
     * @return
     */
    public static synchronized ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public synchronized void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextProvider.applicationContext = applicationContext;
    }

}
