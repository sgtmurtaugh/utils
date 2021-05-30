package de.ckraus.commons.mapper;

public interface DoubleMapper extends NumericTypeMapper<Double> {

    @Override
    default Double toType(Number number) {
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
