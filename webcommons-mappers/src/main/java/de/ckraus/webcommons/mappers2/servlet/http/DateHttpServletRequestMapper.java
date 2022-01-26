package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.util.Date;

public class DateHttpServletRequestMapper extends HttpServletRequestMapperBase<Date> {

    /**
     * Constructor
     */
    DateHttpServletRequestMapper() {
        super(Date.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static DateHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getDateMapper();
    }

    @Override
    protected TypeMapper<Date> getMapper() {
        return TypeMapperUtils.getDateMapper();
    }

    @Override
    protected Date mapValue(Object value, Date defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Date mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }
}
