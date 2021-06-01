package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLocalTimeMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalTime;

public interface HttpServletRequestLocalTimeMapperUtil extends ScopeLocalTimeMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default LocalTime getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLocalTimeMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLocalTimeMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeLocalTimeMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
