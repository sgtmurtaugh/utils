package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ShortScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default Short getShortAttribute(@NonNull String name) {
        return TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Short getShortAttribute(@NonNull String name, Short defaultValue) {
        return TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasShortAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasShortAttributeWithValue(@NonNull String name, Short value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(name), null)).isEquals();
        }
        return false;
    }

}
