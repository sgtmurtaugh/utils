package de.ckraus.commons.logging.slf4j;

import de.ckraus.commons.logging.ExtendedLogger;
import lombok.NonNull;
import org.slf4j.Logger;

public class Slf4JExtendedLogger extends Slf4JLogger implements ExtendedLogger<Logger> {

    /**
     * Constructor
     * @param clazz
     */
    public Slf4JExtendedLogger(@NonNull Class<?> clazz ) {
        super( clazz );
    }


    @Override
    public void logEnterSecret(String sMethod, Object oSecret) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, null ), oSecret );
        }
    }

    @Override
    public void logEnterSecret(String sMethod, Object oSecret, Object... aoMethodArgs) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logParamSecret(String sMethod, Object oParam) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logReturnSecret(String sMethod, Object oSecret) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }


    @Override
    public void logAbort(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logAbort(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }


    @Override
    public void logFailure(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logFailure(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }


    @Override
    public void logStart(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStart(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStart(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStart(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStop(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStop(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStop(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logStop(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }


    @Override
    public void logSuccess(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logSuccess(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }


    @Override
    public void logTrying(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logTrying(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }


    @Override
    public void logUnknown(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void logUnknown(String sMethod, String sMessage, Throwable throwable, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

}
