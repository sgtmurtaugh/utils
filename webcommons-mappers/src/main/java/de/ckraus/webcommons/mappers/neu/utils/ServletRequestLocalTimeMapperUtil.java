package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.time.LocalTime;

public interface ServletRequestLocalTimeMapperUtil extends ScopeLocalTimeMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default LocalTime getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLocalTimeMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLocalTimeMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeLocalTimeMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
