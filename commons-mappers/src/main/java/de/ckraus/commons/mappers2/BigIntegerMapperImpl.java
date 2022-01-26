package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;

@Component("bigIntegerMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class BigIntegerMapperImpl extends NumericTypeMapperBase<BigInteger> implements BigIntegerMapper {

    /**
     * Constructor
     */
    BigIntegerMapperImpl() {
        super(BigInteger.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    BigIntegerMapperImpl(BigInteger defaultValue) {
        super(BigInteger.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static BigIntegerMapper getInstance() {
        return TypeMapperUtils.getBigIntegerMapper();
    }

    @Override
    public BigInteger toType(Number number) {
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
