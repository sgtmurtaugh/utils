package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class ByteMapperImpl extends NumericTypeMapperBase<Byte> implements ByteMapper {

    /**
     * Constructor
     */
    public ByteMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public ByteMapperImpl( Byte defaultValue ) {
        super( defaultValue );
    }

}
