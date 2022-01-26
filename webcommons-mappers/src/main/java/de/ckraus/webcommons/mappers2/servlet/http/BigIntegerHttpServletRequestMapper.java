package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.math.BigInteger;

public class BigIntegerHttpServletRequestMapper extends HttpServletRequestMapperBase<BigInteger> {

    /**
     * Constructor
     */
    BigIntegerHttpServletRequestMapper() {
        super(BigInteger.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static BigIntegerHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getBigIntegerMapper();
    }

    @Override
    protected TypeMapper<BigInteger> getMapper() {
        return TypeMapperUtils.getBigIntegerMapper();
    }

    @Override
    protected BigInteger mapValue(Object value, BigInteger defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected BigInteger mapValue(String value, boolean bTrim, boolean bEmptyIsNull, BigInteger defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
