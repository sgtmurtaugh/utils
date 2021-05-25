package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BooleanMapperSessionUtils {

    /**
     * @param session
     * @param name
     * @return
     */
    default Boolean getBooleanAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getBooleanMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default Boolean getBooleanAttribute( HttpSession session, String name, Boolean defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getBooleanMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasBooleanAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBooleanMapper().mapObject( session.getAttribute( key ), null );
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
    default boolean hasBooleanAttributeWithValue( HttpSession session, String key, Boolean value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBooleanMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
