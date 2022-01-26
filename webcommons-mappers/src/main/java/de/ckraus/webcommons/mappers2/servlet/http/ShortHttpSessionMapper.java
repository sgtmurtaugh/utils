package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class ShortHttpSessionMapper extends HttpSessionMapperBase<Short> {

    /**
     * Constructor
     */
    ShortHttpSessionMapper() {
        super(Short.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static ShortHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getShortMapper();
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
