package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.LocalTimeMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalTimeMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, LocalTimeMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default LocalTime getLocalTimeParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getLocalTimeMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getLocalTimeMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalTime getLocalTimeParameter(HttpServletRequest request, String name, LocalTime defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLocalTimeMapper().map(request.getParameter(name), defaultValue);
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
    default LocalTime getLocalTimeParameter(HttpServletRequest request, String name, boolean bTrim,
                                            boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getLocalTimeMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getLocalTimeMapper().getDefaultValue();
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
    default LocalTime getLocalTimeParameter(HttpServletRequest request, String name, boolean bTrim,
                                            boolean bEmptyIsNull, LocalTime defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLocalTimeMapper()
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
    default boolean hasLocalTimeParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getLocalTimeMapper()
                                         .map(request.getParameter(name), (LocalTime) null);
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
    default boolean hasLocalTimeParameterWithValue(HttpServletRequest request, String name, LocalTime value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getLocalTimeMapper()
                                                                      .map(request.getParameter(name), (LocalTime) null))
                                      .isEquals();
        }
        return false;
    }

}
