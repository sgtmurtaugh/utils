package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ShortMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default Short getShortAttribute(String name) {
        return TypeMapperUtils.getDefaults().getShortMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Short getShortAttribute(String name, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default Short getShortParameter(String name) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Short getShortParameter(String name, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Short getShortParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Short getShortParameter(String name, boolean bTrim, boolean bEmptyIsNull, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasShortAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getShortMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasShortAttributeWithValue( String key, Short value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getShortMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
