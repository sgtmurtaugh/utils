package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestCharacterMapperUtil extends ScopeCharacterMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Character getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeCharacterMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeCharacterMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeCharacterMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
