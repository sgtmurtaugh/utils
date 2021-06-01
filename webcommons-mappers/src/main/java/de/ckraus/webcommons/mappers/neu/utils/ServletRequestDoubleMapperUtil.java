package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestDoubleMapperUtil extends ScopeDoubleMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Double getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeDoubleMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeDoubleMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeDoubleMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
