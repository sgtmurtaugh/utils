package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface GregorianCalendarMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, GregorianCalendarMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperUtils.getGregorianCalendarMapper().map(request.getParameter(name));
        }
        return TypeMapperUtils.getGregorianCalendarMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(HttpServletRequest request, String name,
                                                            GregorianCalendar defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getGregorianCalendarMapper()
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
    default GregorianCalendar getGregorianCalendarParameter(HttpServletRequest request, String name, boolean bTrim,
                                                            boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperUtils.getGregorianCalendarMapper()
                                  .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperUtils.getGregorianCalendarMapper().getDefaultValue();
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
    default GregorianCalendar getGregorianCalendarParameter(HttpServletRequest request, String name, boolean bTrim,
                                                            boolean bEmptyIsNull, GregorianCalendar defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getGregorianCalendarMapper()
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
    default boolean hasGregorianCalendarParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value =
                    TypeMapperUtils.getGregorianCalendarMapper().map(request.getParameter(name), null);
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
    default boolean hasGregorianCalendarParameterWithValue(HttpServletRequest request, String name,
                                                           GregorianCalendar value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getGregorianCalendarMapper().map(request.getParameter(name), null))
                                      .isEquals();
        }
        return false;
    }

}
