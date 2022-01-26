package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.util.GregorianCalendar;

public class GregorianCalendarServletContextMapper extends ServletContextMapperBase<GregorianCalendar> {

    /**
     * Constructor
     */
    GregorianCalendarServletContextMapper() {
        super(GregorianCalendar.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static GregorianCalendarServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getGregorianCalendarMapper();
    }

    @Override
    protected TypeMapper<GregorianCalendar> getMapper() {
        return TypeMapperUtils.getGregorianCalendarMapper();
    }

    @Override
    protected GregorianCalendar mapValue(Object value, GregorianCalendar defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
