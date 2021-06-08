package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component("bigIntegerMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class BigIntegerMapperImpl extends NumericTypeMapperBase<BigInteger> implements BigIntegerMapper {

    /**
     * Constructor
     */
    public BigIntegerMapperImpl() {
        super(BigInteger.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public BigIntegerMapperImpl(BigInteger defaultValue) {
        super(BigInteger.class, defaultValue);
    }

}
