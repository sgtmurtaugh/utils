package de.ckraus.commons.mappers;

import java.math.BigDecimal;

public interface BigDecimalMapper extends NumericTypeMapper<BigDecimal> {

    @Override
    default BigDecimal toType(Number number) {
        BigDecimal returnValue = null;

        if (number instanceof BigDecimal) {
            returnValue = (BigDecimal) number;
        }
        else if (null != number) {
            returnValue = new BigDecimal(number.toString());
        }
        return returnValue;
    }

}
