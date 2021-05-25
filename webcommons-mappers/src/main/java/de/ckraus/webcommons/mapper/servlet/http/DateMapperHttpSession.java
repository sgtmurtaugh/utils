package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DateMapperHttpSession extends HttpSession {

    /**
     *
     * @param name
     * @return
     */
    default Date getDateAttribute(String name) {
        return TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Date getDateAttribute(String name, Date defaultValue) {
        return TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasDateAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getDateMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasDateAttributeWithValue( String key, Date value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getDateMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
