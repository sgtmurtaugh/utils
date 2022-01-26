package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("doubleMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class DoubleMapperImpl extends NumericTypeMapperBase<Double> implements DoubleMapper {

    /**
     * Constructor
     */
    DoubleMapperImpl() {
        super(Double.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    DoubleMapperImpl(Double defaultValue) {
        super(Double.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static DoubleMapper getInstance() {
        return TypeMapperUtils.getDoubleMapper();
    }

    @Override
    public Double toType(Number number) {
        Double returnValue = null;

        if (number instanceof Double) {
            returnValue = (Double) number;
        }
        else if (null != number) {
            returnValue = number.doubleValue();
        }
        return returnValue;
    }
}
