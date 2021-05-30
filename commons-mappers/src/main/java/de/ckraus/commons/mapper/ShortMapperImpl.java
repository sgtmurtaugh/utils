package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class ShortMapperImpl extends NumericTypeMapperBase<Short> implements ShortMapper {

    /**
     * Constructor
     */
    public ShortMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public ShortMapperImpl(Short defaultValue) {
        super(defaultValue);
    }

}
