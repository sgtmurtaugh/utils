package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BooleanMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default Boolean getBooleanAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperUtils.getBooleanMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperUtils.getBooleanMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Boolean getBooleanAttribute(E e, String name, Boolean defaultValue) {
        if (null != e) {
            return TypeMapperUtils.getBooleanMapper().mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasBooleanAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperUtils.getBooleanMapper().mapObject(this.getAttribute(e, name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param e
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasBooleanAttributeWithValue(E e, String name, Boolean value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getBooleanMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
