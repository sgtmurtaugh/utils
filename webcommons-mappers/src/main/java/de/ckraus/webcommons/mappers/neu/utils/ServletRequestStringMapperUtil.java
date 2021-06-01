package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestStringMapperUtil extends ScopeStringMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default String getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeStringMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeStringMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeStringMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
