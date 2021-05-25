package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalTimeMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default LocalTime getLocalTimeAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeAttribute( HttpServletRequest request, String name, LocalTime defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default LocalTime getLocalTimeParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeParameter( HttpServletRequest request, String name, LocalTime defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper().map( request.getParameter( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * 
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default LocalTime getLocalTimeParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull, LocalTime defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasLocalTimeAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalTimeMapper()
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
    default boolean hasLocalTimeAttributeWithValue( HttpServletRequest request, String key, LocalTime value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalTimeMapper()
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
    default boolean hasLocalTimeParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                       .map( request.getParameter( key ), ( LocalTime ) null );
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
    default boolean hasLocalTimeParameterWithValue( HttpServletRequest request, String key, LocalTime value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( LocalTime ) null ) ).isEquals();
        }
        return false;
    }

}
