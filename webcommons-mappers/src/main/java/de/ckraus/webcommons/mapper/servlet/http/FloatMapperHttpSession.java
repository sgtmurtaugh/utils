package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface FloatMapperHttpSession extends HttpSession {

    /**
     *
     * @param name
     * @return
     */
    default Float getFloatAttribute(String name) {
        return TypeMapperUtils.getDefaults().getFloatMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Float getFloatAttribute(String name, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasFloatAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getFloatMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasFloatAttributeWithValue( String key, Float value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getFloatMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
