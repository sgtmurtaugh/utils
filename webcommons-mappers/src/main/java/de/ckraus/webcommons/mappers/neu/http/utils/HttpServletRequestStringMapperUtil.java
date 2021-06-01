package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeStringMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestStringMapperUtil extends ScopeStringMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default String getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeStringMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeStringMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeStringMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
