package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeStringMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionStringMapperUtil extends ScopeStringMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default String getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeStringMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeStringMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeStringMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
