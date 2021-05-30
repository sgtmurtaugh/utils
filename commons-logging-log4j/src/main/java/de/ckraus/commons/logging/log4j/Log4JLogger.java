package de.ckraus.commons.logging.log4j;

import de.ckraus.commons.logging.LoggerBase;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.util.Objects;

public class Log4JLogger extends LoggerBase<Logger> {

    /**
     * Constructor
     */
    public Log4JLogger(@NonNull Class<?> clazz) {
        super(clazz);
    }

    @Override
    protected Logger initLogger(@NonNull Class<?> clazz) {
        return Logger.getLogger(clazz);
    }


    @Override
    public void debug(String sMethod) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, null));
    }

    @Override
    public void debug(String sMethod, String sMessage) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage));
    }

    @Override
    public void debug(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg);
    }

    @Override
    public void debug(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg1, oMethodArg2);
    }

    @Override
    public void debug(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void debug(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), throwable);
    }

    @Override
    public void error(String sMethod) {
        this.getLogger().error(this.buildLogMessage(sMethod, METHOD_INSIDE, null));
    }

    @Override
    public void error(String sMethod, String sMessage) {
        this.getLogger().error(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage));
    }

    @Override
    public void error(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().error(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg);
    }

    @Override
    public void error(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().error(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg1, oMethodArg2);
    }

    @Override
    public void error(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().error(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void error(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().error(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), throwable);
    }

    @Override
    public void fatal(String sMethod) {
        this.getLogger().fatal(this.buildLogMessage(sMethod, METHOD_INSIDE, null));
    }

    @Override
    public void fatal(String sMethod, String sMessage) {
        this.getLogger().fatal(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage));
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().fatal(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg);
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().fatal(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg1, oMethodArg2);
    }

    @Override
    public void fatal(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().fatal(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void fatal(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().fatal(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), throwable);
    }

    @Override
    public void info(String sMethod) {
        this.getLogger().info(this.buildLogMessage(sMethod, METHOD_INSIDE, null));
    }

    @Override
    public void info(String sMethod, String sMessage) {
        this.getLogger().info(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage));
    }

    @Override
    public void info(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().info(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg);
    }

    @Override
    public void info(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().info(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg1, oMethodArg2);
    }

    @Override
    public void info(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().info(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void info(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().info(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), throwable);
    }

    @Override
    public void param(String sMethod, @NonNull String sParamName, Object oParamValue) {
        this.getLogger().debug(this.buildLogMessage(sMethod, METHOD_INSIDE, METHOD_PARAM),
                sParamName + METHOD_PARAM + Objects.toString(oParamValue));
    }

    @Override
    public void trace(String sMethod) {
        this.getLogger().trace(this.buildLogMessage(sMethod, METHOD_INSIDE, null));
    }

    @Override
    public void trace(String sMethod, String sMessage) {
        this.getLogger().trace(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage));
    }

    @Override
    public void trace(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().trace(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg);
    }

    @Override
    public void trace(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().trace(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg1, oMethodArg2);
    }

    @Override
    public void trace(String sMethod, String sMessage, Object... oaParams) {
        this.getLogger().trace(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void trace(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().trace(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), throwable);
    }

    @Override
    public void verbose(String sMethod) {
        this.trace(sMethod);
    }

    @Override
    public void verbose(String sMethod, String sMessage) {
        this.trace(sMethod, sMessage);
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object oMethodArg) {
        this.trace(sMethod, sMessage, oMethodArg);
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.trace(sMethod, sMessage, oMethodArg1, oMethodArg2);
    }

    @Override
    public void verbose(String sMethod, String sMessage, Object... oaParams) {
        this.trace(sMethod, sMessage, oaParams);
    }

    @Override
    public void verbose(String sMethod, String sMessage, Throwable throwable) {
        this.trace(sMethod, sMessage, throwable);
    }

    @Override
    public void warn(String sMethod) {
        this.getLogger().warn(this.buildLogMessage(sMethod, METHOD_INSIDE, null));
    }

    @Override
    public void warn(String sMethod, String sMessage) {
        this.getLogger().warn(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage));
    }

    @Override
    public void warn(String sMethod, String sMessage, Object oMethodArg) {
        this.getLogger().warn(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg);
    }

    @Override
    public void warn(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2) {
        this.getLogger().warn(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oMethodArg1, oMethodArg2);
    }

    @Override
    public void warn(String sMethod, String sMessage, Object... oaParams) {
        StringUtils.join() this.getLogger().warn(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), oaParams);
    }

    @Override
    public void warn(String sMethod, String sMessage, Throwable throwable) {
        this.getLogger().warn(this.buildLogMessage(sMethod, METHOD_INSIDE, sMessage), throwable);
    }

}
