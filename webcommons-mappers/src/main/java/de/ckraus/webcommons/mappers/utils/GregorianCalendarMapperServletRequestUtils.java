package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.http.GregorianCalendarMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface GregorianCalendarMapperServletRequestUtils
        extends ServletRequestUtils, GregorianCalendarMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getGregorianCalendarMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(ServletRequest request, String name,
                                                            GregorianCalendar defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getGregorianCalendarMapper()
                                    .map(request.getParameter(name), defaultValue);
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
    default GregorianCalendar getGregorianCalendarParameter(ServletRequest request, String name, boolean bTrim,
                                                            boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getGregorianCalendarMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getGregorianCalendarMapper().getDefaultValue();
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
    default GregorianCalendar getGregorianCalendarParameter(ServletRequest request, String name, boolean bTrim,
                                                            boolean bEmptyIsNull, GregorianCalendar defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getGregorianCalendarMapper()
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
    default boolean hasGregorianCalendarParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value =
                    TypeMapperFactory.getGregorianCalendarMapper().map(request.getParameter(name), null);
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
    default boolean hasGregorianCalendarParameterWithValue(ServletRequest request, String name,
                                                           GregorianCalendar value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getGregorianCalendarMapper().map(request.getParameter(name), null))
                                      .isEquals();
        }
        return false;
    }

}
