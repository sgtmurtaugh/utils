package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mappers.FloatMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeFloatMapperUtil<S> extends ScopeTypeMapperUtil<FloatMapper, Float, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Float mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Float mapAttribute(@NonNull S scope, @NonNull String name, Float defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
