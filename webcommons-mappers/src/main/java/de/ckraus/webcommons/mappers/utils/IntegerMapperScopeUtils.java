package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.TypeMapperFactory;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface IntegerMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default Integer getIntegerAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperFactory.getIntegerMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperFactory.getIntegerMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Integer getIntegerAttribute(E e, String name, Integer defaultValue) {
        if (null != e) {
            return TypeMapperFactory.getIntegerMapper().mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasIntegerAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperFactory.getIntegerMapper().mapObject(this.getAttribute(e, name), null);
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
    default boolean hasIntegerAttributeWithValue(E e, String name, Integer value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getIntegerMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
