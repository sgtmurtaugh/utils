package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface LocalDateTimeMapperRequestUtils extends RequestUtils, LocalDateTimeMapperScopeUtils<HttpServletRequest> {

    /**
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
     * @param name
     * @return
     */
    default boolean hasLocalDateTimeParameter( HttpServletRequest request, String name ) {
        if ( null != request && StringUtils.isNotEmpty( name ) &&
             StringUtils.isNotEmpty( request.getParameter( name ) ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                       .map( request.getParameter( name ), ( LocalDateTime ) null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param request
     * @param name
     * @param value
     * @return
     */
    default boolean hasLocalDateTimeParameterWithValue( HttpServletRequest request, String name, LocalDateTime value ) {
        if ( null != request && StringUtils.isNotEmpty( name ) &&
             StringUtils.isNotEmpty( request.getParameter( name ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                                                     .map( request.getParameter( name ),
                                                                           ( LocalDateTime ) null ) ).isEquals();
        }
        return false;
    }

}
