package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("bigDecimalMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class BigDecimalMapperImpl extends NumericTypeMapperBase<BigDecimal> implements BigDecimalMapper {

    /**
     * Constructor
     */
    public BigDecimalMapperImpl() {
        super(BigDecimal.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public BigDecimalMapperImpl(BigDecimal defaultValue) {
        super(BigDecimal.class, defaultValue);
    }

}
