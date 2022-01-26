package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class LongHttpServletRequestMapper extends HttpServletRequestMapperBase<Long> {

    /**
     * Constructor
     */
    LongHttpServletRequestMapper() {
        super(Long.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static LongHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getLongMapper();
    }

    @Override
    protected TypeMapper<Long> getMapper() {
        return TypeMapperUtils.getLongMapper();
    }

    @Override
    protected Long mapValue(Object value, Long defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Long mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Long defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
