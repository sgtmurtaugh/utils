package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeLongMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionLongMapperUtil extends ScopeLongMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Long getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLongMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeLongMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeLongMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
