package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.math.BigDecimal;

public class BigDecimalHttpSessionMapper extends HttpSessionMapperBase<BigDecimal> {

    /**
     * Constructor
     */
    BigDecimalHttpSessionMapper() {
        super(BigDecimal.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static BigDecimalHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getBigDecimalMapper();
    }

    @Override
    protected TypeMapper<BigDecimal> getMapper() {
        return TypeMapperUtils.getBigDecimalMapper();
    }

    @Override
    protected BigDecimal mapValue(Object value, BigDecimal defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
