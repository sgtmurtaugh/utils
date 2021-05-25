package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface IntegerMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default Integer getIntegerAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getIntegerMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Integer getIntegerAttribute( HttpServletRequest request, String name, Integer defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper()
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
    default Integer getIntegerParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getIntegerMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getIntegerMapper().getDefaultValue();
    }

    /**
     * 
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
     * 
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
     * 
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
     * @param key
     * @return
     */
    default boolean hasIntegerAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getIntegerMapper()
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
    default boolean hasIntegerAttributeWithValue( HttpServletRequest request, String key, Integer value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getIntegerMapper()
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
    default boolean hasIntegerParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getIntegerMapper()
                                       .map( request.getParameter( key ), ( Integer ) null );
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
    default boolean hasIntegerParameterWithValue( HttpServletRequest request, String key, Integer value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getIntegerMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( Integer ) null ) ).isEquals();
        }
        return false;
    }

}
