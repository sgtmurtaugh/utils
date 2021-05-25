package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface StringMapperRequestUtils {

    /**
     * @param request
     * @param name
     * @return
     */
    default String getStringAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default String getStringAttribute( HttpServletRequest request, String name, String defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
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
    default String getStringAttribute( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .map( this.getStringAttribute( request, name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getStringAttribute( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            String defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .map( this.getStringAttribute( request, name, defaultValue ), bTrim, bEmptyIsNull,
                                        defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default String getStringParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default String getStringParameter( HttpServletRequest request, String name, String defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper().map( request.getParameter( name ), defaultValue );
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
    default String getStringParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getStringParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            String defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasStringAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getStringMapper()
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
    default boolean hasStringAttributeWithValue( HttpServletRequest request, String key, String value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getStringMapper()
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
    default boolean hasStringParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getStringMapper().map( request.getParameter( key ), null );
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
    default boolean hasStringParameterWithValue( HttpServletRequest request, String key, String value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getStringMapper()
                                                                     .map( request.getParameter( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
