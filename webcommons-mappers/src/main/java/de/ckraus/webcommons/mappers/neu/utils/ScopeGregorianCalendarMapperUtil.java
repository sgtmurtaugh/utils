package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.GregorianCalendarMapper;
import lombok.NonNull;

import java.util.GregorianCalendar;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeGregorianCalendarMapperUtil<S>
        extends ScopeTypeMapperUtil<GregorianCalendarMapper, GregorianCalendar, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default GregorianCalendar mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar mapAttribute(@NonNull S scope, @NonNull String name, GregorianCalendar defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
