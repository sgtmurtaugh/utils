package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLocalTimeMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.time.LocalTime;

public interface HttpSessionLocalTimeMapperUtil extends ScopeLocalTimeMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default LocalTime getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLocalTimeMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLocalTimeMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeLocalTimeMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
