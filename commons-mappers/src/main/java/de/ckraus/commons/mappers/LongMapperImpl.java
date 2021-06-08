package de.ckraus.commons.mappers;

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
    public LongMapperImpl() {
        super(Long.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LongMapperImpl(Long defaultValue) {
        super(Long.class, defaultValue);
    }

}
