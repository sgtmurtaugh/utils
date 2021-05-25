package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateTimeMapperSessionUtils {

    /**
     * 
     * @param session
     * @param name
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute( HttpSession session, String name,
            LocalDateTime defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasLocalDateTimeAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
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
    default boolean hasLocalDateTimeAttributeWithValue( HttpSession session, String key, LocalDateTime value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateTimeMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
