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
public interface FloatScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default Float getFloatAttribute(@NonNull String name) {
        return TypeMapperFactory.getFloatMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Float getFloatAttribute(@NonNull String name, Float defaultValue) {
        return TypeMapperFactory.getFloatMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasFloatAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getFloatMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasFloatAttributeWithValue(@NonNull String name, Float value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getFloatMapper().mapObject(this.getAttribute(name), null)).isEquals();
        }
        return false;
    }

}
