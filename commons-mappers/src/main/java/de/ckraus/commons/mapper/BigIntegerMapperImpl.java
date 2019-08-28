package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class BigIntegerMapperImpl extends NumericTypeMapperBase<BigInteger> implements BigIntegerMapper {

    private final static String CLASS = BigIntegerMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(BigIntegerMapper.class);


    /**
     * Constructor
     */
    public BigIntegerMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public BigIntegerMapperImpl( BigInteger defaultValue ) {
        super( defaultValue );
    }

}