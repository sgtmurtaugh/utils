package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class BigDecimalMapperImpl extends NumericTypeMapperBase<BigDecimal> implements BigDecimalMapper {

    private final static String CLASS = BigDecimalMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(BigDecimalMapper.class);


    /**
     * Constructor
     */
    public BigDecimalMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public BigDecimalMapperImpl( BigDecimal defaultValue ) {
        super( defaultValue );
    }

}
