package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class ShortMapperImpl extends NumericTypeMapperBase<Short> implements ShortMapper {

    private final static String CLASS = ShortMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(ShortMapper.class);


    /**
     * Constructor
     */
    public ShortMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public ShortMapperImpl( Short defaultValue ) {
        super( defaultValue );
    }

}
