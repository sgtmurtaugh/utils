package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component("characterMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class CharArrayMapperImpl extends TypeMapperBase<char[]> implements CharArrayMapper {

    public static final boolean DEFAULT_REMOVE_CHAR_DELIMITERS_IN_PROPERTIES = Boolean.TRUE;
    public static final boolean DEFAULT_REMOVE_CHAR_DELIMITERS_IN_STRINGS = Boolean.TRUE;

    public static final String DEFAULT_REGEX_CHAR_DELIMITERS = "[,; ]";

    private String regExCharDelimiters = DEFAULT_REGEX_CHAR_DELIMITERS;

    /**
     * Constructor
     */
    CharArrayMapperImpl() {
        this(null);
    }

    /**
     * Constructor
     */
    CharArrayMapperImpl(char[] defaultValue) {
        super(char[].class, defaultValue);
    }


    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static CharArrayMapper getInstance() {
        return TypeMapperUtils.getCharArrayMapper();
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    private StringMapper getStringMapper() {
        return TypeMapperUtils.getStringMapper();
    }

    @Override
    public boolean isMappable(Object o) {
        boolean bIsMappable;

        if (o instanceof char[]) {
            bIsMappable = true;
        }
        else {
            bIsMappable = super.isMappable(o);
        }
        return bIsMappable;
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
    public char[] mapObject(Object obj, char[] defaultValue) {
        char[] e;

        if ( obj instanceof char[] ) {
            e = this.map( (char[]) obj, defaultValue );
        }
        else {
            e = super.mapObject( obj, defaultValue );
        }
        return e;
    }

    /**
     * map
     *
     * @param c
     * @param defaultValue
     *
     * @return
     */
    @Override
    public char[] map(char[] c, char[] defaultValue) {
        return (null != c
                        ? c
                        : defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return <p></p>
     */
    public char[] map(String s, boolean bTrim, boolean bEmptyIsNull, char[] defaultValue) {
        return this.map(s, bTrim, bEmptyIsNull, DEFAULT_REMOVE_CHAR_DELIMITERS_IN_STRINGS, defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param bTrim
     * @param bEmptyIsNull
     * @param bRemoveCharDelimiters
     * @param defaultValue
     *
     * @return <p></p>
     */
    public char[] map(String s, boolean bTrim, boolean bEmptyIsNull, boolean bRemoveCharDelimiters,
                      char[] defaultValue) {
        char[] acRetVal = defaultValue;
        String sValue = this.getStringMapper().map(s, bTrim, bEmptyIsNull, null);

        if (null != sValue) {
            if (bRemoveCharDelimiters && StringUtils.isNotEmpty(sValue)) {
                sValue = sValue.replaceAll(this.getRegExCharDelimiters(), "");
            }

            if (StringUtils.isNotEmpty(sValue)) {
                acRetVal = sValue.toCharArray();
            }
        }
        return acRetVal;
    }

    @Override
    public char[] map(Properties props, String key, char[] defaultValue) {
        return this.map(props, key, DEFAULT_REMOVE_CHAR_DELIMITERS_IN_PROPERTIES, defaultValue);
    }

    @Override
    public char[] map(Properties props, String key, boolean bRemoveCharDelimiters, char[] defaultValue) {
        char[] acRetVal = defaultValue;

        if (MapUtils.isNotEmpty(props) && StringUtils.isNotEmpty(key) && props.containsKey(key)) {
            String sValue = this.getStringMapper().map(props, key, null);

            if (null != sValue) {
                acRetVal = this.map(sValue, false, false, bRemoveCharDelimiters, defaultValue);
            }
        }
        return acRetVal;
    }

}
