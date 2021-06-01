package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.DoubleMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeDoubleMapperUtil<S> extends ScopeTypeMapperUtil<DoubleMapper, Double, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Double mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Double mapAttribute(@NonNull S scope, @NonNull String name, Double defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
