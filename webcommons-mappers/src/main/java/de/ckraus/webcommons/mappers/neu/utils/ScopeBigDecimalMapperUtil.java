package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.BigDecimalMapper;
import lombok.NonNull;

import java.math.BigDecimal;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeBigDecimalMapperUtil<S> extends ScopeTypeMapperUtil<BigDecimalMapper, BigDecimal, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default BigDecimal mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default BigDecimal mapAttribute(@NonNull S scope, @NonNull String name, BigDecimal defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }
}
