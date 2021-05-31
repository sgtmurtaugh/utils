package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
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
            return TypeMapperUtils.getStringMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperUtils.getStringMapper().getDefaultValue();
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
            return TypeMapperUtils.getStringMapper().mapObject(this.getAttribute(e, name), defaultValue);
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
            return TypeMapperUtils.getStringMapper()
                                  .map(this.getStringAttribute(e, name), bTrim, bEmptyIsNull);
        }
        return TypeMapperUtils.getStringMapper().getDefaultValue();
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
            return TypeMapperUtils.getStringMapper()
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
            var value = TypeMapperUtils.getStringMapper().mapObject(this.getAttribute(e, name), null);
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
                    TypeMapperUtils.getStringMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
