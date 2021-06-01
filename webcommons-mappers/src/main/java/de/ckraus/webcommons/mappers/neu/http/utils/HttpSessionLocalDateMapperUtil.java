package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLocalDateMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;

public interface HttpSessionLocalDateMapperUtil extends ScopeLocalDateMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default LocalDate getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLocalDateMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLocalDateMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeLocalDateMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
