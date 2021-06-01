package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.LongMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeLongMapperUtil<S> extends ScopeTypeMapperUtil<LongMapper, Long, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Long mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Long mapAttribute(@NonNull S scope, @NonNull String name, Long defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
