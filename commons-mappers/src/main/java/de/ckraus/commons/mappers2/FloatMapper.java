package de.ckraus.commons.mappers2;

public interface FloatMapper extends NumericTypeMapper<Float> {

    @Override
    Float toType(Number number);
}
