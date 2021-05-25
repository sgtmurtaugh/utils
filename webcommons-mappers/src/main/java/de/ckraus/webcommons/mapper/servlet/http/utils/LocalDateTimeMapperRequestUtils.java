package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateTimeMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute( HttpServletRequest request, String name,
            LocalDateTime defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
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
    default LocalDateTime getLocalDateTimeParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter( HttpServletRequest request, String name,
            LocalDateTime defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                  .map( request.getParameter( name ), defaultValue );
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
    default LocalDateTime getLocalDateTimeParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().getDefaultValue();
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
    default LocalDateTime getLocalDateTimeParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull, LocalDateTime defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasLocalDateTimeAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
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
    default boolean hasLocalDateTimeAttributeWithValue( HttpServletRequest request, String key, LocalDateTime value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
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
    default boolean hasLocalDateTimeParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                       .map( request.getParameter( key ), ( LocalDateTime ) null );
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
    default boolean hasLocalDateTimeParameterWithValue( HttpServletRequest request, String key, LocalDateTime value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( LocalDateTime ) null ) ).isEquals();
        }
        return false;
    }

}
