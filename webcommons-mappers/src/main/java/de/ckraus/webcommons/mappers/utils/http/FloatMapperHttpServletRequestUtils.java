package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.FloatMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface FloatMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, FloatMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Float getFloatParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getFloatMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getFloatMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Float getFloatParameter(HttpServletRequest request, String name, Float defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getFloatMapper().map(request.getParameter(name), defaultValue);
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
    default Float getFloatParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getFloatMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getFloatMapper().getDefaultValue();
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
    default Float getFloatParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                    Float defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getFloatMapper()
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
    default boolean hasFloatParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getFloatMapper().map(request.getParameter(name), (Float) null);
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
    default boolean hasFloatParameterWithValue(HttpServletRequest request, String name, Float value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getFloatMapper().map(request.getParameter(name), (Float) null))
                                      .isEquals();
        }
        return false;
    }

}
