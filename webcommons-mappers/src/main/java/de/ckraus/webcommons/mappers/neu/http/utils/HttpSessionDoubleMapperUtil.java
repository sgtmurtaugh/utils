package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeDoubleMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionDoubleMapperUtil extends ScopeDoubleMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Double getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeDoubleMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeDoubleMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeDoubleMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
