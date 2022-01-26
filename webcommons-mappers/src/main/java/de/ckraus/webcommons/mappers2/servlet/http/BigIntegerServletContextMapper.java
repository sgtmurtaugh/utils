package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.math.BigInteger;

public class BigIntegerServletContextMapper extends ServletContextMapperBase<BigInteger> {

    /**
     * Constructor
     */
    BigIntegerServletContextMapper() {
        super(BigInteger.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static BigIntegerServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getBigIntegerMapper();
    }

    @Override
    protected TypeMapper<BigInteger> getMapper() {
        return TypeMapperUtils.getBigIntegerMapper();
    }

    @Override
    protected BigInteger mapValue(Object value, BigInteger defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
