package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface GregorianCalendarMapperRequestUtils {

    /**
     * @param request
     * @param name
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute( HttpServletRequest request, String name,
            GregorianCalendar defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter( HttpServletRequest request, String name,
            GregorianCalendar defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                  .map( request.getParameter( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull, GregorianCalendar defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasGregorianCalendarAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                       .mapObject( request.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param request
     * @param key
     * @param value
     * @return
     */
    default boolean hasGregorianCalendarAttributeWithValue( HttpServletRequest request, String key,
            GregorianCalendar value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                                                     .mapObject( request.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasGregorianCalendarParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                       .map( request.getParameter( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param request
     * @param key
     * @param value
     * @return
     */
    default boolean hasGregorianCalendarParameterWithValue( HttpServletRequest request, String key,
            GregorianCalendar value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                                                                     .map( request.getParameter( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
