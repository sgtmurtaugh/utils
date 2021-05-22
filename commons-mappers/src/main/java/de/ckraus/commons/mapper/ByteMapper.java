package de.ckraus.commons.mapper;

public interface ByteMapper extends NumericTypeMapper<Byte> {

    @Override
    default Byte toType( Number number ) {
        Byte returnValue = null;

        if ( number instanceof Byte ) {
            returnValue = ( Byte ) number;
        } else if ( null != number ) {
            returnValue = number.byteValue();
        }
        return returnValue;
    }

}
