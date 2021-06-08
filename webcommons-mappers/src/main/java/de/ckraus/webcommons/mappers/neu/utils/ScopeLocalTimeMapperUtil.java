package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mappers.LocalTimeMapper;
import lombok.NonNull;

import java.time.LocalTime;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeLocalTimeMapperUtil<S> extends ScopeTypeMapperUtil<LocalTimeMapper, LocalTime, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default LocalTime mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalTime mapAttribute(@NonNull S scope, @NonNull String name, LocalTime defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
