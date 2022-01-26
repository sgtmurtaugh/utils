package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("stringMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class StringMapperImpl extends TypeMapperBase<String> implements StringMapper {

    /**
     * Constructor
     */
    StringMapperImpl() {
        super(String.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    StringMapperImpl(String defaultValue) {
        super(String.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static StringMapper getInstance() {
        return TypeMapperUtils.getStringMapper();
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
    public String mapObject(Object obj, String defaultValue) {
        String s;

        if (null == obj) {
            s = defaultValue;
        }
        else if (obj instanceof String) {
            s = this.map((String) obj, defaultValue);
        }
        else {
            s = this.map(obj.toString(), defaultValue);
        }
        return s;
    }

    /**
     * Delegates to {@link #map(String, String)} with usage of {@link #getDefaultValue()}
     *
     * @param s - string to map
     *
     * @return mapped string
     */
    @Override
    public String map(String s) {
        return this.map(s, this.getDefaultValue());
    }

    /**
     * Delegates to {@link #map(String, boolean, boolean, String)} with usage of {@link #isTrimString()} and {@link
     * #isEmptyStringNull()}
     *
     * @param s - string to map
     * @param defaultValue - The public value
     *
     * @return mapped string
     */
    @Override
    public String map(String s, String defaultValue) {
        return this.map(s, this.isTrimString(), this.isEmptyStringNull(), defaultValue);
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - public flag for string handling
     * @param bEmptyIsNull - public flag for empty string handling
     * @param defaultValue - The public value
     *
     * @return mapped string
     */
    @Override
    public String map(String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        String sRetVal = defaultValue;
        String sPrepared = this.prepare(s, bTrim, bEmptyIsNull);

        if (sPrepared != null) {
            sRetVal = sPrepared;
        }
        return sRetVal;
    }

}
