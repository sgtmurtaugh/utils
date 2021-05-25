package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface IntegerMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default Integer getIntegerAttribute(String name) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Integer getIntegerAttribute(String name, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default Integer getIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Integer getIntegerParameter(String name, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasIntegerAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getIntegerMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasIntegerAttributeWithValue( String key, Integer value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getIntegerMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
