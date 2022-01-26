package de.ckraus.commons.mappers2;

public interface ShortMapper extends NumericTypeMapper<Short> {

    @Override
    Short toType(Number number);

}
