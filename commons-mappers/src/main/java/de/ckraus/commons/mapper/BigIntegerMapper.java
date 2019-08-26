package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class BigIntegerMapper extends AbstractNumericTypeMapper<BigInteger> implements IBigIntegerMapper {

    private final static String CLASS = BigIntegerMapper.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(BigIntegerMapper.class);


    /**
     * Constructor
     */
    public BigIntegerMapper() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public BigIntegerMapper( BigInteger defaultValue ) {
        super( defaultValue );
    }

}
