package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class IntegerHttpServletRequestMapper extends HttpServletRequestMapperBase<Integer> {

    /**
     * Constructor
     */
    IntegerHttpServletRequestMapper() {
        super(Integer.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static IntegerHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getIntegerMapper();
    }

    @Override
    protected TypeMapper<Integer> getMapper() {
        return TypeMapperUtils.getIntegerMapper();
    }

    @Override
    protected Integer mapValue(Object value, Integer defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Integer mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Integer defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

    /* ##### statische Delegate Methoden (fuer die TLDs)  ################################################## */

}
