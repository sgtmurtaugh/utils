package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.TypeMapperFactory;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ShortMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default Short getShortAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperFactory.getShortMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Short getShortAttribute(E e, String name, Short defaultValue) {
        if (null != e) {
            return TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasShortAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(e, name), null);
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
    default boolean hasShortAttributeWithValue(E e, String name, Short value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getShortMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
