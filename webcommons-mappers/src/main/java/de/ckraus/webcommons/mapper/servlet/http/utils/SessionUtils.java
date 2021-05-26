package de.ckraus.webcommons.mapper.servlet.http.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface SessionUtils extends ScopeUtils<HttpSession> {

    /**
     * @param httpSession
     * @param name
     * @return
     */
    default Object getAttribute( HttpSession httpSession, String name ) {
        if ( null != httpSession && StringUtils.isNotEmpty( name ) ) {
            return httpSession.getAttribute( name );
        }
        return null;
    }

}
