package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface LocalTimeMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    default LocalTime getLocalTimeAttribute( E e, String name ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject( this.getAttribute( e, name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeAttribute( E e, String name, LocalTime defaultValue ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                  .mapObject( this.getAttribute( e, name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     * @return
     */
    default boolean hasLocalTimeAttribute( E e, String name ) {
        if ( this.hasAttribute( e, name ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalTimeMapper()
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
    default boolean hasLocalTimeAttributeWithValue( E e, String name, LocalTime value ) {
        if ( this.hasAttribute( e, name ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                                                     .mapObject( this.getAttribute( e, name ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
