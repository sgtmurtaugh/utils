package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestBooleanMapperUtil extends ScopeBooleanMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Boolean getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeBooleanMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeBooleanMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeBooleanMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
