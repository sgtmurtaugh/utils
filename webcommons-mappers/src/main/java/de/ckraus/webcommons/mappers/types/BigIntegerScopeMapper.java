package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigIntegerScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default BigInteger getBigIntegerAttribute(@NonNull String name) {
        return TypeMapperFactory.getBigIntegerMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default BigInteger getBigIntegerAttribute(@NonNull String name, BigInteger defaultValue) {
        return TypeMapperFactory.getBigIntegerMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasBigIntegerAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getBigIntegerMapper().mapObject(this.getAttribute(name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasBigIntegerAttributeWithValue(@NonNull String name, BigInteger value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getBigIntegerMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
