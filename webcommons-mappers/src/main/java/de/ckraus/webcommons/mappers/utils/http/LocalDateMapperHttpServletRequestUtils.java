package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, LocalDateMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default LocalDate getLocalDateParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper().map(request.getParameter(name));
        }
        return TypeMapperUtils.getDefaults().getLocalDateMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDate getLocalDateParameter(HttpServletRequest request, String name, LocalDate defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper().map(request.getParameter(name), defaultValue);
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
    default LocalDate getLocalDateParameter(HttpServletRequest request, String name, boolean bTrim,
                                            boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper()
                                  .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperUtils.getDefaults().getLocalDateMapper().getDefaultValue();
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
    default LocalDate getLocalDateParameter(HttpServletRequest request, String name, boolean bTrim,
                                            boolean bEmptyIsNull, LocalDate defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper()
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
    default boolean hasLocalDateParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperUtils.getDefaults().getLocalDateMapper()
                                       .map(request.getParameter(name), (LocalDate) null);
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
    default boolean hasLocalDateParameterWithValue(HttpServletRequest request, String name, LocalDate value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperUtils.getDefaults().getLocalDateMapper()
                                                                    .map(request.getParameter(name), (LocalDate) null))
                                      .isEquals();
        }
        return false;
    }

}
