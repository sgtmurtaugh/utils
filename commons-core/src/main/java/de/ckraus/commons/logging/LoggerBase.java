package de.ckraus.commons.logging;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * <ul>
 *   <li>{@code [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} > ${PARAM}}</li>
 *   <li>{@code [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} > [${PARAM}, ${PARAM}, ${PARAM}]}</li>
 *   <li>{@code [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} < ${METHOD_PARAMS} ${EXCEPTION}}</li>
 *   <li>{@code [${LOGLEVEL}] ${(TRIMMED)PACKAGE}.${CLASS}.${METHOD} ${IDENT} : ${METHOD_PARAMS} ${EXCEPTION}}</li>
 * </ul>
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PROTECTED)
public abstract class LoggerBase<T> implements Logger<T> {

    protected static final String METHOD_ENTER = " > ";
    protected static final String METHOD_INSIDE = " : ";
    protected static final String METHOD_RETURN = " < ";
    protected static final String METHOD_INDENT = " ";
    protected static final String METHOD_PARAM = " ";

    @Setter(AccessLevel.PUBLIC)
    private int indent = 0;

    @Setter(AccessLevel.NONE)
    private T logger;

    @Setter(AccessLevel.NONE)
    private Class<?> loggerClass;

    /**
     * Constructor
     *
     * @param clazz
     */
    protected LoggerBase(@NonNull Class<?> clazz) {
        super();
        this.loggerClass = clazz;
        this.logger = this.initLogger(clazz);
    }

    /**
     * Individual Logger initialization Method
     */
    protected abstract T initLogger(@NonNull Class<?> clazz);

    protected String buildLogMessage(String sMethod, String sSeparator, String sMessage) {
        StringBuilder sb = new StringBuilder();

/* TODO
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
        sb.append(this.getLoggerClass());

        // Method
        if (StringUtils.isNotEmpty(sMethod)) {
            sb.append(sMethod);
        }

        // Separator
        if (StringUtils.isNotEmpty(sSeparator)) {
            sb.append(sSeparator);
        }

        // Indent
        if (this.getIndent() > 0) {
            sb.append(METHOD_INDENT.repeat(this.getIndent()));
        }

        // Method
        if (StringUtils.isNotEmpty(sMessage)) {
            sb.append(sMessage);
        }

        return sb.toString();
    }

}
