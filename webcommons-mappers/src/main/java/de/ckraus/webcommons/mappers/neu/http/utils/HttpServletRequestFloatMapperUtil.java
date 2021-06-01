package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeFloatMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestFloatMapperUtil extends ScopeFloatMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Float getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeFloatMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeFloatMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeFloatMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
