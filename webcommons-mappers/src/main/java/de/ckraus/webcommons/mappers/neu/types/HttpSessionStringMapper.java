package de.ckraus.webcommons.mappers.neu.types;


import de.ckraus.webcommons.mappers.neu.scope.HttpServletRequestScope;
import de.ckraus.webcommons.mappers.neu.scope.HttpSessionScope;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface HttpSessionStringMapper extends HttpSessionScope, ScopeStringMapper<HttpSession> {

    @Override
    default Object getAttribute(@NonNull HttpSession session, @NonNull String name) {
        return HttpSessionScope.super.getAttribute(session, name);
    }
}
