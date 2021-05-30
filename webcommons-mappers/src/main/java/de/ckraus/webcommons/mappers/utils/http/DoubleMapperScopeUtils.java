package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.utils.ScopeUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DoubleMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default Double getDoubleAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Double getDoubleAttribute(E e, String name, Double defaultValue) {
        if (null != e) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasDoubleAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperUtils.getDefaults().getDoubleMapper().mapObject(this.getAttribute(e, name), null);
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
    default boolean hasDoubleAttributeWithValue(E e, String name, Double value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getDoubleMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
