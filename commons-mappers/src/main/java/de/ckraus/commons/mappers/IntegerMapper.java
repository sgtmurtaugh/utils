package de.ckraus.commons.mappers;

public interface IntegerMapper extends NumericTypeMapper<Integer> {

    @Override
    default Integer toType(Number number) {
        Integer returnValue = null;

        if (number instanceof Integer) {
            returnValue = (Integer) number;
        }
        else if (null != number) {
            returnValue = number.intValue();
        }
        return returnValue;
    }

}
