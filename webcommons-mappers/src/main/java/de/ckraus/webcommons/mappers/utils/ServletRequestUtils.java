package de.ckraus.webcommons.mappers.utils;

import de.ckraus.webcommons.mappers.utils.ScopeUtils;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface ServletRequestUtils extends ScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     * @return
     */
    default Object getAttribute( @NonNull ServletRequest request, @NonNull String name ) {
        if ( StringUtils.isNotEmpty( name ) ) {
            return request.getAttribute( name );
        }
        return null;
    }


    /**
     * @param request
     * @param name
     * @return
     */
    default String getParameter( @NonNull ServletRequest request, @NonNull String name ) {
        if ( StringUtils.isNotEmpty( name ) ) {
            return request.getParameter( name );
        }
        return null;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default boolean hasParameter( @NonNull ServletRequest request, @NonNull String name ) {
        return ( null != this.getParameter( request, name ) );
    }


    /**
     * @param request
     * @param name
     * @param value
     * @return
     */
    default boolean hasParameterWithValue( @NonNull ServletRequest request, @NonNull String name, Object value ) {
        if ( this.hasParameter( request, name ) ) {
            return new EqualsBuilder().append( this.getAttribute( request, name ), value ).isEquals();
        }
        return false;
    }
}
