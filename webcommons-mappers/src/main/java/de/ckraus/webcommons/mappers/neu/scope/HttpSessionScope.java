package de.ckraus.webcommons.mappers.neu.scope;

import lombok.NonNull;

import javax.servlet.http.HttpSession;

public interface HttpSessionScope extends Scope<HttpSession> {

    @Override
    default Object getAttribute(@NonNull HttpSession session, @NonNull String name) {
        return session.getAttribute(name);
    }

}
