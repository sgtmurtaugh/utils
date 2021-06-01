package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.BigIntegerMapper;
import lombok.NonNull;

import java.math.BigInteger;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeBigIntegerMapperUtil<S> extends ScopeTypeMapperUtil<BigIntegerMapper, BigInteger, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default BigInteger mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default BigInteger mapAttribute(@NonNull S scope, @NonNull String name, BigInteger defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
