package de.ckraus.webcommons.mappers;

import lombok.NonNull;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings( "javadoc" )
public interface ScopeMapper {

    /**
     * @param name
     * @return
     */
    Object getAttribute( @NonNull String name );

    /**
     * @param name
     * @return
     */
    default boolean hasAttribute( @NonNull String name ) {
        return ( null != this.getAttribute( name ) );
    }

    /**
     * @param value
     * @return
     */
    default boolean hasAttributeWithValue( @NonNull String name, Object value ) {
        if ( this.hasAttribute( name ) ) {
            return new EqualsBuilder().append( this.getAttribute( name ), value ).isEquals();
        }
        return false;
    }

}
