package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("floatMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class FloatMapperImpl extends NumericTypeMapperBase<Float> implements FloatMapper {

    /**
     * Constructor
     */
    public FloatMapperImpl() {
        super(Float.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public FloatMapperImpl(Float defaultValue) {
        super(Float.class, defaultValue);
    }

}
