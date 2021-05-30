package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.webcommons.mappers.utils.ScopeUtils;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface HttpSessionUtils extends ScopeUtils<HttpSession> {

    /**
     * @param httpSession
     * @param name
     *
     * @return
     */
    default Object getAttribute(@NonNull HttpSession httpSession, @NonNull String name) {
        if (StringUtils.isNotEmpty(name)) {
            return httpSession.getAttribute(name);
        }
        return null;
    }

}
