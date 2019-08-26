package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class BigDecimalMapper extends AbstractNumericTypeMapper<BigDecimal> implements IBigDecimalMapper {

    private final static String CLASS = BigDecimalMapper.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(BigDecimalMapper.class);


    /**
     * Constructor
     */
    public BigDecimalMapper() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public BigDecimalMapper( BigDecimal defaultValue ) {
        super( defaultValue );
    }

}
