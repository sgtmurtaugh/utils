package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.util.Date;

public interface ServletRequestDateMapperUtil extends ScopeDateMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default Date getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeDateMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeDateMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeDateMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
