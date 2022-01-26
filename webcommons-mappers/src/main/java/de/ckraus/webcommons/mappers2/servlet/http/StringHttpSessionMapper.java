package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class StringHttpSessionMapper extends HttpSessionMapperBase<String> {

    /**
     * Constructor
     */
    StringHttpSessionMapper() {
        super(String.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static StringHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getStringMapper();
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
