package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeByteMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionByteMapperUtil extends ScopeByteMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Byte getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeByteMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeByteMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeByteMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
