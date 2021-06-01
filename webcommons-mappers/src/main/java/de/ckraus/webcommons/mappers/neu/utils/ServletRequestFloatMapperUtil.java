package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestFloatMapperUtil extends ScopeFloatMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Float getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeFloatMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeFloatMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeFloatMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
