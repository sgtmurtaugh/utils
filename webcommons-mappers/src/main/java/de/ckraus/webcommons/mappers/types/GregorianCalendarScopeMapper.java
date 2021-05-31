package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface GregorianCalendarScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(@NonNull String name) {
        return TypeMapperUtils.getGregorianCalendarMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarAttribute(@NonNull String name, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getGregorianCalendarMapper()
                              .mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasGregorianCalendarAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value =
                    TypeMapperUtils.getGregorianCalendarMapper().mapObject(this.getAttribute(name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasGregorianCalendarAttributeWithValue(@NonNull String name, GregorianCalendar value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getGregorianCalendarMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
