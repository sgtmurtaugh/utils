package de.ckraus.webcommons.mappers.utils;

import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * @param <E>
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    Object getAttribute( @NonNull E e, @NonNull String name );

    /**
     * @param e
     * @param name
     * @return
     */
    default boolean hasAttribute( @NonNull E e, @NonNull String name ) {
        return ( null != this.getAttribute( e, name ) );
    }


    /**
     * @param e
     * @param name
     * @param value
     * @return
     */
    default boolean hasAttributeWithValue( @NonNull E e, @NonNull String name, Object value ) {
        if ( this.hasAttribute( e, name ) ) {
            return new EqualsBuilder().append( this.getAttribute( e, name ), value ).isEquals();
        }
        return false;
    }

}
