package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigIntegerMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default BigInteger getBigIntegerAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerAttribute( HttpServletRequest request, String name, BigInteger defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper()
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
    default BigInteger getBigIntegerParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerParameter( HttpServletRequest request, String name, BigInteger defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                  .map( request.getParameter( name ), defaultValue );
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
    default BigInteger getBigIntegerParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().getDefaultValue();
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
    default BigInteger getBigIntegerParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull, BigInteger defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasBigIntegerAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBigIntegerMapper()
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
    default boolean hasBigIntegerAttributeWithValue( HttpServletRequest request, String key, BigInteger value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigIntegerMapper()
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
    default boolean hasBigIntegerParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                       .map( request.getParameter( key ), ( BigInteger ) null );
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
    default boolean hasBigIntegerParameterWithValue( HttpServletRequest request, String key, BigInteger value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( BigInteger ) null ) ).isEquals();
        }
        return false;
    }

}
