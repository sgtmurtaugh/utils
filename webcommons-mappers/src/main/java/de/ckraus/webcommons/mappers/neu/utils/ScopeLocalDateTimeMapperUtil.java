package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mappers.LocalDateTimeMapper;
import lombok.NonNull;

import java.time.LocalDateTime;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeLocalDateTimeMapperUtil<S> extends ScopeTypeMapperUtil<LocalDateTimeMapper, LocalDateTime, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default LocalDateTime mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDateTime mapAttribute(@NonNull S scope, @NonNull String name, LocalDateTime defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
