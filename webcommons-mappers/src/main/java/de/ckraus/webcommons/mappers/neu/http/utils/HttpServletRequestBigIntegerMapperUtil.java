package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeBigIntegerMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;

public interface HttpServletRequestBigIntegerMapperUtil extends ScopeBigIntegerMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default BigInteger getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeBigIntegerMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeBigIntegerMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeBigIntegerMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
