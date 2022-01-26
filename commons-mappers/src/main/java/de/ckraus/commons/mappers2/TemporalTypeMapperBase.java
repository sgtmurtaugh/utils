package de.ckraus.commons.mappers2;

import de.ckraus.commons.mappers.TemporalTypeMapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.util.Locale;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public abstract class TemporalTypeMapperBase<T extends Temporal> extends TypeMapperBase<T>
        implements TemporalTypeMapper<T> {

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected TemporalTypeMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     */
    protected TemporalTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
        super(clazzType, defaultValue);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected TemporalTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings,
                                     boolean bEmptyStringNull) {
        super(clazzType, defaultValue, bTrimStrings, bEmptyStringNull);
    }

    /**
     * map
     *
     * @param s
     * @param formatter
     *
     * @return
     */
    public T map(String s, DateTimeFormatter formatter) {
        return this.map(s, formatter, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s
     * @param formatStyle
     *
     * @return
     */
    public T map(String s, FormatStyle formatStyle) {
        return this.map(s, formatStyle, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s
     * @param sPattern
     *
     * @return
     */
    public T map(String s, String sPattern) {
        return this.map(s, sPattern, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s
     * @param sPattern
     * @param defaultValue
     *
     * @return
     */
    public T map(String s, String sPattern, T defaultValue) {
        return this.map(s, sPattern, null, defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param sPattern
     * @param locale
     *
     * @return
     */
    public T map(String s, String sPattern, Locale locale) {
        return this.map(s, sPattern, locale, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s
     * @param sPattern
     * @param locale
     * @param defaultValue
     *
     * @return
     */
    public T map(String s, String sPattern, Locale locale, T defaultValue) {
        DateTimeFormatter formatter = null;

        if (StringUtils.isNotEmpty(sPattern)) {
            try {
                if (null == locale) {
                    formatter = DateTimeFormatter.ofPattern(sPattern);
                }
                else {
                    formatter = DateTimeFormatter.ofPattern(sPattern, locale);
                }
            }
            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }

        return this.map(s, formatter, defaultValue);
    }

}
