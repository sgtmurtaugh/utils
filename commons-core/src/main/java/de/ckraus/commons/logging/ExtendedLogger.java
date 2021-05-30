package de.ckraus.commons.logging;

public interface ExtendedLogger<T> extends Logger<T> {

    void logEnterSecret(String sMethod, Object oSecret);

    void logEnterSecret(String sMethod, Object oSecret, Object... aoMethodArgs);

    void logParamSecret(String sMethod, Object oParam);

    void logReturnSecret(String sMethod, Object oSecret);


    /* ### logging states ### */


    void logTrying(String sMethod, String sMessage);

    void logTrying(String sMethod, String sMessage, Object oMethodArg);

    void logTrying(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logTrying(String sMethod, String sMessage, Object... oaParams);

    void logFailure(String sMethod, String sMessage);

    void logFailure(String sMethod, String sMessage, Object oMethodArg);

    void logFailure(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logFailure(String sMethod, String sMessage, Object... oaParams);

    void logFailure(String sMethod, String sMessage, Throwable throwable);

    void logFailure(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logSuccess(String sMethod, String sMessage);

    void logSuccess(String sMethod, String sMessage, Object oMethodArg);

    void logSuccess(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logSuccess(String sMethod, String sMessage, Object... oaParams);

    void logSuccess(String sMethod, String sMessage, Throwable throwable);

    void logSuccess(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logAbort(String sMethod, String sMessage);

    void logAbort(String sMethod, String sMessage, Object oMethodArg);

    void logAbort(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logAbort(String sMethod, String sMessage, Object... oaParams);

    void logAbort(String sMethod, String sMessage, Throwable throwable);

    void logAbort(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logUnknown(String sMethod, String sMessage);

    void logUnknown(String sMethod, String sMessage, Object oMethodArg);

    void logUnknown(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logUnknown(String sMethod, String sMessage, Object... oaParams);

    void logUnknown(String sMethod, String sMessage, Throwable throwable);

    void logUnknown(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logStart(String sMethod, String sMessage);

    void logStart(String sMethod, String sMessage, Object oMethodArg);

    void logStart(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logStart(String sMethod, String sMessage, Object... oaParams);

    void logStart(String sMethod, String sMessage, Throwable throwable);

    void logStart(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

    void logStop(String sMethod, String sMessage);

    void logStop(String sMethod, String sMessage, Object oMethodArg);

    void logStop(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void logStop(String sMethod, String sMessage, Object... oaParams);

    void logStop(String sMethod, String sMessage, Throwable throwable);

    void logStop(String sMethod, String sMessage, Throwable throwable, Object... oaParams);

}
