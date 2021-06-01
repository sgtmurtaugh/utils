package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestByteMapperUtil extends ScopeByteMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Byte getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeByteMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeByteMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeByteMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
