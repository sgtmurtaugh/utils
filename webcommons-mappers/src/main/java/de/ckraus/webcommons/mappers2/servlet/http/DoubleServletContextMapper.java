package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class DoubleServletContextMapper extends ServletContextMapperBase<Double> {

    /**
     * Constructor
     */
    DoubleServletContextMapper() {
        super(Double.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static DoubleServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getDoubleMapper();
    }

    @Override
    protected TypeMapper<Double> getMapper() {
        return TypeMapperUtils.getDoubleMapper();
    }

    @Override
    protected Double mapValue(Object value, Double defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
