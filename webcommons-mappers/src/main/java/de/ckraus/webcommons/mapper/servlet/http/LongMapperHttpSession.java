package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LongMapperHttpSession extends HttpSession {

    /**
     *
     * @param name
     * @return
     */
    default Long getLongAttribute(String name) {
        return TypeMapperUtils.getDefaults().getLongMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Long getLongAttribute(String name, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasLongAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLongMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasLongAttributeWithValue( String key, Long value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLongMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
