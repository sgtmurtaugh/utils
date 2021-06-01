package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeBigDecimalMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

public interface HttpSessionBigDecimalMapperUtil extends ScopeBigDecimalMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default BigDecimal getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeBigDecimalMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeBigDecimalMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeBigDecimalMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
