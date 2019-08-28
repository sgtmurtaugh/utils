package de.ckraus.commons.logging;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} > ${PARAM}
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} > [${PARAM}, ${PARAM}, ${PARAM}]
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} < ${METHOD_PARAMS} ${EXCEPTION}
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} : ${METHOD_PARAMS} ${EXCEPTION}
 */
@Getter( AccessLevel.PROTECTED )
@Setter( AccessLevel.PROTECTED )
public abstract class LoggerBase implements Logger {

    protected static final String METHOD_ENTER = " > ";
    protected static final String METHOD_INSIDE = " : ";
    protected static final String METHOD_RETURN = " < ";

    protected static final String LOGLEVEL_DEBUG = "DEBUG";
    protected static final String LOGLEVEL_ERROR = "ERROR";
    protected static final String LOGLEVEL_FATAL = "FATAL";
    protected static final String LOGLEVEL_INFO = "INFO";
    protected static final String LOGLEVEL_TRACE = "TRACE";
    protected static final String LOGLEVEL_VERBOSE = "VERBOSE";
    protected static final String LOGLEVEL_WARN = "ERROR";

    protected static final String STATE_ABORT = "abort";
    protected static final String STATE_FAILURE = "failure";
    protected static final String STATE_MANDATORY = "mandatory";
    protected static final String STATE_START = "start";
    protected static final String STATE_STOP = "stop";
    protected static final String STATE_SUCCESS = "success";
    protected static final String STATE_TRYING = "trying";
    protected static final String STATE_UNKNOWN = "unknown";

    private int indent = 0;


    /**
     *
     * @param clazz
     */
    public LoggerBase( Class<?> clazz ) {
        super();
// TODO
    }

    /**
     *
     */
    void decrementIndent() {
        if (this.getIndent() > 0) {
            this.setIndent( this.getIndent() - 1 );
        }
    }

    /**
     *
     */
    void incrementIndent() {
        this.setIndent( this.getIndent() + 1 );
    }

    protected String getOutput() {
        this.getOutputLogLevel();
        this.getOutputPackage();
        this.getOutputClassname();
        this.getOutputIndent();
        this.getOutputMethodSeparator();
        this.getOutputMessage();
        // TODO State, Params, Exception etc....
        return null;
    }

}
