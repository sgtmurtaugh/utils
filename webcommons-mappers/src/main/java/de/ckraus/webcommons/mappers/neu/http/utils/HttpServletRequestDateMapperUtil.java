package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeDateMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public interface HttpServletRequestDateMapperUtil extends ScopeDateMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default Date getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeDateMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeDateMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeDateMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
