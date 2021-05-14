package de.ckraus.commons.logging.log4j;

import de.ckraus.commons.logging.ExtendedLogger;
import lombok.NonNull;
import org.apache.log4j.Logger;

public class Log4JExtendedLogger extends Log4JLogger implements ExtendedLogger<Logger> {

    /**
     * Constructor
     * @param clazz
     */
    public Log4JExtendedLogger(@NonNull Class<?> clazz ) {
        super( clazz );
    }


    @Override
    public void logEnterSecret(String sMethod, Object oSecret) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logEnterSecret(String sMethod, Object oSecret, Object... aoMethodArgs) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logParamSecret(String sMethod, Object oParam) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logReturnSecret(String sMethod, Object oSecret) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }


    @Override
    public void logAbort(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }


    @Override
    public void logFailure(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }


    @Override
    public void logStart(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStart(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStart(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStop(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStop(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logStop(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }


    @Override
    public void logSuccess(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }


    @Override
    public void logTrying(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }


    @Override
    public void logUnknown(String sMethod, String sMessage) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

}
