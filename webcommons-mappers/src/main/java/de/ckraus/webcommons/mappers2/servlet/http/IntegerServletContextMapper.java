package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class IntegerServletContextMapper extends ServletContextMapperBase<Integer> {

    /**
     * Constructor
     */
    IntegerServletContextMapper() {
        super(Integer.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static IntegerServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getIntegerMapper();
    }

    @Override
    protected TypeMapper<Integer> getMapper() {
        return TypeMapperUtils.getIntegerMapper();
    }

    @Override
    protected Integer mapValue(Object value, Integer defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
