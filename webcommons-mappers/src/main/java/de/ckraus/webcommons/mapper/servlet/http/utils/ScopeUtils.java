package de.ckraus.webcommons.mapper.servlet.http.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @param <E>
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface ScopeUtils<E> {

    /**
     * @param e
     * @param name
     * @return
     */
    Object getAttribute( E e, String name );

    /**
     *
     * @param e
     * @param name
     * @return
     */
    default boolean hasAttribute( E e, String name ) {
        return ( null != e && StringUtils.isNotEmpty( name ) && null != this.getAttribute( e, name ) );
    }

}
