package de.ckraus.commons.logging.javalog;

import de.ckraus.commons.logging.ExtendedLogger;
import lombok.NonNull;

import java.util.logging.Logger;

public class JavaLogExtendedLogger extends JavaLogLogger implements ExtendedLogger<Logger> {

    /**
     * Constructor
     *
     * @param clazz
     */
    public JavaLogExtendedLogger(@NonNull Class<?> clazz) {
        super(clazz);
    }


    @Override
    public void logEnterSecret(String sMethod, Object oSecret) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logEnterSecret(String sMethod, Object oSecret, Object... aoMethodArgs) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logParamSecret(String sMethod, Object oParam) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logReturnSecret(String sMethod, Object oSecret) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }


    @Override
    public void logAbort(String sMethod, String sMessage) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }


    @Override
    public void logFailure(String sMethod, String sMessage) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }


    @Override
    public void logStart(String sMethod, String sMessage) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warninging(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStart(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStart(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStop(String sMethod, String sMessage) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStop(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logStop(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }


    @Override
    public void logSuccess(String sMethod, String sMessage) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }


    @Override
    public void logTrying(String sMethod, String sMessage) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }


    @Override
    public void logUnknown(String sMethod, String sMessage) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warning(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

}
