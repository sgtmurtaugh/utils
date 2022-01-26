package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class BooleanHttpSessionMapper extends HttpSessionMapperBase<Boolean> {

    /**
     * Constructor
     */
    BooleanHttpSessionMapper() {
        super(Boolean.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static BooleanHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getBooleanMapper();
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
