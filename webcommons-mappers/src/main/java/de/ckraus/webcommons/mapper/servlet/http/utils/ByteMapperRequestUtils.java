package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ByteMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default Byte getByteAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getByteMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getByteMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Byte getByteAttribute( HttpServletRequest request, String name, Byte defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getByteMapper()
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
    default Byte getByteParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getByteMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getByteMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default Byte getByteParameter( HttpServletRequest request, String name, Byte defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getByteMapper().map( request.getParameter( name ), defaultValue );
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
    default Byte getByteParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getByteMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getByteMapper().getDefaultValue();
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
    default Byte getByteParameter( HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
            Byte defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getByteMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasByteAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getByteMapper()
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
    default boolean hasByteAttributeWithValue( HttpServletRequest request, String key, Byte value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getByteMapper()
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
    default boolean hasByteParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getByteMapper()
                                       .map( request.getParameter( key ), ( Byte ) null );
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
    default boolean hasByteParameterWithValue( HttpServletRequest request, String key, Byte value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getByteMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( Byte ) null ) ).isEquals();
        }
        return false;
    }

}
