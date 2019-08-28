package de.ckraus.commons.logging;

import java.util.Collection;
import java.util.List;

public interface Logger {

    /* ### method logging ### */

    void logEnter(String sMethod);
    void logEnter(String sMethod, Object... aoMethodArgs);

    void logEnterSecret(String sMethod, Object oSecret);
    void logEnterSecret(String sMethod, Object oSecret, Object... aoMethodArgs);

    void logParam(String sMethod, Object oParam);
    void logParamSecret(String sMethod, Object oParam);

    void logReturn(String sMethod);
    void logReturn(String sMethod, Object oReturn);
    void logReturn(String sMethod, Collection<?> collReturn);
    void logReturnSecret(String sMethod, Object oSecret);

    /* ### loglevel logging ### */

    void logFatal(String sMethod);
    void logFatal(String sMethod, String sMessage);
    void logFatal(String sMethod, String sMessage, Object... oaParams);
    void logFatal(String sMethod, String sMessage, Throwable throwable);
    void logFatal(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logError(String sMethod);
    void logError(String sMethod, String sMessage);
    void logError(String sMethod, String sMessage, Object... oaParams);
    void logError(String sMethod, String sMessage, Throwable throwable);
    void logError(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logWarn(String sMethod);
    void logWarn(String sMethod, String sMessage);
    void logWarn(String sMethod, String sMessage, Object... oaParams);
    void logWarn(String sMethod, String sMessage, Throwable throwable);
    void logWarn(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logInfo(String sMethod);
    void logInfo(String sMethod, String sMessage);
    void logInfo(String sMethod, String sMessage, Object... oaParams);
    void logInfo(String sMethod, String sMessage, Throwable throwable);
    void logInfo(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logDebug(String sMethod);
    void logDebug(String sMethod, String sMessage);
    void logDebug(String sMethod, String sMessage, Object... oaParams);
    void logDebug(String sMethod, String sMessage, Throwable throwable);
    void logDebug(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logTrace(String sMethod);
    void logTrace(String sMethod, String sMessage);
    void logTrace(String sMethod, String sMessage, Object... oaParams);
    void logTrace(String sMethod, String sMessage, Throwable throwable);
    void logTrace(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logVerbose(String sMethod);
    void logVerbose(String sMethod, String sMessage);
    void logVerbose(String sMethod, String sMessage, Object... oaParams);
    void logVerbose(String sMethod, String sMessage, Throwable throwable);
    void logVerbose(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    /* ### logging states ### */

    void logTrying(String sMethod, String sMessage);
    void logTrying(String sMethod, String sMessage, Object... oaParams);

    void logFailure(String sMethod, String sMessage);
    void logFailure(String sMethod, String sMessage, Object... oaParams);
    void logFailure(String sMethod, String sMessage, Throwable throwable);
    void logFailure(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logSuccess(String sMethod, String sMessage);
    void logSuccess(String sMethod, String sMessage, Object... oaParams);
    void logSuccess(String sMethod, String sMessage, Throwable throwable);
    void logSuccess(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logAbort(String sMethod, String sMessage);
    void logAbort(String sMethod, String sMessage, Object... oaParams);
    void logAbort(String sMethod, String sMessage, Throwable throwable);
    void logAbort(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logUnknown(String sMethod, String sMessage);
    void logUnknown(String sMethod, String sMessage, Object... oaParams);
    void logUnknown(String sMethod, String sMessage, Throwable throwable);
    void logUnknown(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logStart(String sMethod, String sMessage);
    void logStart(String sMethod, String sMessage, Object... oaParams);
    void logStart(String sMethod, String sMessage, Throwable throwable);
    void logStart(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logStop(String sMethod, String sMessage);
    void logStop(String sMethod, String sMessage, Object... oaParams);
    void logStop(String sMethod, String sMessage, Throwable throwable);
    void logStop(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

}
