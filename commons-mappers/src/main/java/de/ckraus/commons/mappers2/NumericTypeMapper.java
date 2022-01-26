package de.ckraus.commons.mappers2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;

@SuppressWarnings({ "javadoc", "unused" })
public interface NumericTypeMapper<E extends Number> extends TypeMapper<E> {

    /**
     * toType
     *
     * @param number
     *
     * @return
     */
    E toType(Number number);

    /**
     * getDecimalFormat
     *
     * @return a DecimalFormat using the current locale
     */
    DecimalFormat getDecimalFormat();

    /**
     * getDecimalFormat
     *
     * @param locale the locale to use for the format
     *
     * @return a DecimalFormat using the given locale
     */
    DecimalFormat getDecimalFormat(Locale locale);

    /**
     * getDecimalFormat
     *
     * @param locale the locale to use for the format
     * @param sPattern a non-localized pattern string.
     *
     * @return a DecimalFormat using the given locale and pattern string.
     */
    DecimalFormat getDecimalFormat(Locale locale, String sPattern);

    /**
     * getDecimalFormat
     *
     * @param sPattern a non-localized pattern string.
     *
     * @return a DecimalFormat using the current locale and the given pattern string.
     */
    DecimalFormat getDecimalFormat(String sPattern);

    /**
     * getDecimalFormat
     *
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return a DecimalFormat using the current locale and the given pattern string and DecimalFormatSymbols.
     */
    DecimalFormat getDecimalFormat(String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * getDecimalFormat
     *
     * @param locale the locale to use for the format
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return a DecimalFormat using the given params
     */
    DecimalFormat getDecimalFormat(Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    E mapObject(Object obj, E defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     *
     * @return
     */
    E map(Map<String, ?> map, String key, Locale locale);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     *
     * @return
     */
    E map(Map<String, ?> map, String key, String sPattern);

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
    E map(Map<String, ?> map, String key, Locale locale, String sPattern);

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
    E map(Map<String, ?> map, String key, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

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
    E map(Map<String, ?> map, String key, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    @Override
    E map(Map<String, ?> map, String key, E defaultValue);

    /**
     * map
     *
     * @param sNumber the number string
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    @Override
    E map(String sNumber);

    /**
     * map
     *
     * @param sNumber the number string
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    @Override
    E map(String sNumber, E defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return <p>Overrides {@link TypeMapper#map(String, boolean, boolean, Object)}. This implementation ignores the
     *         boolean flags and delegates to {@link #map(String, Number)}.
     */
    @Override
    E map(String s, boolean bTrim, boolean bEmptyIsNull, E defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    E map(Map<String, ?> map, String key, Locale locale, E defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    E map(Map<String, ?> map, String key, String sPattern, E defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    E map(Map<String, ?> map, String key, Locale locale, String sPattern, E defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    E map(Map<String, ?> map, String key, String sPattern, DecimalFormatSymbols decimalFormatSymbols, E defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    E map(Map<String, ?> map, String key, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
          E defaultValue);

    /**
     * map
     *
     * @param number the number Object
     *
     * @return returns the typed Number otherwise the value
     */
    @Override
    E map(Number number);

    /**
     * map
     *
     * @param number the number Object
     *
     * @return returns the typed Number otherwise the value
     */
    E map(Number number, E defaultValue);

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, Locale locale);

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, String sPattern);

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, Locale locale, String sPattern);

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, Locale locale, E defaultValue);

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, String sPattern, E defaultValue);

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, Locale locale, String sPattern, E defaultValue);

    /**
     * map
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols, E defaultValue);

    /**
     * map
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E map(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols, E defaultValue);

    /**
     * unformat
     *
     * @param sNumber the number string
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, Locale locale);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, String sPattern);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, Locale locale, String sPattern);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, E defaultValue);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, Locale locale, E defaultValue);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, String sPattern, E defaultValue);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, Locale locale, String sPattern, E defaultValue);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols, E defaultValue);

    /**
     * unformat
     *
     * @param sNumber the number string
     * @param locale the locale to use for the format.
     * @param sPattern a non-localized pattern string.
     * @param decimalFormatSymbols symbols the set of symbols to be used
     * @param defaultValue value used, when sNumber is null or cannot be mapped
     *
     * @return the unformatted Number-String as Number otherwise the value
     */
    E parse(String sNumber, Locale locale, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
            E defaultValue);

}
