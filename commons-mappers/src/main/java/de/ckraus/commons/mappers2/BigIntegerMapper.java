package de.ckraus.commons.mappers2;

import java.math.BigInteger;

public interface BigIntegerMapper extends NumericTypeMapper<BigInteger> {

    @Override
    BigInteger toType(Number number);

}
