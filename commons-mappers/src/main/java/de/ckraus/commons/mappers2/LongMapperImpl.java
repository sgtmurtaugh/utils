package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("longMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LongMapperImpl extends NumericTypeMapperBase<Long> implements LongMapper {

    /**
     * Constructor
     */
    LongMapperImpl() {
        super(Long.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    LongMapperImpl(Long defaultValue) {
        super(Long.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static LongMapper getInstance() {
        return TypeMapperUtils.getLongMapper();
    }

    @Override
    public Long toType(Number number) {
        Long returnValue = null;

        if (number instanceof Long) {
            returnValue = (Long) number;
        }
        else if (null != number) {
            returnValue = number.longValue();
        }
        return returnValue;
    }

}
