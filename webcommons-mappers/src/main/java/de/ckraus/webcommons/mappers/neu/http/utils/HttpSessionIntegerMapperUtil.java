package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeIntegerMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionIntegerMapperUtil extends ScopeIntegerMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Integer getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeIntegerMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeIntegerMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeIntegerMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
