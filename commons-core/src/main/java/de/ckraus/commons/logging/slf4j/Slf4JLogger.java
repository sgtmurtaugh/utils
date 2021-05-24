package de.ckraus.commons.logging.slf4j;

import de.ckraus.commons.logging.LoggerBase;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4JLogger extends LoggerBase<Logger> {

    /**
     * Constructor
     */
    public Slf4JLogger( @NonNull Class<?> clazz ) {
        super( clazz );
    }

    @Override
    protected Logger initLogger(@NonNull Class<?> clazz) {
        return LoggerFactory.getLogger( clazz );
    }


    @Override
    public void config( String sMethod ) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
        }
    }

    @Override
    public void config( String sMethod, String sMessage ) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
        }
    }

    @Override
    public void config( String sMethod, String sMessage, Object oMethodArg ) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
        }
    }

    @Override
    public void config( String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2 ) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
        }
    }

    @Override
    public void config( String sMethod, String sMessage, Object... oaParams ) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void config( String sMethod, String sMessage, Throwable throwable ) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
        }
    }

    @Override
    public void debug(String sMethod) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
        }
    }

    @Override
    public void debug(String sMethod, String sMessage) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
        }
    }

    @Override
    public void debug(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
        }
    }

    @Override
    public void debug(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
        }
    }

    @Override
    public void debug(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void debug(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
        }
    }

    @Override
    public void error(String sMethod) {
        if ( getLogger().isErrorEnabled() ) {
            this.getLogger().error( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
        }
    }

    @Override
    public void error(String sMethod, String sMessage) {
        if ( getLogger().isErrorEnabled() ) {
            this.getLogger().error( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
        }
    }

    @Override
    public void error(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isErrorEnabled() ) {
            this.getLogger().error( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
        }
    }

    @Override
    public void error(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isErrorEnabled() ) {
            this.getLogger().error( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
        }
    }

    @Override
    public void error(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isErrorEnabled() ) {
            this.getLogger().error( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void error(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isErrorEnabled() ) {
            this.getLogger().error( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
        }
    }

    @Override
    public void fatal(String sMethod) {
        this.error( sMethod );
    }

    @Override
    public void fatal(String sMethod, String sMessage) {
        this.error( sMethod, sMessage );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object oMethodArg) {
        this.error( sMethod, sMessage, oMethodArg );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.error( sMethod, sMessage, oMethodArg1, oMethodArg2 );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object... oaParams) {
        this.error( sMethod, sMessage, oaParams );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Throwable throwable) {
        this.error( sMethod, sMessage, throwable );
    }

    @Override
    public void info(String sMethod) {
        if ( getLogger().isInfoEnabled() ) {
            this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
        }
    }

    @Override
    public void info(String sMethod, String sMessage) {
        if ( getLogger().isInfoEnabled() ) {
            this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
        }
    }

    @Override
    public void info(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isInfoEnabled() ) {
            this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
        }
    }

    @Override
    public void info(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isInfoEnabled() ) {
            this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
        }
    }

    @Override
    public void info(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isInfoEnabled() ) {
            this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void info(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isInfoEnabled() ) {
            this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
        }
    }

    @Override
    public void param(String sMethod, @NonNull String sParamName, Object oParamValue) {
        if ( getLogger().isDebugEnabled() ) {
            this.getLogger().debug( this.buildLogMessage(sMethod, METHOD_INSIDE, sParamName + METHOD_PARAM + oParamValue ) );
        }
    }

    @Override
    public void trace(String sMethod) {
        if ( getLogger().isTraceEnabled() ) {
            this.getLogger().trace( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
        }
    }

    @Override
    public void trace(String sMethod, String sMessage) {
        if ( getLogger().isTraceEnabled() ) {
            this.getLogger().trace( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
        }
    }

    @Override
    public void trace(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isTraceEnabled() ) {
            this.getLogger().trace( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
        }
    }

    @Override
    public void trace(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isTraceEnabled() ) {
            this.getLogger().trace( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
        }
    }

    @Override
    public void trace(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isTraceEnabled() ) {
            this.getLogger().trace( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void trace(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isTraceEnabled() ) {
            this.getLogger().trace( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
        }
    }

    @Override
    public void verbose(String sMethod) {
        this.debug( sMethod );
    }

    @Override
    public void verbose(String sMethod, String sMessage) {
        this.debug( sMethod, sMessage );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object oMethodArg) {
        this.debug( sMethod, sMessage, oMethodArg );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.debug( sMethod, sMessage, oMethodArg1, oMethodArg2 );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object... oaParams) {
        this.debug( sMethod, sMessage, oaParams );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Throwable throwable) {
        this.debug( sMethod, sMessage, throwable );
    }

    @Override
    public void warn(String sMethod) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
        }
    }

    @Override
    public void warn(String sMethod, String sMessage) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
        }
    }

    @Override
    public void warn(String sMethod, String sMessage, Object oMethodArg) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
        }
    }

    @Override
    public void warn(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
        }
    }

    @Override
    public void warn(String sMethod, String sMessage, Object... oaParams) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
        }
    }

    @Override
    public void warn(String sMethod, String sMessage, Throwable throwable) {
        if ( getLogger().isWarnEnabled() ) {
            this.getLogger().warn( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
        }
    }

}
