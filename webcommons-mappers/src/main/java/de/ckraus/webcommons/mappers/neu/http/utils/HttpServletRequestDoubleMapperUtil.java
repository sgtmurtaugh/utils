package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeDoubleMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestDoubleMapperUtil extends ScopeDoubleMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Double getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeDoubleMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeDoubleMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeDoubleMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
