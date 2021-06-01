package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeBigIntegerMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.math.BigInteger;

public interface HttpSessionBigIntegerMapperUtil extends ScopeBigIntegerMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default BigInteger getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeBigIntegerMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeBigIntegerMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeBigIntegerMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
