package de.ckraus.commons.mappers;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface BigIntegerMapper extends NumericTypeMapper<BigInteger> {

    @Override
    default BigInteger toType(Number number) {
        BigInteger returnValue = null;

        if (number instanceof BigInteger) {
            returnValue = (BigInteger) number;
        }
        else if (null != number) {
            returnValue = new BigDecimal(number.toString()).toBigInteger();
        }
        return returnValue;
    }

}
