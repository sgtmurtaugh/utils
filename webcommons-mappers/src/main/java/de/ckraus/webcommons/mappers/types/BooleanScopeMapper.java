package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BooleanScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default Boolean getBooleanAttribute(@NonNull String name) {
        return TypeMapperFactory.getBooleanMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Boolean getBooleanAttribute(@NonNull String name, Boolean defaultValue) {
        return TypeMapperFactory.getBooleanMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasBooleanAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getBooleanMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasBooleanAttributeWithValue(@NonNull String name, Boolean value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getBooleanMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
