package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestIntegerMapperUtil extends ScopeIntegerMapperUtil<ServletRequest>, ServletRequestUtil {
    @Override
    default Integer getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeIntegerMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeIntegerMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeIntegerMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
