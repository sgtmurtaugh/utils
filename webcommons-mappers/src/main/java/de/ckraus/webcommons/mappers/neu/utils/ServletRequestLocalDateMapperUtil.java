package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.time.LocalDate;

public interface ServletRequestLocalDateMapperUtil extends ScopeLocalDateMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default LocalDate getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLocalDateMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeLocalDateMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeLocalDateMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
