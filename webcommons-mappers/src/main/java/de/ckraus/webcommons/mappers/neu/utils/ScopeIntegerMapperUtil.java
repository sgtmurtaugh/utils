package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mappers.IntegerMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeIntegerMapperUtil<S> extends ScopeTypeMapperUtil<IntegerMapper, Integer, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Integer mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Integer mapAttribute(@NonNull S scope, @NonNull String name, Integer defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
