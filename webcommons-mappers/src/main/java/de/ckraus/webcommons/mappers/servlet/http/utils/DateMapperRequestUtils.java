package de.ckraus.webcommons.mappers.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface DateMapperRequestUtils extends RequestUtils, DateMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     * @return
     */
    default Date getDateParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDateMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getDateMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Date getDateParameter( HttpServletRequest request, String name, Date defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDateMapper().map( request.getParameter( name ), defaultValue );
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
    default Date getDateParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDateMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getDateMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Date getDateParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            Date defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDateMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default boolean hasDateParameter( HttpServletRequest request, String name ) {
        if ( null != request && StringUtils.isNotEmpty( name ) &&
             StringUtils.isNotEmpty( request.getParameter( name ) ) ) {
            var value = TypeMapperUtils.getDefaults().getDateMapper().map( request.getParameter( name ), null );
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
    default boolean hasDateParameterWithValue( HttpServletRequest request, String name, Date value ) {
        if ( null != request && StringUtils.isNotEmpty( name ) &&
             StringUtils.isNotEmpty( request.getParameter( name ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDateMapper()
                                                                     .map( request.getParameter( name ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
