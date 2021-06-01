package de.ckraus.commons.mapper;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.function.Predicate;

@SuppressWarnings({ "javadoc", "unused" })
public interface TypeMapper<T> {

    /**
     * forType
     * @return
     */
    Class<T> forType();

    /**
     * getDefaultValue
     *
     * @return
     */
    default T getDefaultValue() {
        return null;
    }

    /**
     * isTrimStrings
     *
     * @return
     */
    default boolean isTrimStrings() {
        return Boolean.TRUE;
    }

    /**
     * isEmptyStringNull
     *
     * @return
     */
    default boolean isEmptyStringNull() {
        return Boolean.TRUE;
    }

    /**
     * prepare
     *
     * @param s the string to prepare if necessary
     * @param bTrim flag for trimming the string
     * @param bEmptyIsNull flag for using null, when the given string is empty
     *
     * @return a prepared String for mapping. The flags are evaluated and the string is reworked if necessary. When the
     *         trim param is true, trim is performed on the string. When the string is empty and the emptyIsNull param
     *         is true, null will be returned.
     */
    default String prepare(String s, boolean bTrim, boolean bEmptyIsNull) {
        String sRetVal = s;

        if (null != sRetVal) {
            if (bTrim) {
                sRetVal = sRetVal.trim();
            }
            if (bEmptyIsNull && sRetVal.isEmpty()) {
                sRetVal = null;
            }

        }
        return sRetVal;
    }

    /**
     * evalPredicate
     *
     * @param predicate
     * @param t
     */
    default boolean evalPredicate(Predicate<T> predicate, T t) {
        var bSuccess = false;

        if (null != predicate) {
            bSuccess = predicate.test(t);
        }
        return bSuccess;
    }

    /**
     * isMappable
     *
     * @param o
     *
     * @return
     */
    default boolean isMappable(Object o) {
        boolean bIsMappable;

        if (null == o) {
            bIsMappable = false;
        }
        else if (o instanceof String) {
            bIsMappable = (null != this.map((String) o, null));
        }
        else {
            bIsMappable = this.isMappable(o.toString());
        }
        return bIsMappable;
    }

    /**
     * mapObject
     *
     * @param obj
     *
     * @return
     */
    default T mapObject(Object obj) {
        return this.mapObject(obj, this.getDefaultValue());
    }

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    default T mapObject(Object obj, T defaultValue) {
        T t;

        if (null == obj) {
            t = defaultValue;
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
     *
     * @return
     */
    default T map(Map<String, ?> map, String key) {
        return this.map(map, key, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     * @param defaultValue default value used, when the given map is null, the key cannot be found in map, or
     *         the map value cannot be mapped to Number type
     *
     * @return
     */
    default T map(Map<String, ?> map, String key, T defaultValue) {
        var retVal = defaultValue;

        if (MapUtils.isNotEmpty(map) && StringUtils.isNotEmpty(key) && map.containsKey(key)) {
            retVal = this.mapObject(map.get(key), defaultValue);
        }
        return retVal;
    }

    /**
     * map
     *
     * @param t
     *
     * @return
     */
    default T map(T t) {
        return this.map(t, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param t
     * @param defaultValue
     *
     * @return
     */
    default T map(T t, T defaultValue) {
        return (null != t
                        ? t
                        : defaultValue);
    }

    /**
     * map
     *
     * @param s - string to map
     *
     * @return
     */
    default T map(String s) {
        return this.map(s, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s - string to map
     * @param defaultValue
     *
     * @return
     */
    default T map(String s, T defaultValue) {
        return this.map(s, this.isTrimStrings(), this.isEmptyStringNull(), defaultValue);
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     *
     * @return
     */
    default T map(String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.map(s, bTrim, bEmptyIsNull, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>This method should be overwritten individually.
     */
    T map(String s, boolean bTrim, boolean bEmptyIsNull, T defaultValue);

}
