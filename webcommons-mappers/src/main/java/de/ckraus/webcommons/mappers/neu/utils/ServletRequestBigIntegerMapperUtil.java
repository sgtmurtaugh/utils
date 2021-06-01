package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.math.BigInteger;

public interface ServletRequestBigIntegerMapperUtil extends ScopeBigIntegerMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default BigInteger getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeBigIntegerMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeBigIntegerMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeBigIntegerMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
