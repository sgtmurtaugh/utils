package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface IntegerMapperRequestUtils extends RequestUtils, IntegerMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     * @return
     */
    default Integer getIntegerParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getIntegerMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Integer getIntegerParameter( HttpServletRequest request, String name, Integer defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper().map( request.getParameter( name ), defaultValue );
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
    default Integer getIntegerParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getIntegerMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Integer getIntegerParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            Integer defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default boolean hasIntegerParameter( HttpServletRequest request, String name ) {
        if ( null != request && StringUtils.isNotEmpty( name ) &&
             StringUtils.isNotEmpty( request.getParameter( name ) ) ) {
            var value = TypeMapperUtils.getDefaults().getIntegerMapper()
                                       .map( request.getParameter( name ), ( Integer ) null );
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
    default boolean hasIntegerParameterWithValue( HttpServletRequest request, String name, Integer value ) {
        if ( null != request && StringUtils.isNotEmpty( name ) &&
             StringUtils.isNotEmpty( request.getParameter( name ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getIntegerMapper()
                                                                     .map( request.getParameter( name ),
                                                                           ( Integer ) null ) ).isEquals();
        }
        return false;
    }

}
