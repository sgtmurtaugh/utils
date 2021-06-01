package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeCharacterMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestCharacterMapperUtil extends ScopeCharacterMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Character getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeCharacterMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeCharacterMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeCharacterMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
