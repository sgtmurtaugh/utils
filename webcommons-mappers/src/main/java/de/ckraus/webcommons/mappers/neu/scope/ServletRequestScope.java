package de.ckraus.webcommons.mappers.neu.scope;

import lombok.NonNull;

import javax.servlet.ServletRequest;

public interface ServletRequestScope extends Scope<ServletRequest> {

    @Override
    default Object getAttribute(@NonNull ServletRequest request, @NonNull String name) {
        return request.getAttribute(name);
    }

}
