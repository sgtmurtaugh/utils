package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.GregorianCalendarScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.util.GregorianCalendar;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface GregorianCalendarMapperServletRequest
        extends ServletRequest, ServletRequestScopeMapper, GregorianCalendarScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(@NonNull String name) {
        return TypeMapperUtils.getGregorianCalendarMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(@NonNull String name, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getGregorianCalendarMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getGregorianCalendarMapper()
                              .map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default GregorianCalendar getGregorianCalendarParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull,
                                                            GregorianCalendar defaultValue) {
        return TypeMapperUtils.getGregorianCalendarMapper()
                              .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
