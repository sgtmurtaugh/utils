package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class IntegerHttpSessionMapper extends HttpSessionMapperBase<Integer> {

    /**
     * Constructor
     */
    IntegerHttpSessionMapper() {
        super(Integer.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static IntegerHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getIntegerMapper();
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
