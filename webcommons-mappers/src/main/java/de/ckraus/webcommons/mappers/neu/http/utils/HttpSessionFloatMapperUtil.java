package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeFloatMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionFloatMapperUtil extends ScopeFloatMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Float getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeFloatMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeFloatMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeFloatMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
