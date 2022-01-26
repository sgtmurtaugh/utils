package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class FloatServletContextMapper extends ServletContextMapperBase<Float> {

    /**
     * Constructor
     */
    FloatServletContextMapper() {
        super(Float.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static FloatServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getFloatMapper();
    }

    @Override
    protected TypeMapper<Float> getMapper() {
        return TypeMapperUtils.getFloatMapper();
    }

    @Override
    protected Float mapValue(Object value, Float defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
