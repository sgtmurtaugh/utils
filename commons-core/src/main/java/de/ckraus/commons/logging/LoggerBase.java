package de.ckraus.commons.logging;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.stream.Stream;

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

    @Setter( AccessLevel.NONE )
    private Class<?> loggerClass;

    /**
     *
     * @param clazz
     */
    public LoggerBase( @NonNull Class<?> clazz ) {
        super();
        this.loggerClass = clazz;
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

    protected String buildLogMessage(String sMethod, String sSeparator, String sMessage) {
        StringBuilder sb = new StringBuilder();

/*
        // package
        sb.append( this.getLoggerClass().getPackage() );

        // classname
        if (sb.length() > 0
                && '.' >= sb.charAt( sb.length()-1 ) ) {

            sb.append( '.' );
        }
        sb.append( this.getLoggerClass().getSimpleName() );
*/
        // Class
        sb.append( this.getLoggerClass() );

        // Method
        if ( StringUtils.isNotEmpty( sMethod ) ) {
            sb.append( sMethod );
        }

        // Separator with indent
        if ( null == sSeparator ) {
            sSeparator = "";
        }
        if ( StringUtils.isNotEmpty( sSeparator ) ) {
            sb.append( sSeparator.indent( this.getIndent()*2 ) );
        }

        // Method
        if ( StringUtils.isNotEmpty( sMessage ) ) {
            sb.append( sMessage );
        }

        return sb.toString();
    }

    protected void doEnter() {
        this.incrementIndent();
    }

    protected void doReturn() {
        this.decrementIndent();
    }

    @Override
    public void logEnter( String sMethod ) {
        this.logDebug( sMethod );
        this.doEnter();
    }

    @Override
    public void logEnter( String sMethod, Object oMethodArg ) {
        this.logDebug( sMethod, null, oMethodArg );
        this.doEnter();
    }

    @Override
    public void logEnter( String sMethod, Object oMethodArg1, Object oMethodArg2 ) {
        this.logDebug( sMethod, null, oMethodArg1, oMethodArg2 );
        this.doEnter();
    }

    @Override
    public void logEnter( String sMethod, Object... aoMethodArg ) {
        this.logDebug( sMethod, null, aoMethodArg );
        this.doEnter();
    }

    @Override
    public void logReturn( String sMethod ) {
        this.doEnter();
    }

    @Override
    public void logReturn( String sMethod, Collection<?> colMethodReturn ) {
        this.doReturn();
        this.logDebug( sMethod, null, colMethodReturn );
    }

    @Override
    public void logReturn( String sMethod, Object oMethodReturn ) {
        this.doReturn();
        this.logDebug( sMethod, null, oMethodReturn );
    }

    private String prepareLogEnter( String sMethod ) {
//TODO
    }

}