package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default LocalDate getLocalDateAttribute(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDate getLocalDateAttribute(String name, LocalDate defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default LocalDate getLocalDateParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDate getLocalDateParameter(String name, LocalDate defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default LocalDate getLocalDateParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default LocalDate getLocalDateParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalDate defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasLocalDateAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasLocalDateAttributeWithValue( String key, LocalDate value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
