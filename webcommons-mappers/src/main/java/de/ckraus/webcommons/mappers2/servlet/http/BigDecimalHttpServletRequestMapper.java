package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.math.BigDecimal;

public class BigDecimalHttpServletRequestMapper extends HttpServletRequestMapperBase<BigDecimal> {

    /**
     * Constructor
     */
    BigDecimalHttpServletRequestMapper() {
        super(BigDecimal.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static BigDecimalHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getBigDecimalMapper();
    }

    @Override
    protected TypeMapper<BigDecimal> getMapper() {
        return TypeMapperUtils.getBigDecimalMapper();
    }

    @Override
    protected BigDecimal mapValue(Object value, BigDecimal defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected BigDecimal mapValue(String value, boolean bTrim, boolean bEmptyIsNull, BigDecimal defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
