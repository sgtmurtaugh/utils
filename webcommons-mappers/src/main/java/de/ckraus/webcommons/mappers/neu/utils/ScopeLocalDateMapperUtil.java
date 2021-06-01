package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.LocalDateMapper;
import lombok.NonNull;

import java.time.LocalDate;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeLocalDateMapperUtil<S> extends ScopeTypeMapperUtil<LocalDateMapper, LocalDate, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default LocalDate mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDate mapAttribute(@NonNull S scope, @NonNull String name, LocalDate defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
