package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class FloatHttpSessionMapper extends HttpSessionMapperBase<Float> {

    /**
     * Constructor
     */
    FloatHttpSessionMapper() {
        super(Float.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static FloatHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getFloatMapper();
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
