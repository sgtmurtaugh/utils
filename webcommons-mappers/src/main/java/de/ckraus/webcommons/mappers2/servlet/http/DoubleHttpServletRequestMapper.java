package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class DoubleHttpServletRequestMapper extends HttpServletRequestMapperBase<Double> {

    /**
     * Constructor
     */
    DoubleHttpServletRequestMapper() {
        super(Double.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static DoubleHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getDoubleMapper();
    }

    @Override
    protected TypeMapper<Double> getMapper() {
        return TypeMapperUtils.getDoubleMapper();
    }

    @Override
    protected Double mapValue(Object value, Double defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Double mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Double defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
