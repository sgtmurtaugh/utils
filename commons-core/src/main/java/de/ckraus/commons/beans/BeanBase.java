package de.ckraus.commons.beans;


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

    private boolean initialized;
    private Properties properties;
    private ConcurrentMap<String, Map.Entry<Class<? extends Object>, Object>> parameters;

}
