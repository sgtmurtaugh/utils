package de.ckraus.commons.mapper;

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
    public ShortMapperImpl() {
        super(Short.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public ShortMapperImpl(Short defaultValue) {
        super(Short.class, defaultValue);
    }

}
