package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class BigDecimalMapperImpl extends NumericTypeMapperBase<BigDecimal> implements BigDecimalMapper {

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
