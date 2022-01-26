package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

import java.math.BigInteger;

public class BigIntegerHttpSessionMapper extends HttpSessionMapperBase<BigInteger> {

    /**
     * Constructor
     */
    BigIntegerHttpSessionMapper() {
        super(BigInteger.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static BigIntegerHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getBigIntegerMapper();
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
