package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class BooleanHttpServletRequestMapper extends HttpServletRequestMapperBase<Boolean> {

    /**
     * Constructor
     */
    BooleanHttpServletRequestMapper() {
        super(Boolean.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static BooleanHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getBooleanMapper();
    }

    @Override
    protected TypeMapper<Boolean> getMapper() {
        return TypeMapperUtils.getBooleanMapper();
    }

    @Override
    protected Boolean mapValue(Object value, Boolean defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Boolean mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Boolean defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
