package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class LongHttpSessionMapper extends HttpSessionMapperBase<Long> {

    /**
     * Constructor
     */
    LongHttpSessionMapper() {
        super(Long.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static LongHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getLongMapper();
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
