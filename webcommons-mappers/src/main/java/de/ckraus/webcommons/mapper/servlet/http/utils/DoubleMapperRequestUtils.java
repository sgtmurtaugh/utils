package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface DoubleMapperRequestUtils {

    /**
     * @param request
     * @param name
     * @return
     */
    default Double getDoubleAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Double getDoubleAttribute( HttpServletRequest request, String name, Double defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default Double getDoubleParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Double getDoubleParameter( HttpServletRequest request, String name, Double defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().map( request.getParameter( name ), defaultValue );
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
    default Double getDoubleParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Double getDoubleParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            Double defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasDoubleAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getDoubleMapper().mapObject( request.getAttribute( key ), null );
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
    default boolean hasDoubleAttributeWithValue( HttpServletRequest request, String key, Double value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDoubleMapper()
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
    default boolean hasDoubleParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getDoubleMapper()
                                       .map( request.getParameter( key ), ( Double ) null );
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
    default boolean hasDoubleParameterWithValue( HttpServletRequest request, String key, Double value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDoubleMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( Double ) null ) ).isEquals();
        }
        return false;
    }

}
