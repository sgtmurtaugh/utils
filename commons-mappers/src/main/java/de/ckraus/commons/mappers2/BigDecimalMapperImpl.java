package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("bigDecimalMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class BigDecimalMapperImpl extends NumericTypeMapperBase<BigDecimal> implements BigDecimalMapper {

    /**
     * Constructor
     */
    BigDecimalMapperImpl() {
        super(BigDecimal.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    BigDecimalMapperImpl(BigDecimal defaultValue) {
        super(BigDecimal.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static BigDecimalMapper getInstance() {
        return TypeMapperUtils.getBigDecimalMapper();
    }

    @Override
    public BigDecimal toType(Number number) {
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
