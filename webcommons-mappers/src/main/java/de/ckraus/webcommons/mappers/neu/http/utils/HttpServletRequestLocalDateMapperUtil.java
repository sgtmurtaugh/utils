package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLocalDateMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

public interface HttpServletRequestLocalDateMapperUtil extends ScopeLocalDateMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default LocalDate getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLocalDateMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeLocalDateMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeLocalDateMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
