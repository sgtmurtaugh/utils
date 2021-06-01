package de.ckraus.webcommons.mappers.neu.types;


import de.ckraus.webcommons.mappers.neu.scope.ServletRequestScope;
import lombok.NonNull;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ServletRequestStringMapper extends ServletRequestScope, ScopeStringMapper<ServletRequest> {

    @Override
    default Object getAttribute(@NonNull ServletRequest request, @NonNull String name) {
        return ServletRequestScope.super.getAttribute(request, name);
    }

}
