package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.BooleanMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BooleanMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, BooleanMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Boolean getBooleanParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getBooleanMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getBooleanMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Boolean getBooleanParameter(HttpServletRequest request, String name, Boolean defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getBooleanMapper().map(request.getParameter(name), defaultValue);
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
    default Boolean getBooleanParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getBooleanMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getBooleanMapper().getDefaultValue();
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
    default Boolean getBooleanParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                        Boolean defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getBooleanMapper()
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
    default boolean hasBooleanParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getBooleanMapper().map(request.getParameter(name), null);
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
    default boolean hasBooleanParameterWithValue(HttpServletRequest request, String name, Boolean value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getBooleanMapper().map(request.getParameter(name), null)).isEquals();
        }
        return false;
    }

}
