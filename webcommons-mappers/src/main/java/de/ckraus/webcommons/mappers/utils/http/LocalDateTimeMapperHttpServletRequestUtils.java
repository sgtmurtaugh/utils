package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.LocalDateTimeMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateTimeMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, LocalDateTimeMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateTimeMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getLocalDateTimeMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(HttpServletRequest request, String name,
                                                    LocalDateTime defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateTimeMapper().map(request.getParameter(name), defaultValue);
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
    default LocalDateTime getLocalDateTimeParameter(HttpServletRequest request, String name, boolean bTrim,
                                                    boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateTimeMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getLocalDateTimeMapper().getDefaultValue();
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
    default LocalDateTime getLocalDateTimeParameter(HttpServletRequest request, String name, boolean bTrim,
                                                    boolean bEmptyIsNull, LocalDateTime defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateTimeMapper()
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
    default boolean hasLocalDateTimeParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getLocalDateTimeMapper()
                                         .map(request.getParameter(name), (LocalDateTime) null);
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
    default boolean hasLocalDateTimeParameterWithValue(HttpServletRequest request, String name, LocalDateTime value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getLocalDateTimeMapper()
                                                                      .map(request.getParameter(name),
                                                                            (LocalDateTime) null)).isEquals();
        }
        return false;
    }

}
