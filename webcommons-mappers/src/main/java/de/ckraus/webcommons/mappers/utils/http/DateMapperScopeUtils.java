package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.utils.ScopeUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.Date;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DateMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default Date getDateAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperUtils.getDefaults().getDateMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Date getDateAttribute(E e, String name, Date defaultValue) {
        if (null != e) {
            return TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(e, name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default boolean hasDateAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(e, name), null);
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
    default boolean hasDateAttributeWithValue(E e, String name, Date value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
