package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeGregorianCalendarMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.util.GregorianCalendar;

public interface HttpServletRequestGregorianCalendarMapperUtil extends ScopeGregorianCalendarMapperUtil<HttpServletRequest>, HttpServletRequestUtil {

    @Override
    default GregorianCalendar getAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeGregorianCalendarMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpServletRequest scope, @NonNull String name) {
        return ScopeGregorianCalendarMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpServletRequest scope, @NonNull String name, Object value) {
        return ScopeGregorianCalendarMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
