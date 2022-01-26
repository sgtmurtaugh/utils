package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.util.GregorianCalendar;

public class GregorianCalendarHttpServletRequestMapper extends HttpServletRequestMapperBase<GregorianCalendar> {

    /**
     * Constructor
     */
    GregorianCalendarHttpServletRequestMapper() {
        super(GregorianCalendar.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static GregorianCalendarHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getGregorianCalendarMapper();
    }

    @Override
    protected TypeMapper<GregorianCalendar> getMapper() {
        return TypeMapperUtils.getGregorianCalendarMapper();
    }

    @Override
    protected GregorianCalendar mapValue(Object value, GregorianCalendar defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected GregorianCalendar mapValue(String value, boolean bTrim, boolean bEmptyIsNull,
                                         GregorianCalendar defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
