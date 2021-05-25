package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigIntegerMapperSessionUtils {

    /**
     * 
     * @param session
     * @param name
     * @return
     */
    default BigInteger getBigIntegerAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().getDefaultValue();
    }

    /**
     * 
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerAttribute( HttpSession session, String name, BigInteger defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasBigIntegerAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                       .mapObject( session.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param session
     * @param key
     * @param value
     * @return
     */
    default boolean hasBigIntegerAttributeWithValue( HttpSession session, String key, BigInteger value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
