package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.time.LocalDateTime;

public interface ServletRequestLocalDateTimeMapperUtil extends ScopeLocalDateTimeMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default LocalDateTime getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLocalDateTimeMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLocalDateTimeMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeLocalDateTimeMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
