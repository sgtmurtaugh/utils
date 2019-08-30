package de.ckraus.commons.logging;

import java.util.Collection;

public interface Logger<T> {


    T getLogger();


    /* ### method logging ### */

    void logEnter( String sMethod );

    void logEnter( String sMethod, Object oMethodArg );

    void logEnter( String sMethod, Object oMethodArg1, Object oMethodArg2 );

    void logEnter( String sMethod, Object... aoMethodArgs );

    void logParam( String sMethod, Object oParam );

    void logReturn( String sMethod );

    void logReturn( String sMethod, Object oReturn );

    void logReturn( String sMethod, Collection<?> collReturn );

    /* ### loglevel logging ### */

    void logFatal( String sMethod );

    void logFatal( String sMethod, String sMessage );

    void logFatal( String sMethod, String sMessage, Object oMethodArg );

    void logFatal( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logFatal( String sMethod, String sMessage, Object... oaParams );

    void logFatal( String sMethod, String sMessage, Throwable throwable );

    void logFatal( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

    void logError( String sMethod );

    void logError( String sMethod, String sMessage );

    void logError( String sMethod, String sMessage, Object oMethodArg );

    void logError( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logError( String sMethod, String sMessage, Object... oaParams );

    void logError( String sMethod, String sMessage, Throwable throwable );

    void logError( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

    void logWarn( String sMethod );

    void logWarn( String sMethod, String sMessage );

    void logWarn( String sMethod, String sMessage, Object oMethodArg );

    void logWarn( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logWarn( String sMethod, String sMessage, Object... oaParams );

    void logWarn( String sMethod, String sMessage, Throwable throwable );

    void logWarn( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

    void logInfo( String sMethod );

    void logInfo( String sMethod, String sMessage );

    void logInfo( String sMethod, String sMessage, Object oMethodArg );

    void logInfo( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logInfo( String sMethod, String sMessage, Object... oaParams );

    void logInfo( String sMethod, String sMessage, Throwable throwable );

    void logInfo( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

    void logDebug( String sMethod );

    void logDebug( String sMethod, String sMessage );

    void logDebug( String sMethod, String sMessage, Object oMethodArg );

    void logDebug( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logDebug( String sMethod, String sMessage, Object... oaParams );

    void logDebug( String sMethod, String sMessage, Throwable throwable );

    void logDebug( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

    void logTrace( String sMethod );

    void logTrace( String sMethod, String sMessage );

    void logTrace( String sMethod, String sMessage, Object oMethodArg );

    void logTrace( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logTrace( String sMethod, String sMessage, Object... oaParams );

    void logTrace( String sMethod, String sMessage, Throwable throwable );

    void logTrace( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

    void logVerbose( String sMethod );

    void logVerbose( String sMethod, String sMessage );

    void logVerbose( String sMethod, String sMessage, Object oMethodArg );

    void logVerbose( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 );

    void logVerbose( String sMethod, String sMessage, Object... oaParams );

    void logVerbose( String sMethod, String sMessage, Throwable throwable );

    void logVerbose( String sMethod, String sMessage, Throwable throwable, Object... oaParams );

}
