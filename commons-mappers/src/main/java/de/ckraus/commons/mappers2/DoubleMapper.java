package de.ckraus.commons.mappers2;

public interface DoubleMapper extends NumericTypeMapper<Double> {

    @Override
    Double toType(Number number);

}
