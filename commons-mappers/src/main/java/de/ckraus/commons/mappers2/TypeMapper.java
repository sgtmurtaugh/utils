package de.ckraus.commons.mappers2;

import org.springframework.beans.factory.InitializingBean;

import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

@SuppressWarnings({ "javadoc", "unused" })
public interface TypeMapper<T> extends InitializingBean {

    /**
     * forType
     *
     * @return
     */
    Class<T> forType();

    /**
     * getDefaultValue
     *
     * @return
     */
    T getDefaultValue();

    /**
     * isTrimStrings
     *
     * @return
     */
    boolean isTrimString();

    /**
     * isEmptyStringNull
     *
     * @return
     */
    boolean isEmptyStringNull();

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
    String prepare(String s, boolean bTrim, boolean bEmptyIsNull);

    /**
     * evalPredicate
     *
     * @param predicate
     * @param t
     */
    boolean evalPredicate(Predicate<T> predicate, T t);

    /**
     * isMappable
     *
     * @param o
     *
     * @return
     */
    boolean isMappable(Object o);

    /**
     * mapObject
     *
     * @param obj
     *
     * @return
     */
    T mapObject(Object obj);

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    T mapObject(Object obj, T defaultValue);

    /**
     * map
     *
     * @param props parameter properties
     * @param key properties access key
     *
     * @return
     */
    T map(Properties props, String key);

    /**
     * map
     *
     * @param props parameter properties
     * @param key properties access key
     * @param defaultValue value used, when the given map is null, the key cannot be found in map, or the map
     *         value cannot be mapped to Number type
     *
     * @return
     */
    T map(Properties props, String key, T defaultValue);

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     *
     * @return
     */
    T map(Map<String, ?> map, String key);

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
    T map(Map<String, ?> map, String key, T defaultValue);

    /**
     * map
     *
     * @param t
     *
     * @return
     */
    T map(T t);

    /**
     * map
     *
     * @param t
     * @param defaultValue
     *
     * @return
     */
    T map(T t, T defaultValue);

    /**
     * map
     *
     * @param s - string to map
     *
     * @return
     */
    T map(String s);

    /**
     * map
     *
     * @param s - string to map
     * @param defaultValue
     *
     * @return
     */
    T map(String s, T defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     *
     * @return
     */
    T map(String s, boolean bTrim, boolean bEmptyIsNull);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return <p>This method should be overwritten individually.
     */
    T map(String s, boolean bTrim, boolean bEmptyIsNull, T defaultValue);

}
