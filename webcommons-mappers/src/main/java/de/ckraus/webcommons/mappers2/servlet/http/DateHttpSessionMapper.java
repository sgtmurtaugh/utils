package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.util.Date;

public class DateHttpSessionMapper extends HttpSessionMapperBase<Date> {

    /**
     * Constructor
     */
    DateHttpSessionMapper() {
        super(Date.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static DateHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getDateMapper();
    }

    @Override
    protected TypeMapper<Date> getMapper() {
        return TypeMapperUtils.getDateMapper();
    }

    @Override
    protected Date mapValue(Object value, Date defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
