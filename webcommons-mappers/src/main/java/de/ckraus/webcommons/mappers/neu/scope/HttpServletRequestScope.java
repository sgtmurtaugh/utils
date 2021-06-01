package de.ckraus.webcommons.mappers.neu.scope;

import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;

public interface HttpServletRequestScope extends Scope<HttpServletRequest> {

    @Override
    default Object getAttribute(@NonNull HttpServletRequest request, @NonNull String name) {
        return request.getAttribute(name);
    }

}
