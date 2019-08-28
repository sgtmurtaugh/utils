package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class LongMapperImpl extends NumericTypeMapperBase<Long> implements LongMapper {

    private final static String CLASS = LongMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(LongMapper.class);


    /**
     * Constructor
     */
    public LongMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LongMapperImpl( Long defaultValue ) {
        super( defaultValue );
    }

}
