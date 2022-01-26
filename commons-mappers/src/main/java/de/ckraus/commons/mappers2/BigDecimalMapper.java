package de.ckraus.commons.mappers2;

import java.math.BigDecimal;

public interface BigDecimalMapper extends NumericTypeMapper<BigDecimal> {

    @Override
    BigDecimal toType(Number number);

}
