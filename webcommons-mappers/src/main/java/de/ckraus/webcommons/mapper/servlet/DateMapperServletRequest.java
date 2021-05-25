package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.util.Date;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DateMapperServletRequest extends ServletRequest {

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
     *
     * @param name
     * @return
     */
    default Date getDateParameter(String name) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default Date getDateParameter(String name, Date defaultValue) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Date getDateParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Date getDateParameter(String name, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
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
