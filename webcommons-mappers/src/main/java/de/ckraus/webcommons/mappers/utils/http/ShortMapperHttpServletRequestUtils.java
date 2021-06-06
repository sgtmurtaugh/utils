package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.ShortMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ShortMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, ShortMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Short getShortParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getShortMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getShortMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Short getShortParameter(HttpServletRequest request, String name, Short defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getShortMapper().map(request.getParameter(name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default Short getShortParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getShortMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getShortMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default Short getShortParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                    Short defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getShortMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default boolean hasShortParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getShortMapper().map(request.getParameter(name), (Short) null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param request
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasShortParameterWithValue(HttpServletRequest request, String name, Short value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getShortMapper().map(request.getParameter(name), (Short) null))
                                      .isEquals();
        }
        return false;
    }

}
