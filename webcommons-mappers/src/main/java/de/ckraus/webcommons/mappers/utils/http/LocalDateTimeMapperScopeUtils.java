package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.utils.ScopeUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface LocalDateTimeMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute( E e, String name ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject( this.getAttribute( e, name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute( E e, String name, LocalDateTime defaultValue ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                  .mapObject( this.getAttribute( e, name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     * @return
     */
    default boolean hasLocalDateTimeAttribute( E e, String name ) {
        if ( this.hasAttribute( e, name ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
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
    default boolean hasLocalDateTimeAttributeWithValue( E e, String name, LocalDateTime value ) {
        if ( this.hasAttribute( e, name ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                                                     .mapObject( this.getAttribute( e, name ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
