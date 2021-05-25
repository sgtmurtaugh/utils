package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateTimeMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute(String name, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasLocalDateTimeAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasLocalDateTimeAttributeWithValue( String key, LocalDateTime value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
