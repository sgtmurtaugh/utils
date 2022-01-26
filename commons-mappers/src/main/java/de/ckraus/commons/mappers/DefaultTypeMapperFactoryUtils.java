package de.ckraus.commons.mappers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultTypeMapperFactoryUtils {

    /**
     * Constructor
     */
    private DefaultTypeMapperFactoryUtils() {
        super();
    }

    @Bean
    public static DefaultTypeMapperFactory getFactory() {

    }
}
