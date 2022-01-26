package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class StringHttpServletRequestMapper extends HttpServletRequestMapperBase<String> {

    /**
     * Constructor
     */
    StringHttpServletRequestMapper() {
        super(String.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static StringHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getStringMapper();
    }

    @Override
    protected TypeMapper<String> getMapper() {
        return TypeMapperUtils.getStringMapper();
    }

    @Override
    protected String mapValue(Object value, String defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected String mapValue(String value, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
