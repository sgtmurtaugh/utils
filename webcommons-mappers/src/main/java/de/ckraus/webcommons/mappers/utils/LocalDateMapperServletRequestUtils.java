package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mappers.TypeMapperFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateMapperServletRequestUtils
        extends ServletRequestUtils, LocalDateMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default LocalDate getLocalDateParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getLocalDateMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDate getLocalDateParameter(ServletRequest request, String name, LocalDate defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateMapper().map(request.getParameter(name), defaultValue);
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
    default LocalDate getLocalDateParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getLocalDateMapper().getDefaultValue();
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
    default LocalDate getLocalDateParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                            LocalDate defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getLocalDateMapper()
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
    default boolean hasLocalDateParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getLocalDateMapper()
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
    default boolean hasLocalDateParameterWithValue(ServletRequest request, String name, LocalDate value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getLocalDateMapper()
                                                                      .map(request.getParameter(name), (LocalDate) null))
                                      .isEquals();
        }
        return false;
    }

}
