package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigIntegerMapperServletRequest extends ServletRequest {

    /**
     *
     * @param name
     * @return
     */
    default BigInteger getBigIntegerAttribute(String name) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject(this.getAttribute(name));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerAttribute(String name, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     *
     * @param name
     * @return
     */
    default BigInteger getBigIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ));
    }

    /**
     *
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerParameter(String name, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ), defaultValue);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default BigInteger getBigIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    /**
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param key
     * @return
     */
    default boolean hasBigIntegerAttribute( String key ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject( this.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param key
     * @param value
     * @return
     */
    default boolean hasBigIntegerAttributeWithValue( String key, BigInteger value ) {
        if ( StringUtils.isNotEmpty( key ) && null != this.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigIntegerMapper()
                                                                     .mapObject( this.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }
    
}
