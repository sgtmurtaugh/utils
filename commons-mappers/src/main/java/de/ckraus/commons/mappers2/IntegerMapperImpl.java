package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("integerMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class IntegerMapperImpl extends NumericTypeMapperBase<Integer> implements IntegerMapper {

    /**
     * Constructor
     */
    IntegerMapperImpl() {
        super(Integer.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    IntegerMapperImpl(Integer defaultValue) {
        super(Integer.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static IntegerMapper getInstance() {
        return TypeMapperUtils.getIntegerMapper();
    }

    @Override
    public Integer toType(Number number) {
        Integer returnValue = null;

        if (number instanceof Integer) {
            returnValue = (Integer) number;
        }
        else if (null != number) {
            returnValue = number.intValue();
        }
        return returnValue;
    }

}
