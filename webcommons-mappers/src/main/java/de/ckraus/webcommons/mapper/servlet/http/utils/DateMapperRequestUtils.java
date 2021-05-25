package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface DateMapperRequestUtils {

    /**
     * @param request
     * @param name
     * @return
     */
    default Date getDateAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDateMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getDateMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Date getDateAttribute( HttpServletRequest request, String name, Date defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getDateMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

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
     * @param key
     * @return
     */
    default boolean hasDateAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getDateMapper().mapObject( request.getAttribute( key ), null );
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
    default boolean hasDateAttributeWithValue( HttpServletRequest request, String key, Date value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDateMapper()
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
    default boolean hasDateParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getDateMapper().map( request.getParameter( key ), null );
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
    default boolean hasDateParameterWithValue( HttpServletRequest request, String key, Date value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDateMapper()
                                                                     .map( request.getParameter( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
