package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface FloatScopeMapper extends ScopeMapper {

    /**
     * @param name
     * @return
     */
    default Float getFloatAttribute(String name) {
        return TypeMapperUtils.getDefaults().getFloatMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default Float getFloatAttribute(String name, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     * @return
     */
    default boolean hasFloatAttribute(String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getDefaults().getFloatMapper().mapObject(this.getAttribute(name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param name
     * @param value
     * @return
     */
    default boolean hasFloatAttributeWithValue(String name, Float value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value, TypeMapperUtils.getDefaults().getFloatMapper()
                    .mapObject(this.getAttribute(name), null))
                    .isEquals();
        }
        return false;
    }

}