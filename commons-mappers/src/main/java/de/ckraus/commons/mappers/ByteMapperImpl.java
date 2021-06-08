package de.ckraus.commons.mappers;

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
    public ByteMapperImpl() {
        super(Byte.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public ByteMapperImpl(Byte defaultValue) {
        super(Byte.class, defaultValue);
    }

}
