package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class ShortHttpServletRequestMapper extends HttpServletRequestMapperBase<Short> {

    /**
     * Constructor
     */
    ShortHttpServletRequestMapper() {
        super(Short.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static ShortHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getShortMapper();
    }

    @Override
    protected TypeMapper<Short> getMapper() {
        return TypeMapperUtils.getShortMapper();
    }

    @Override
    protected Short mapValue(Object value, Short defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Short mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Short defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
