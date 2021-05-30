package de.ckraus.commons.logging;

import java.util.Collection;

@SuppressWarnings("unused")
public interface Logger<T> {

    Class<?> getLoggerClass();

    T getLogger();

    int getIndent();

    void setIndent(int indent);

    private void decrementIndent() {
        if (this.getIndent() > 0) {
            this.setIndent(this.getIndent() - 1);
        }
    }

    private void incrementIndent() {
        this.setIndent(this.getIndent() + 1);
    }

    private void doEnter() {
        this.incrementIndent();
    }

    private void doReturn() {
        this.decrementIndent();
    }


    /* ### method logging ### */

    default void enter(String sMethod) {
        this.debug(sMethod);
        this.doEnter();
    }

    default void enter(String sMethod, Object oMethodArg) {
        this.debug(sMethod, null, oMethodArg);
        this.doEnter();
    }

    default void enter(String sMethod, Object oMethodArg1, Object oMethodArg2) {
        this.debug(sMethod, null, oMethodArg1, oMethodArg2);
        this.doEnter();
    }

    default void enter(String sMethod, Object... aoMethodArg) {
        this.debug(sMethod, null, aoMethodArg);
        this.doEnter();
    }

    void param(String sMethod, String sParamName, Object oParamValue);

    default void returnal(String sMethod) {
        this.doEnter();
    }

    default void returnal(String sMethod, Collection<?> colMethodReturn) {
        this.doReturn();
        this.debug(sMethod, null, colMethodReturn);
    }

    default void returnal(String sMethod, Object oMethodReturn) {
        this.doReturn();
        this.debug(sMethod, null, oMethodReturn);
    }

    /* ### loglevel logging ### */

    void config(String sMethod);

    void config(String sMethod, String sMessage);

    void config(String sMethod, String sMessage, Object oMethodArg);

    void config(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void config(String sMethod, String sMessage, Object... oaParams);

    void config(String sMethod, String sMessage, Throwable throwable);

    void debug(String sMethod);

    void debug(String sMethod, String sMessage);

    void debug(String sMethod, String sMessage, Object oMethodArg);

    void debug(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void debug(String sMethod, String sMessage, Object... oaParams);

    void debug(String sMethod, String sMessage, Throwable throwable);

    void error(String sMethod);

    void error(String sMethod, String sMessage);

    void error(String sMethod, String sMessage, Object oMethodArg);

    void error(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void error(String sMethod, String sMessage, Object... oaParams);

    void error(String sMethod, String sMessage, Throwable throwable);

    void fatal(String sMethod);

    void fatal(String sMethod, String sMessage);

    void fatal(String sMethod, String sMessage, Object oMethodArg);

    void fatal(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void fatal(String sMethod, String sMessage, Object... oaParams);

    void fatal(String sMethod, String sMessage, Throwable throwable);

    void info(String sMethod);

    void info(String sMethod, String sMessage);

    void info(String sMethod, String sMessage, Object oMethodArg);

    void info(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void info(String sMethod, String sMessage, Object... oaParams);

    void info(String sMethod, String sMessage, Throwable throwable);

    void trace(String sMethod);

    void trace(String sMethod, String sMessage);

    void trace(String sMethod, String sMessage, Object oMethodArg);

    void trace(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void trace(String sMethod, String sMessage, Object... oaParams);

    void trace(String sMethod, String sMessage, Throwable throwable);

    void verbose(String sMethod);

    void verbose(String sMethod, String sMessage);

    void verbose(String sMethod, String sMessage, Object oMethodArg);

    void verbose(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void verbose(String sMethod, String sMessage, Object... oaParams);

    void verbose(String sMethod, String sMessage, Throwable throwable);

    void warn(String sMethod);

    void warn(String sMethod, String sMessage);

    void warn(String sMethod, String sMessage, Object oMethodArg);

    void warn(String sMethod, String sMessage, Object oMethodArg1, Object oMethodArg2);

    void warn(String sMethod, String sMessage, Object... oaParams);

    void warn(String sMethod, String sMessage, Throwable throwable);

}
