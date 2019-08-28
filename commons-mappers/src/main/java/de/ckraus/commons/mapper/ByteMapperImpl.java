package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class ByteMapperImpl extends NumericTypeMapperBase<Byte> implements ByteMapper {

    private final static String CLASS = ByteMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(ByteMapper.class);


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
