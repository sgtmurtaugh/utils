package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface DoubleMapperSessionUtils {

    /**
     * @param session
     * @param name
     * @return
     */
    default Double getDoubleAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default Double getDoubleAttribute( HttpSession session, String name, Double defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getDoubleMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasDoubleAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getDoubleMapper().mapObject( session.getAttribute( key ), null );
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
    default boolean hasDoubleAttributeWithValue( HttpSession session, String key, Double value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDoubleMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
