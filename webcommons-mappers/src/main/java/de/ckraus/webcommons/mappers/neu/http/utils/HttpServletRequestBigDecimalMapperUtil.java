package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeBigDecimalMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

public interface HttpServletRequestBigDecimalMapperUtil extends ScopeBigDecimalMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default BigDecimal getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeBigDecimalMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeBigDecimalMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeBigDecimalMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }
}
