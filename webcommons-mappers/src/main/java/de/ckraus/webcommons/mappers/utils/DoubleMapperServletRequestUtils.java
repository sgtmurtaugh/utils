package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mappers.TypeMapperFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DoubleMapperServletRequestUtils extends ServletRequestUtils, DoubleMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Double getDoubleParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getDoubleMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getDoubleMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Double getDoubleParameter(ServletRequest request, String name, Double defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getDoubleMapper().map(request.getParameter(name), defaultValue);
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
    default Double getDoubleParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getDoubleMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getDoubleMapper().getDefaultValue();
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
    default Double getDoubleParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                      Double defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getDoubleMapper()
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
    default boolean hasDoubleParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getDoubleMapper().map(request.getParameter(name), (Double) null);
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
    default boolean hasDoubleParameterWithValue(ServletRequest request, String name, Double value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getDoubleMapper().map(request.getParameter(name), (Double) null))
                                      .isEquals();
        }
        return false;
    }

}
