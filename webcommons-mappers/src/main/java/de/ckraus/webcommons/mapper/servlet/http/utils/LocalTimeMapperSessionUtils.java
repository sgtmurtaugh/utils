package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalTimeMapperSessionUtils {

    /**
     * 
     * @param session
     * @param name
     * @return
     */
    default LocalTime getLocalTimeAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().getDefaultValue();
    }

    /**
     * 
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeAttribute( HttpSession session, String name, LocalTime defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasLocalTimeAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalTimeMapper()
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
    default boolean hasLocalTimeAttributeWithValue( HttpSession session, String key, LocalTime value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
