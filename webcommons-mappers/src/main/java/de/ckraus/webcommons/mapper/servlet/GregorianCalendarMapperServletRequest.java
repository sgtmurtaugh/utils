package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface GregorianCalendarMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(String name) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(String name, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(String name) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(String name, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(String name, boolean bTrim, boolean bEmptyIsNull, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasGregorianCalendarAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasGregorianCalendarAttributeWithValue( String key, GregorianCalendar value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
