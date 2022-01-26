package de.ckraus.commons.mappers2;

public interface IntegerMapper extends NumericTypeMapper<Integer> {

    @Override
    Integer toType(Number number);
}
