package de.ckraus.commons.mappers2;

public interface LongMapper extends NumericTypeMapper<Long> {

    @Override
    Long toType(Number number);

}
