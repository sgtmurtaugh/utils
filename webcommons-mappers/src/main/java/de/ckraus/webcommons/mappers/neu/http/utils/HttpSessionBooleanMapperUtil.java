package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeBooleanMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionBooleanMapperUtil extends ScopeBooleanMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Boolean getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeBooleanMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeBooleanMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeBooleanMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
