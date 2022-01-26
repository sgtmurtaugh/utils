package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class ShortServletContextMapper extends ServletContextMapperBase<Short> {

    /**
     * Constructor
     */
    ShortServletContextMapper() {
        super(Short.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static ShortServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getShortMapper();
    }

    @Override
    protected TypeMapper<Short> getMapper() {
        return TypeMapperUtils.getShortMapper();
    }

    @Override
    protected Short mapValue(Object value, Short defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
