package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeBooleanMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestBooleanMapperUtil extends ScopeBooleanMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Boolean getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeBooleanMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeBooleanMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeBooleanMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
