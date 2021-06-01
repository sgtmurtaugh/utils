package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeCharacterMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionCharacterMapperUtil extends ScopeCharacterMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Character getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeCharacterMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeCharacterMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeCharacterMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
