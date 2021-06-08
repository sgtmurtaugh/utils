package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mappers.ByteMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeByteMapperUtil<S> extends ScopeTypeMapperUtil<ByteMapper, Byte, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Byte mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Byte mapAttribute(@NonNull S scope, @NonNull String name, Byte defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
