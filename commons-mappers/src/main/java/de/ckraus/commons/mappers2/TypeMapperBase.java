package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc" })
public abstract class TypeMapperBase<T> implements TypeMapper<T> {

    public static final boolean DEFAULT_EMPTY_STRING_NULL = Boolean.TRUE;
    public static final boolean DEFAULT_TRIM_STRING = Boolean.TRUE;

    @Getter(AccessLevel.NONE)
    private final Class<T> clazzType;
    private final T defaultValue;

    private final boolean emptyStringNull;
    private final boolean trimString;

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected TypeMapperBase(@NonNull Class<T> clazzType) {
        this(clazzType, null);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     */
    protected TypeMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
        this(clazzType, defaultValue, DEFAULT_TRIM_STRING, DEFAULT_EMPTY_STRING_NULL);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected TypeMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings,
                             boolean bEmptyStringNull) {
        super();

        //this.forType =
        this.clazzType = clazzType;
        this.defaultValue = defaultValue;
        this.trimString = bTrimStrings;
        this.emptyStringNull = bEmptyStringNull;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    /**
     * @return
     */
    public Class<T> forType() {
        return this.clazzType;
    }

    /**
     * getDefaultValue
     *
     * @return
     */
    public T getDefaultValue() {
        return defaultValue;
    }

    /**
     * isTrimStrings
     *
     * @return
     */
    public boolean isTrimString() {
        return trimString;
    }

    /**
     * isEmptyStringNull
     *
     * @return
     */
    public boolean isEmptyStringNull() {
        return emptyStringNull;
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
    public String prepare(String s, boolean bTrim, boolean bEmptyIsNull) {
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
    public boolean evalPredicate(Predicate<T> predicate, T t) {
        boolean bSuccess = false;

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
    public boolean isMappable(Object o) {
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
    public T mapObject(Object obj) {
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
    public T mapObject(Object obj, T defaultValue) {
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
     * @param props parameter properties
     * @param key properties access key
     *
     * @return
     */
    public T map(Properties props, String key) {
        return this.map(props, key, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param props parameter properties
     * @param key properties access key
     * @param defaultValue public value used, when the given map is null, the key cannot be found in map, or the
     *         map value cannot be mapped to Number type
     *
     * @return
     */
    public T map(Properties props, String key, T defaultValue) {
        T retVal = defaultValue;

        if (MapUtils.isNotEmpty(props) && StringUtils.isNotEmpty(key) && props.containsKey(key)) {
            retVal = this.mapObject(props.get(key), defaultValue);
        }
        return retVal;
    }

    /**
     * map
     *
     * @param map parameter map
     * @param key map access key
     *
     * @return
     */
    public T map(Map<String, ?> map, String key) {
        return this.map(map, key, this.getDefaultValue());
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
    public T map(Map<String, ?> map, String key, T defaultValue) {
        T retVal = defaultValue;

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
    public T map(T t) {
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
    public T map(T t, T defaultValue) {
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
    public T map(String s) {
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
    public T map(String s, T defaultValue) {
        return this.map(s, this.isTrimString(), this.isEmptyStringNull(), defaultValue);
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - public flag for string handling
     * @param bEmptyIsNull - public flag for empty string handling
     *
     * @return
     */
    public T map(String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.map(s, bTrim, bEmptyIsNull, this.getDefaultValue());
    }

}
