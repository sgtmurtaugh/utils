package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("doubleMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class DoubleMapperImpl extends NumericTypeMapperBase<Double> implements DoubleMapper {

    /**
     * Constructor
     */
    public DoubleMapperImpl() {
        super(Double.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public DoubleMapperImpl(Double defaultValue) {
        super(Double.class, defaultValue);
    }

}
