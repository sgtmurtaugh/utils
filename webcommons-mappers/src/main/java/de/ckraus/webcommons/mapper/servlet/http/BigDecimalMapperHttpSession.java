package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BigDecimalMapperHttpSession extends HttpSession {

    /**
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalAttribute( String name ) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject( this.getAttribute( name ) );
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalAttribute( String name, BigDecimal defaultValue ) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject( this.getAttribute( name ), defaultValue );
    }

    /**
     * @param key
     * @return
     */
    default boolean hasBigDecimalAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasBigDecimalAttributeWithValue( String key, BigDecimal value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
