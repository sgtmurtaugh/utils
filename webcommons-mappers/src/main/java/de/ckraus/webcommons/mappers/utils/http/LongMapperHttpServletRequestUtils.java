package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.LongMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LongMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, LongMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Long getLongParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getLongMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getLongMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Long getLongParameter(HttpServletRequest request, String name, Long defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLongMapper().map(request.getParameter(name), defaultValue);
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
    default Long getLongParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getLongMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getLongMapper().getDefaultValue();
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
    default Long getLongParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                  Long defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLongMapper()
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
    default boolean hasLongParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getLongMapper().map(request.getParameter(name), (Long) null);
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
    default boolean hasLongParameterWithValue(HttpServletRequest request, String name, Long value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getLongMapper().map(request.getParameter(name), (Long) null))
                                      .isEquals();
        }
        return false;
    }

}
