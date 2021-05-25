package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigDecimalMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalAttribute(String name) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalAttribute(String name, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name, boolean bTrim, boolean bEmptyIsNull, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
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
