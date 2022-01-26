package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class BooleanServletContextMapper extends ServletContextMapperBase<Boolean> {

    /**
     * Constructor
     */
    BooleanServletContextMapper() {
        super(Boolean.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static BooleanServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getBooleanMapper();
    }

    @Override
    protected TypeMapper<Boolean> getMapper() {
        return TypeMapperUtils.getBooleanMapper();
    }

    @Override
    protected Boolean mapValue(Object value, Boolean defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
