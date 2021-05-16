package de.ckraus.commons.beans;

import de.ckraus.commons.logging.slf4j.Slf4JLogger;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentMap;

/**
 * TODO
 */
@Getter
@Setter
public abstract class BeanBase implements Bean {

    private Slf4JLogger logger = new Slf4JLogger(BeanBase.class);
    private boolean initialized;
    private Properties properties;
    private ConcurrentMap<String, Map.Entry<Class<?>, Object>> parameters;

    /**
     * Constructor
     */
    protected BeanBase() {
        super();
    }

}
