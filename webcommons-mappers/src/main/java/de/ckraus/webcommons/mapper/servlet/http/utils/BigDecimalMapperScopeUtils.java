package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BigDecimalMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalAttribute( E e, String name ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject( this.getAttribute( e, name ) );
        }
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalAttribute( E e, String name, BigDecimal defaultValue ) {
        if ( null != e ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                  .mapObject( this.getAttribute( e, name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     * @return
     */
    default boolean hasBigDecimalAttribute( E e, String name ) {
        if ( this.hasAttribute( e, name ) ) {
            var value = TypeMapperUtils.getDefaults().getBigDecimalMapper()
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
    default boolean hasBigDecimalAttributeWithValue( E e, String name, BigDecimal value ) {
        if ( this.hasAttribute( e, name ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                                                     .mapObject( this.getAttribute( e, name ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
