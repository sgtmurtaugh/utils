package de.ckraus.webcommons.mapper.servlet.http.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface RequestUtils extends ScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     * @return
     */
    default Object getAttribute( HttpServletRequest request, String name ) {
        if ( null != request && StringUtils.isNotEmpty( name ) ) {
            return request.getAttribute( name );
        }
        return null;
    }


    /**
     * @param request
     * @param name
     * @return
     */
    default String getParameter( HttpServletRequest request, String name ) {
        if ( null != request && StringUtils.isNotEmpty( name ) ) {
            return request.getParameter( name );
        }
        return null;
    }

}
