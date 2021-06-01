package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLocalDateTimeMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

public interface HttpSessionLocalDateTimeMapperUtil extends ScopeLocalDateTimeMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default LocalDateTime getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLocalDateTimeMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLocalDateTimeMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeLocalDateTimeMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
