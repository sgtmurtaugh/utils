package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.util.GregorianCalendar;

public class GregorianCalendarHttpSessionMapper extends HttpSessionMapperBase<GregorianCalendar> {

    /**
     * Constructor
     */
    GregorianCalendarHttpSessionMapper() {
        super(GregorianCalendar.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static GregorianCalendarHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getGregorianCalendarMapper();
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
