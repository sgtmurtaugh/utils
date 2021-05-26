package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface CharacterMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    default Character getCharacterAttribute( E e, String name ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getCharacterMapper().mapObject( this.getAttribute( e, name ) );
        }
        return TypeMapperUtils.getDefaults().getCharacterMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     * @return
     */
    default Character getCharacterAttribute( E e, String name, Character defaultValue ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getCharacterMapper()
                                  .mapObject( this.getAttribute( e, name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     * @return
     */
    default boolean hasCharacterAttribute( E e, String name ) {
        if ( this.hasAttribute( e, name ) ) {
            var value = TypeMapperUtils.getDefaults().getCharacterMapper()
                                       .mapObject( this.getAttribute( e, name ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param e
     * @param name
     * @param value
     * @return
     */
    default boolean hasCharacterAttributeWithValue( E e, String name, Character value ) {
        if ( this.hasAttribute( e, name ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getCharacterMapper()
                                                                     .mapObject( this.getAttribute( e, name ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
