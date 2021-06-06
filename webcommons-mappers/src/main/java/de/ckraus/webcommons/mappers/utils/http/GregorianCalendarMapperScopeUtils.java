package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.ScopeUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface GregorianCalendarMapperScopeUtils<E> extends ScopeUtils<E> {

    /**
     * @param e
     * @param name
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(E e, String name) {
        if (null != e) {
            return TypeMapperFactory.getGregorianCalendarMapper().mapObject(this.getAttribute(e, name));
        }
        return TypeMapperFactory.getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param e
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(E e, String name, GregorianCalendar defaultValue) {
        if (null != e) {
            return TypeMapperFactory.getGregorianCalendarMapper()
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
    default boolean hasGregorianCalendarAttribute(E e, String name) {
        if (this.hasAttribute(e, name)) {
            var value = TypeMapperFactory.getGregorianCalendarMapper()
                                         .mapObject(this.getAttribute(e, name), null);
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
    default boolean hasGregorianCalendarAttributeWithValue(E e, String name, GregorianCalendar value) {
        if (this.hasAttribute(e, name)) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getGregorianCalendarMapper()
                                                                      .mapObject(this.getAttribute(e, name), null))
                                      .isEquals();
        }
        return false;
    }

}
