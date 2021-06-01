package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeByteMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestByteMapperUtil extends ScopeByteMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Byte getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeByteMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeByteMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeByteMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
