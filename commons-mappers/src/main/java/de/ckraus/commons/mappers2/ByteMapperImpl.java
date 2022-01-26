package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("byteMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class ByteMapperImpl extends NumericTypeMapperBase<Byte> implements ByteMapper {

    /**
     * Constructor
     */
    ByteMapperImpl() {
        super(Byte.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    ByteMapperImpl(Byte defaultValue) {
        super(Byte.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static ByteMapper getInstance() {
        return TypeMapperUtils.getByteMapper();
    }

    @Override
    public Byte toType(Number number) {
        Byte returnValue = null;

        if (number instanceof Byte) {
            returnValue = (Byte) number;
        }
        else if (null != number) {
            returnValue = number.byteValue();
        }
        return returnValue;
    }
}
