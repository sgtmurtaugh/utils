package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class DoubleHttpSessionMapper extends HttpSessionMapperBase<Double> {

    /**
     * Constructor
     */
    DoubleHttpSessionMapper() {
        super(Double.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static DoubleHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getDoubleMapper();
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
