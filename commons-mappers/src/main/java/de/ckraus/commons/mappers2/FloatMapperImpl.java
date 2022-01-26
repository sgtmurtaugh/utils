package de.ckraus.commons.mappers2;

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
    FloatMapperImpl() {
        super(Float.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    FloatMapperImpl(Float defaultValue) {
        super(Float.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static FloatMapper getInstance() {
        return TypeMapperUtils.getFloatMapper();
    }

    @Override
    public Float toType(Number number) {
        Float returnValue = null;

        if (number instanceof Float) {
            returnValue = (Float) number;
        }
        else if (null != number) {
            returnValue = number.floatValue();
        }
        return returnValue;
    }

}
