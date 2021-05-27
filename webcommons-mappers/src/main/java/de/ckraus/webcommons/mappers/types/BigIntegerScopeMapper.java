package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface BigIntegerScopeMapper extends ScopeMapper {

    /**
     * @param name
     * @return
     */
    default BigInteger getBigIntegerAttribute(String name) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerAttribute(String name, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     * @return
     */
    default boolean hasBigIntegerAttribute(String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getDefaults().getBigIntegerMapper().mapObject(this.getAttribute(name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param name
     * @param value
     * @return
     */
    default boolean hasBigIntegerAttributeWithValue(String name, BigInteger value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value, TypeMapperUtils.getDefaults().getBigIntegerMapper()
                    .mapObject(this.getAttribute(name), null))
                    .isEquals();
        }
        return false;
    }

}
