package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class IntegerMapperImpl extends NumericTypeMapperBase<Integer> implements IntegerMapper {

    private final static String CLASS = IntegerMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(IntegerMapper.class);


    /**
     * Constructor
     */
    public IntegerMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public IntegerMapperImpl( Integer defaultValue ) {
        super( defaultValue );
    }

}
