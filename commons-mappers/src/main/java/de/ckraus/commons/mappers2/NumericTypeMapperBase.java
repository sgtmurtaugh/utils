package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Map;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public abstract class NumericTypeMapperBase<T extends Number> extends TypeMapperBase<T>
        implements NumericTypeMapper<T> {

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected NumericTypeMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     */
    protected NumericTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
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
    protected NumericTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings,
                                    boolean bEmptyStringNull) {
        super(clazzType, defaultValue, bTrimStrings, bEmptyStringNull);
    }

    /**
     * getDecimalFormat
     *
     * @return a DecimalFormat using the current locale
     */
    public DecimalFormat getDecimalFormat() {
        return this.getDecimalFormat((Locale) null);
    }

    /**
     * getDecimalFormat
     *
     * @param locale the locale to use for the format
     *
     * @return a DecimalFormat using the given locale
     */
    public DecimalFormat getDecimalFormat(Locale locale) {
        return this.getDecimalFormat(locale, null);
    }

    /**
     * getDecimalFormat
     *
     * @param locale the locale to use for the format
     * @param sPattern a non-localized pattern string.
     *
     * @return a DecimalFormat using the given locale and pattern string.
     */
    public DecimalFormat getDecimalFormat(Locale locale, String sPattern) {
        return this.getDecimalFormat(locale, sPattern, null);
    }

    /**
     * getDecimalFormat
     *
     * @param sPattern a non-localized pattern string.
     *
     * @return a DecimalFormat using the current locale and the given pattern string.
     */
    public DecimalFormat getDecimalFormat(String sPattern) {
        return this.getDecimalFormat(null, sPattern, null);
    }

    /**
     * getDecimalFormat
     *
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return a DecimalFormat using the current locale and the given pattern string and DecimalFormatSymbols.
     */
    public DecimalFormat getDecimalFormat(String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return this.getDecimalFormat(null, sPattern, decimalFormatSymbols);
    }

    /**
     * getDecimalFormat
     *
     * @param locale the locale to use for the format
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return a DecimalFormat using the given params
     */
    public DecimalFormat getDecimalFormat(Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        if (null == locale) {
            // Da unsere Systeme mit der default Locale (UK bzw. US) laufen, wir hier fix GERMANY als default definiert
            locale = Locale.GERMANY;
        }
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);

        if (null == decimalFormatSymbols) {
            decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        }
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);

        if (StringUtils.isNotEmpty(sPattern)) {
            decimalFormat.applyPattern(sPattern);
        }
        return decimalFormat;
    }

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    public T mapObject(Object obj, T defaultValue) {
        T t;

        if (null == obj) {
            t = defaultValue;
        }
        else if (obj instanceof Number) {
            t = this.map((Number) obj, defaultValue);
        }
        else if (obj instanceof String) {
            t = this.map((String) obj, defaultValue);
        }
        else {
            t = this.map(obj.toString(), defaultValue);
        }
        return t;
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, Locale locale) {
        return this.map(map, key, locale, (String) null);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, String sPattern) {
        return this.map(map, key, null, sPattern);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return this.map(map, key, locale, sPattern, (DecimalFormatSymbols) null);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, Locale locale, String sPattern,
                 DecimalFormatSymbols decimalFormatSymbols) {
        return this.map(map, key, locale, sPattern, decimalFormatSymbols, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return this.map(map, key, null, sPattern, decimalFormatSymbols);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    @Override
    public T map(Map<String, ?> map, String key, T defaultValue) {
        return this.map(map, key, (Locale) null, defaultValue);
    }

    /**
     * map
     *
     * @param sNumber the number string
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    @Override
    public T map(String sNumber) {
        return this.map(sNumber, (Locale) null);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    @Override
    public T map(String sNumber, T defaultValue) {
        return this.map(sNumber, (Locale) null, defaultValue);
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - public flag for string handling
     * @param bEmptyIsNull - public flag for empty string handling
     * @param defaultValue - The public value
     *
     * @return <p>Overrides {@link TypeMapper#map(String, boolean, boolean, Object)}. This implementation ignores the
     *         boolean flags and delegates to {@link #map(String, Number)}.
     */
    @Override
    public T map(String s, boolean bTrim, boolean bEmptyIsNull, T defaultValue) {
        return this.map(s, defaultValue);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, Locale locale, T defaultValue) {
        return this.map(map, key, locale, null, defaultValue);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, String sPattern, T defaultValue) {
        return this.map(map, key, null, sPattern, defaultValue);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, Locale locale, String sPattern, T defaultValue) {
        return this.map(map, key, locale, sPattern, null, defaultValue);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                 T defaultValue) {
        return this.map(map, key, null, sPattern, decimalFormatSymbols, defaultValue);
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    public T map(Map<String, ?> map, String key, Locale locale, String sPattern,
                 DecimalFormatSymbols decimalFormatSymbols, T defaultValue) {
        T retVal = defaultValue;

        if (MapUtils.isNotEmpty(map) && StringUtils.isNotEmpty(key) && map.containsKey(key)) {
            Object o = map.get(key);
            String s = null;

            if (o instanceof Number) {
                retVal = this.map((Number) o, defaultValue);
            }
            else {
                if (o != null) {
                    s = o.toString();
                }

                retVal = this.map(s, locale, sPattern, decimalFormatSymbols, defaultValue);
            }
        }
        return retVal;
    }

    /**
     * map
     *
     * @param number the number Object
     *
     * @return returns the typed Number otherwise the public value
     */
    @Override
    public T map(Number number) {
        return this.map(number, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param number the number Object
     *
     * @return returns the typed Number otherwise the public value
     */
    public T map(Number number, T defaultValue) {
        T returnValue = defaultValue;

        if (null != number) {
            returnValue = this.toType(number);
        }
        return returnValue;
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, Locale locale) {
        return this.map(sNumber, locale, (String) null);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, String sPattern) {
        return this.map(sNumber, null, sPattern);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, Locale locale, String sPattern) {
        return this.map(sNumber, locale, sPattern, (DecimalFormatSymbols) null);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return this.map(sNumber, locale, sPattern, decimalFormatSymbols, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return this.map(sNumber, null, sPattern, decimalFormatSymbols);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, Locale locale, T defaultValue) {
        return this.map(sNumber, locale, null, defaultValue);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, String sPattern, T defaultValue) {
        return this.map(sNumber, null, sPattern, defaultValue);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, Locale locale, String sPattern, T defaultValue) {
        return this.map(sNumber, locale, sPattern, null, defaultValue);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols, T defaultValue) {
        return this.map(sNumber, null, sPattern, decimalFormatSymbols, defaultValue);
    }

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T map(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                 T defaultValue) {
        return this.parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber) {
        return this.parse(sNumber, (Locale) null);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, Locale locale) {
        return this.parse(sNumber, locale, (String) null);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, String sPattern) {
        return this.parse(sNumber, null, sPattern);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, Locale locale, String sPattern) {
        return this.parse(sNumber, locale, sPattern, (DecimalFormatSymbols) null);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return this.parse(sNumber, locale, sPattern, decimalFormatSymbols, this.getDefaultValue());
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return this.parse(sNumber, null, sPattern, decimalFormatSymbols);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, T defaultValue) {
        return this.parse(sNumber, (Locale) null, defaultValue);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, Locale locale, T defaultValue) {
        return this.parse(sNumber, locale, null, defaultValue);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, String sPattern, T defaultValue) {
        return this.parse(sNumber, null, sPattern, defaultValue);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, Locale locale, String sPattern, T defaultValue) {
        return this.parse(sNumber, locale, sPattern, null, defaultValue);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols, T defaultValue) {
        return this.parse(sNumber, null, sPattern, decimalFormatSymbols, defaultValue);
    }

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue public value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the public value
     */
    public T parse(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                   T defaultValue) {
        T returnValue = defaultValue;
        String preparedString = this.prepare(sNumber, this.isTrimString(), this.isEmptyStringNull());

        if (StringUtils.isNotEmpty(preparedString)) {
            DecimalFormat decimalFormat = this.getDecimalFormat(locale, sPattern, decimalFormatSymbols);

            try {
                decimalFormat.setParseBigDecimal(true);
                BigDecimal bigDecimal = (BigDecimal) decimalFormat.parse(preparedString);

                if (null != bigDecimal) {
                    returnValue = this.toType(bigDecimal);
                }
            }
            catch (ParseException pe) {
                // ignore Exception!
            }
        }
        return returnValue;
    }

}
