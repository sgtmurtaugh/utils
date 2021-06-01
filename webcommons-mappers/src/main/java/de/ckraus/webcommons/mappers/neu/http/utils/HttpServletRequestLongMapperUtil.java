package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLongMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestLongMapperUtil extends ScopeLongMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Long getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLongMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLongMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeLongMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
