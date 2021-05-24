package de.ckraus.commons.logging.console;

import de.ckraus.commons.logging.LoggerBase;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * fatal    logger.severe("Schwerwiegender Fehler");
 * error    logger.severe("Schwerwiegender Fehler");
 * warn     logger.warning("Warnung");
 * info     logger.info("Information");
 * config   logger.config("Konfigurationshinweis");
 * debug    logger.fine("Fein");
 * verbose  logger.finer("Feiner");
 * trace    logger.finest("Am feinsten");
 */
public class ConsoleLogger extends LoggerBase<Logger> {

    /**
     * Constructor
     */
    public ConsoleLogger(@NonNull Class<?> clazz ) {
        super( clazz );
    }

    @Override
    protected Logger initLogger(@NonNull Class<?> clazz) {
        return Logger.getLogger( clazz );
    }


    @Override
    public void debug(String sMethod) {
        this.getLogger().fine( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
    }

    @Override
    public void debug(String sMethod, String sMessage) {
        this.getLogger().fine( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
    }

    @Override
    public void debug(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().fine( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
    }

    @Override
    public void debug(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().fine( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
    }

    @Override
    public void debug(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().fine( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void debug(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().fine( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
    }

    @Override
    public void error(String sMethod) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
    }

    @Override
    public void error(String sMethod, String sMessage) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
    }

    @Override
    public void error(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
    }

    @Override
    public void error(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
    }

    @Override
    public void error(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void error(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
    }

    @Override
    public void fatal(String sMethod) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
    }

    @Override
    public void fatal(String sMethod, String sMessage) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void fatal(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().severe( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
    }

    @Override
    public void info(String sMethod) {
        this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
    }

    @Override
    public void info(String sMethod, String sMessage) {
        this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
    }

    @Override
    public void info(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
    }

    @Override
    public void info(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
    }

    @Override
    public void info(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void info(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().info( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
    }

    @Override
    public void param(String sMethod, @NonNull String sParamName , Object oParamValue) {
        this.getLogger().config( this.buildLogMessage(sMethod, METHOD_INSIDE, METHOD_PARAM ), sParamName + METHOD_PARAM + Objects.toString( oParamValue ) );
    }

    @Override
    public void trace(String sMethod) {
        this.getLogger().finest( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
    }

    @Override
    public void trace(String sMethod, String sMessage) {
        this.getLogger().finest( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
    }

    @Override
    public void trace(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().finest( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
    }

    @Override
    public void trace(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().finest( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
    }

    @Override
    public void trace(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().finest( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void trace(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().finest( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
    }

    @Override
    public void verbose(String sMethod) {
        this.trace( sMethod );
    }

    @Override
    public void verbose(String sMethod, String sMessage) {
        this.trace( sMethod, sMessage );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object oMethodArg) {
        this.trace( sMethod, sMessage, oMethodArg );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.trace( sMethod, sMessage, oMethodArg1, oMethodArg2 );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object... oaParams) {
        this.trace( sMethod, sMessage, oaParams );
    }

    @Override
    public void verbose(String sMethod, String sMessage, Throwable throwable) {
        this.trace( sMethod, sMessage, throwable );
    }

    @Override
    public void warn(String sMethod) {
        this.getLogger().warning( this.buildLogMessage(sMethod, METHOD_INSIDE, null ) );
    }

    @Override
    public void warn(String sMethod, String sMessage) {
        this.getLogger().warning( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ) );
    }

    @Override
    public void warn(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warning( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg );
    }

    @Override
    public void warn(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warning( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oMethodArg1, oMethodArg2 );
    }

    @Override
    public void warn(String sMethod, String sMessage, Object... oaParams) {
        StringUtils.join()
        this.getLogger().warning( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), oaParams );
    }

    @Override
    public void warn(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warning( this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage ), throwable );
    }

}
