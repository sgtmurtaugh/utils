package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeIntegerMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestIntegerMapperUtil extends ScopeIntegerMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Integer getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeIntegerMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeIntegerMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeIntegerMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
