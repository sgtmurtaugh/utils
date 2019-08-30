package de.ckraus.commons.logging;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} > ${PARAM}
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} > [${PARAM}, ${PARAM}, ${PARAM}]
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} < ${METHOD_PARAMS} ${EXCEPTION}
 * [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} : ${METHOD_PARAMS} ${EXCEPTION}
 */
@Getter( AccessLevel.PROTECTED )
@Setter( AccessLevel.PROTECTED )
public abstract class LoggerBase<T> implements Logger<T> {

    protected static final String METHOD_ENTER = " > ";
    protected static final String METHOD_INSIDE = " : ";
    protected static final String METHOD_RETURN = " < ";

    private int indent = 0;

    @Setter( AccessLevel.NONE )
    private T logger;

    /**
     *
     * @param clazz
     */
    public LoggerBase( @NonNull Class<?> clazz ) {
        super();
        this.logger = this.initLogger( clazz );
    }

    /**
     *
     */
    protected abstract T initLogger( @NonNull Class<?> clazz );


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

    protected String buildMessaged() {
        this.getOutputIndent();
        this.getOutputMethodSeparator();
        this.getOutputMessage();
        // TODO State, Params, Exception etc....
        return null;
    }

    @Override
    public void logEnter( String sMethod ) {
        this.doLog()
        this.incrementIndent();
    }

    private String prepareLogEnter( String sMethod ) {

    }

}
