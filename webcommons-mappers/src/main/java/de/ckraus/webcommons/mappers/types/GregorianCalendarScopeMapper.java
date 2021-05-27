package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface GregorianCalendarScopeMapper extends ScopeMapper {

    /**
     * @param name
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(String name) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(String name, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     * @return
     */
    default boolean hasGregorianCalendarAttribute(String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getDefaults().getGregorianCalendarMapper().mapObject(this.getAttribute(name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param name
     * @param value
     * @return
     */
    default boolean hasGregorianCalendarAttributeWithValue(String name, GregorianCalendar value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value, TypeMapperUtils.getDefaults().getGregorianCalendarMapper()
                    .mapObject(this.getAttribute(name), null))
                    .isEquals();
        }
        return false;
    }

}
