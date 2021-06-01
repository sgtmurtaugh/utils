package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestLongMapperUtil extends ScopeLongMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Long getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLongMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLongMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeLongMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
