package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalTimeMapperHttpSession extends HttpSession {

    /**
     *
     * @param name
     * @return
     */
    default LocalTime getLocalTimeAttribute(String name) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeAttribute(String name, LocalTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasLocalTimeAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasLocalTimeAttributeWithValue( String key, LocalTime value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalTimeMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
