package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BooleanMapperHttpSession extends HttpSession {

    /**
     *
     * @param name
     * @return
     */
    default Boolean getBooleanAttribute(String name) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Boolean getBooleanAttribute(String name, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasBooleanAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBooleanMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasBooleanAttributeWithValue( String key, Boolean value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBooleanMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
