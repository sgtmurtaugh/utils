package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LongScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default Long getLongAttribute(@NonNull String name) {
        return TypeMapperUtils.getLongMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Long getLongAttribute(@NonNull String name, Long defaultValue) {
        return TypeMapperUtils.getLongMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasLongAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getLongMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasLongAttributeWithValue(@NonNull String name, Long value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getLongMapper().mapObject(this.getAttribute(name), null)).isEquals();
        }
        return false;
    }

}
