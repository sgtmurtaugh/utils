package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.BooleanMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeBooleanMapperUtil<S> extends ScopeTypeMapperUtil<BooleanMapper, Boolean, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Boolean mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Boolean mapAttribute(@NonNull S scope, @NonNull String name, Boolean defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
