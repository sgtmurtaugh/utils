package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.util.GregorianCalendar;

public interface ServletRequestGregorianCalendarMapperUtil extends ScopeGregorianCalendarMapperUtil<ServletRequest>, ServletRequestUtil {

    @Override
    default GregorianCalendar getAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeGregorianCalendarMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull ServletRequest scope, @NonNull String name) {
        return ScopeGregorianCalendarMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull ServletRequest scope, @NonNull String name, Object value) {
        return ScopeGregorianCalendarMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
