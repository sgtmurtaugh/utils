package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default LocalDate getLocalDateAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperUtils.getLocalDateMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperUtils.getLocalDateMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDate getLocalDateAttribute(E e, String name, LocalDate defaultValue) {
        if (null != e) {
            return TypeMapperUtils.getLocalDateMapper()
                                  .mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasLocalDateAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperUtils.getLocalDateMapper().mapObject(this.getAttribute(e, name), null);
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
    default boolean hasLocalDateAttributeWithValue(E e, String name, LocalDate value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getLocalDateMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
