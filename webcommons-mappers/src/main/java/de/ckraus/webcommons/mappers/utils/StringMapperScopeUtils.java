package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.TypeMapperFactory;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface StringMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default String getStringAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperFactory.getStringMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default String getStringAttribute(E e, String name, String defaultValue) {
        if (null != e) {
            return TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default String getStringAttribute(E e, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != e) {
            return TypeMapperFactory.getStringMapper()
                                    .map(this.getStringAttribute(e, name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getStringMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default String getStringAttribute(E e, String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        if (null != e) {
            return TypeMapperFactory.getStringMapper()
                                    .map(this.getStringAttribute(e, name, defaultValue), bTrim, bEmptyIsNull,
                                          defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasStringAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(e, name), null);
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
    default boolean hasStringAttributeWithValue(E e, String name, String value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
