package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class StringServletContextMapper extends ServletContextMapperBase<String> {

    /**
     * Constructor
     */
    StringServletContextMapper() {
        super(String.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static StringServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getStringMapper();
    }

    @Override
    protected TypeMapper<String> getMapper() {
        return TypeMapperUtils.getStringMapper();
    }

    @Override
    protected String mapValue(Object value, String defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
