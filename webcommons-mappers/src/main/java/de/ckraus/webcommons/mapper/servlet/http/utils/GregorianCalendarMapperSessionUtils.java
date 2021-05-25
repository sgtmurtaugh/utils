package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface GregorianCalendarMapperSessionUtils {

    /**
     * @param session
     * @param name
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute( HttpSession session, String name,
            GregorianCalendar defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasGregorianCalendarAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                       .mapObject( session.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param session
     * @param key
     * @param value
     * @return
     */
    default boolean hasGregorianCalendarAttributeWithValue( HttpSession session, String key,
            GregorianCalendar value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
