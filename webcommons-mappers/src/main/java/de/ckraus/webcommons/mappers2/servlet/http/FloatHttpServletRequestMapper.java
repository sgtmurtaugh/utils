package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class FloatHttpServletRequestMapper extends HttpServletRequestMapperBase<Float> {

    /**
     * Constructor
     */
    FloatHttpServletRequestMapper() {
        super(Float.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static FloatHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getFloatMapper();
    }

    @Override
    protected TypeMapper<Float> getMapper() {
        return TypeMapperUtils.getFloatMapper();
    }

    @Override
    protected Float mapValue(Object value, Float defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Float mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Float defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
