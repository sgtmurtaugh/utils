package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BooleanMapperRequestUtils {

    /**
     * @param request
     * @param name
     * @return
     */
    default Boolean getBooleanAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getBooleanMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Boolean getBooleanAttribute( HttpServletRequest request, String name, Boolean defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default Boolean getBooleanParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getBooleanMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Boolean getBooleanParameter( HttpServletRequest request, String name, Boolean defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper().map( request.getParameter( name ), defaultValue );
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
    default Boolean getBooleanParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getBooleanMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Boolean getBooleanParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            Boolean defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasBooleanAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBooleanMapper().mapObject( request.getAttribute( key ), null );
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
    default boolean hasBooleanAttributeWithValue( HttpServletRequest request, String key, Boolean value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBooleanMapper()
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
    default boolean hasBooleanParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getBooleanMapper().map( request.getParameter( key ), null );
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
    default boolean hasBooleanParameterWithValue( HttpServletRequest request, String key, Boolean value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBooleanMapper()
                                                                     .map( request.getParameter( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
