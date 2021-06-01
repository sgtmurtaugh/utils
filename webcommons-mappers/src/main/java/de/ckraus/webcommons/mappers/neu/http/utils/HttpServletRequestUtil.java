package de.ckraus.webcommons.mappers.neu.http.utils;

import de.ckraus.webcommons.mappers.neu.utils.ScopeUtil;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface HttpServletRequestUtil extends ScopeUtil<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Object getAttribute(@NonNull HttpServletRequest request, @NonNull String name) {
        if (StringUtils.isNotEmpty(name)) {
            return request.getAttribute(name);
        }
        return null;
    }


    /**
     * @param request
     * @param name
     *
     * @return
     */
    default String getParameter(@NonNull HttpServletRequest request, @NonNull String name) {
        if (StringUtils.isNotEmpty(name)) {
            return request.getParameter(name);
        }
        return null;
    }

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default boolean hasParameter(@NonNull HttpServletRequest request, @NonNull String name) {
// TODO: auf ParameterNames umgestellen
        return (null != this.getParameter(request, name));
    }


    /**
     * @param request
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasParameterWithValue(@NonNull HttpServletRequest request, @NonNull String name, Object value) {
        if (this.hasParameter(request, name)) {
            return new EqualsBuilder().append(this.getAttribute(request, name), value).isEquals();
        }
        return false;
    }
}
