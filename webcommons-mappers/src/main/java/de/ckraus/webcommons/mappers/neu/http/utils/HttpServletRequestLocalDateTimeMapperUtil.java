package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLocalDateTimeMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

public interface HttpServletRequestLocalDateTimeMapperUtil extends ScopeLocalDateTimeMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default LocalDateTime getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLocalDateTimeMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLocalDateTimeMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeLocalDateTimeMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
