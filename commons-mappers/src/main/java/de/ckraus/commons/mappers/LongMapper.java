package de.ckraus.commons.mappers;

public interface LongMapper extends NumericTypeMapper<Long> {

    @Override
    default Long toType(Number number) {
        Long returnValue = null;

        if (number instanceof Long) {
            returnValue = (Long) number;
        }
        else if (null != number) {
            returnValue = number.longValue();
        }
        return returnValue;
    }

}
