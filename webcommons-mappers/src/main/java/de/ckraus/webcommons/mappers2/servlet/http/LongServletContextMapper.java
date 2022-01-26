package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class LongServletContextMapper extends ServletContextMapperBase<Long> {

    /**
     * Constructor
     */
    LongServletContextMapper() {
        super(Long.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static LongServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getLongMapper();
    }

    @Override
    protected TypeMapper<Long> getMapper() {
        return TypeMapperUtils.getLongMapper();
    }

    @Override
    protected Long mapValue(Object value, Long defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
