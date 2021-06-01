package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeDateMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.util.Date;

public interface HttpSessionDateMapperUtil extends ScopeDateMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default Date getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeDateMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeDateMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeDateMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
