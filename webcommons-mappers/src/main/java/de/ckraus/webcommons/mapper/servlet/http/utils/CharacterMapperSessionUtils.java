package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface CharacterMapperSessionUtils {

    /**
     * @param session
     * @param name
     * @return
     */
    default Character getCharacterAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getCharacterMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getCharacterMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default Character getCharacterAttribute( HttpSession session, String name, Character defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getCharacterMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasCharacterAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getCharacterMapper()
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
    default boolean hasCharacterAttributeWithValue( HttpSession session, String key, Character value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getCharacterMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
