package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.math.BigDecimal;

public interface ServletRequestBigDecimalMapperUtil extends ScopeBigDecimalMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default BigDecimal getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeBigDecimalMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeBigDecimalMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeBigDecimalMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
