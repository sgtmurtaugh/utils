package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeUtil;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface HttpSessionUtil extends ScopeUtil<HttpSession> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Object getAttribute(@NonNull HttpSession session, @NonNull String name) {
        if (StringUtils.isNotEmpty(name)) {
            return session.getAttribute(name);
        }
        return null;
    }

}
