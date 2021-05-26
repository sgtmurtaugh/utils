package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.math.BigInteger;

/**
 * @param <E>
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BigIntegerMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    default BigInteger getBigIntegerAttribute( E e, String name ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject( this.getAttribute( e, name ) );
        }
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerAttribute( E e, String name, BigInteger defaultValue ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                  .mapObject( this.getAttribute( e, name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     * @return
     */
    default boolean hasBigIntegerAttribute( E e, String name ) {
        if ( this.hasAttribute( e, name ) ) {
            var value = TypeMapperUtils.getDefaults().getBigIntegerMapper()
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
    default boolean hasBigIntegerAttributeWithValue( E e, String name, BigInteger value ) {
        if ( this.hasAttribute( e, name ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                                                     .mapObject( this.getAttribute( e, name ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
