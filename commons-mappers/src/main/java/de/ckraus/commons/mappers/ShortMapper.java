package de.ckraus.commons.mappers;

public interface ShortMapper extends NumericTypeMapper<Short> {

    @Override
    default Short toType(Number number) {
        Short returnValue = null;

        if (number instanceof Short) {
            returnValue = (Short) number;
        }
        else if (null != number) {
            returnValue = number.shortValue();
        }
        return returnValue;
    }

}
