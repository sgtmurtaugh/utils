package de.ckraus.commons.mappers2;

public interface ByteMapper extends NumericTypeMapper<Byte> {

    @Override
    Byte toType(Number number);

}
