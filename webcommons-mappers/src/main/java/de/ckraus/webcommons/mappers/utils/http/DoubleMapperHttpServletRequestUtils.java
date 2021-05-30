package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DoubleMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, DoubleMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Double getDoubleParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().map(request.getParameter(name));
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Double getDoubleParameter(HttpServletRequest request, String name, Double defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().map(request.getParameter(name), defaultValue);
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
    default Double getDoubleParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getDoubleMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperUtils.getDefaults().getDoubleMapper().getDefaultValue();
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
    default Double getDoubleParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                      Double defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getDoubleMapper()
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
    default boolean hasDoubleParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperUtils.getDefaults().getDoubleMapper().map(request.getParameter(name), (Double) null);
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
    default boolean hasDoubleParameterWithValue(HttpServletRequest request, String name, Double value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getDoubleMapper().map(request.getParameter(name), (Double) null))
                                      .isEquals();
        }
        return false;
    }

}
