package de.ckraus.commons.logging.log4j;

import de.ckraus.commons.logging.LoggerBase;
import lombok.NonNull;
import org.apache.log4j.Logger;

import java.util.Collection;

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

// TODO
    @Override
    public void logEnter( @NonNull String sMethod ) {
        // this.getLogger().debug(  );
    }

    @Override
    public void logEnter( String sMethod, Object oMethodArg ) {

    }

    @Override
    public void logEnter( String sMethod, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logEnter( String sMethod, Object... aoMethodArgs ) {

    }

    @Override
    public void logParam( String sMethod, Object oParam ) {

    }

    @Override
    public void logReturn( String sMethod ) {

    }

    @Override
    public void logReturn( String sMethod, Object oReturn ) {

    }

    @Override
    public void logReturn( String sMethod, Collection<?> collReturn ) {

    }

    @Override
    public void logFatal( String sMethod ) {

    }

    @Override
    public void logFatal( String sMethod, String sMessage ) {

    }

    @Override
    public void logFatal( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logFatal( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logFatal( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logFatal( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logFatal( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

    @Override
    public void logError( String sMethod ) {

    }

    @Override
    public void logError( String sMethod, String sMessage ) {

    }

    @Override
    public void logError( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logError( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logError( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logError( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logError( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

    @Override
    public void logWarn( String sMethod ) {

    }

    @Override
    public void logWarn( String sMethod, String sMessage ) {

    }

    @Override
    public void logWarn( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logWarn( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logWarn( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logWarn( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logWarn( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

    @Override
    public void logInfo( String sMethod ) {

    }

    @Override
    public void logInfo( String sMethod, String sMessage ) {

    }

    @Override
    public void logInfo( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logInfo( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logInfo( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logInfo( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logInfo( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

    @Override
    public void logDebug( String sMethod ) {

    }

    @Override
    public void logDebug( String sMethod, String sMessage ) {

    }

    @Override
    public void logDebug( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logDebug( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logDebug( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logDebug( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logDebug( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

    @Override
    public void logTrace( String sMethod ) {

    }

    @Override
    public void logTrace( String sMethod, String sMessage ) {

    }

    @Override
    public void logTrace( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logTrace( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logTrace( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logTrace( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logTrace( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

    @Override
    public void logVerbose( String sMethod ) {

    }

    @Override
    public void logVerbose( String sMethod, String sMessage ) {

    }

    @Override
    public void logVerbose( String sMethod, String sMessage, Object oMethodArg ) {

    }

    @Override
    public void logVerbose( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {

    }

    @Override
    public void logVerbose( String sMethod, String sMessage, Object... oaParams ) {

    }

    @Override
    public void logVerbose( String sMethod, String sMessage, Throwable throwable ) {

    }

    @Override
    public void logVerbose( String sMethod, String sMessage, Throwable throwable, Object... oaParams ) {

    }

}
