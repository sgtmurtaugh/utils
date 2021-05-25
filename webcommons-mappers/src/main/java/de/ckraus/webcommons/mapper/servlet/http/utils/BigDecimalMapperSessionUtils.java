package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BigDecimalMapperSessionUtils {

    /**
     * @param session
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalAttribute( HttpSession session, String name, BigDecimal defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasBigDecimalAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBigDecimalMapper()
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
    default boolean hasBigDecimalAttributeWithValue( HttpSession session, String key, BigDecimal value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
