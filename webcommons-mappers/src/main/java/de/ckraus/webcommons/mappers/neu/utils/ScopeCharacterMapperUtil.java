package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mappers.CharacterMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeCharacterMapperUtil<S> extends ScopeTypeMapperUtil<CharacterMapper, Character, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Character mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Character mapAttribute(@NonNull S scope, @NonNull String name, Character defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
