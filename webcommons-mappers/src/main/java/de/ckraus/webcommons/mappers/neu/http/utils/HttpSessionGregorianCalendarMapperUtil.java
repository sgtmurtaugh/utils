package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeGregorianCalendarMapperUtil;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.util.GregorianCalendar;

public interface HttpSessionGregorianCalendarMapperUtil extends ScopeGregorianCalendarMapperUtil<HttpSession>, HttpSessionUtil {

    @Override
    default GregorianCalendar getAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeGregorianCalendarMapperUtil.super.getAttribute(scope, name);
    }

    @Override
    default boolean hasAttribute(@NonNull HttpSession scope, @NonNull String name) {
        return ScopeGregorianCalendarMapperUtil.super.hasAttribute(scope, name);
    }

    @Override
    default boolean hasAttributeWithValue(@NonNull HttpSession scope, @NonNull String name, Object value) {
        return ScopeGregorianCalendarMapperUtil.super.hasAttributeWithValue(scope, name, value);
    }

}
