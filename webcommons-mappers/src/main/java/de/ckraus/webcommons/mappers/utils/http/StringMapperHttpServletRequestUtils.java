package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.StringMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface StringMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, StringMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default String getStringAttribute(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getStringMapper()
                                    .map(this.getStringAttribute(request, name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getStringMapper().getDefaultValue();
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
    default String getStringAttribute(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                      String defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getStringMapper()
                                    .map(this.getStringAttribute(request, name, defaultValue), bTrim, bEmptyIsNull,
                                          defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default String getStringParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getStringMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getStringMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default String getStringParameter(HttpServletRequest request, String name, String defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getStringMapper().map(request.getParameter(name), defaultValue);
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
    default String getStringParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getStringMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getStringMapper().getDefaultValue();
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
    default String getStringParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                      String defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getStringMapper()
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
    default boolean hasStringParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getStringMapper().map(request.getParameter(name), null);
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
    default boolean hasStringParameterWithValue(HttpServletRequest request, String name, String value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getStringMapper().map(request.getParameter(name), null)).isEquals();
        }
        return false;
    }

}
