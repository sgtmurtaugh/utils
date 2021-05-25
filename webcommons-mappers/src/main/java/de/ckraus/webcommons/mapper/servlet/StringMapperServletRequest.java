package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface StringMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default String getStringAttribute(String name) {
        return TypeMapperUtils.getDefaults().getStringMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default String getStringAttribute(String name, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default String getStringAttribute(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getStringAttribute(name), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getStringAttribute(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getStringAttribute(name, defaultValue), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default String getStringParameter(String name) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default String getStringParameter(String name, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default String getStringParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getStringParameter(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasStringAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getStringMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasStringAttributeWithValue( String key, String value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getStringMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
