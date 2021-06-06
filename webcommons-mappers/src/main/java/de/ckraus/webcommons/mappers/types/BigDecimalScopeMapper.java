package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigDecimalScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default BigDecimal getBigDecimalAttribute(@NonNull String name) {
        return TypeMapperFactory.getBigDecimalMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default BigDecimal getBigDecimalAttribute(@NonNull String name, BigDecimal defaultValue) {
        return TypeMapperFactory.getBigDecimalMapper().mapObject(this.getAttribute(name), defaultValue);
    }


    /**
     * @param name
     *
     * @return
     */
    default boolean hasBigDecimalAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getBigDecimalMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasBigDecimalAttributeWithValue(@NonNull String name, BigDecimal value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getBigDecimalMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
