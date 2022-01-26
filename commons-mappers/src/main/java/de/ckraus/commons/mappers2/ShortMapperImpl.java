package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("shortMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class ShortMapperImpl extends NumericTypeMapperBase<Short> implements ShortMapper {

    /**
     * Constructor
     */
    ShortMapperImpl() {
        super(Short.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    ShortMapperImpl(Short defaultValue) {
        super(Short.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static ShortMapper getInstance() {
        return TypeMapperUtils.getShortMapper();
    }

    @Override
    public Short toType(Number number) {
        Short returnValue = null;

        if (number instanceof Short) {
            returnValue = (Short) number;
        }
        else if (null != number) {
            returnValue = number.shortValue();
        }
        return returnValue;
    }

}
