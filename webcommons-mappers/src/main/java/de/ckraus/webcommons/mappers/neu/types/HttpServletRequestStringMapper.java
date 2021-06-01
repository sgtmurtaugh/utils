package de.ckraus.webcommons.mappers.neu.types;


import de.ckraus.webcommons.mappers.neu.scope.HttpServletRequestScope;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface HttpServletRequestStringMapper extends HttpServletRequestScope, ScopeStringMapper<HttpServletRequest> {

    @Override
    default Object getAttribute(@NonNull HttpServletRequest request, @NonNull String name) {
        return HttpServletRequestScope.super.getAttribute(request, name);
    }
}
