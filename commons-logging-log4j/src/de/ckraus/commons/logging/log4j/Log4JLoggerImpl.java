package de.ckraus.commons.logging.log4j;

import de.ckraus.commons.logging.LoggerBase;
import org.apache.log4j.Logger;

public class Log4JLoggerImpl extends LoggerBase<Logger> {

    /**
     * Csontructor
     * @param clazz
     */
    public Log4JLoggerImpl(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public Logger initLogger(Class<?> clazz) {
        return Logger.getLogger( clazz );
    }


}
