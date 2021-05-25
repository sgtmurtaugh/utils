package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface FloatMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default Float getFloatAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getFloatMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getFloatMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Float getFloatAttribute( HttpServletRequest request, String name, Float defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getFloatMapper()
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
    default Float getFloatParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getFloatMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getFloatMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Float getFloatParameter( HttpServletRequest request, String name, Float defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getFloatMapper().map( request.getParameter( name ), defaultValue );
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
    default Float getFloatParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getFloatMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getFloatMapper().getDefaultValue();
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
    default Float getFloatParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            Float defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getFloatMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasFloatAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getFloatMapper()
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
    default boolean hasFloatAttributeWithValue( HttpServletRequest request, String key, Float value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getFloatMapper()
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
    default boolean hasFloatParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getFloatMapper()
                                       .map( request.getParameter( key ), ( Float ) null );
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
    default boolean hasFloatParameterWithValue( HttpServletRequest request, String key, Float value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getFloatMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( Float ) null ) ).isEquals();
        }
        return false;
    }

}
