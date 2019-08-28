package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class DoubleMapperImpl extends NumericTypeMapperBase<Double> implements DoubleMapper {

    private final static String CLASS = DoubleMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(DoubleMapper.class);


    /**
     * Constructor
     */
    public DoubleMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public DoubleMapperImpl( Double defaultValue ) {
        super( defaultValue );
    }

}
