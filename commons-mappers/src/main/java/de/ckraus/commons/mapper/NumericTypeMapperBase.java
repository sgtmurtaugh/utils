package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public abstract class NumericTypeMapperBase<E extends Number> extends TypeMapperBase<E>
        implements NumericTypeMapper<E> {

    /**
     * Constructor
     */
    protected NumericTypeMapperBase() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    protected NumericTypeMapperBase(E defaultValue) {
        super(defaultValue);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected NumericTypeMapperBase(E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull) {
        super(defaultValue, bTrimStrings, bEmptyStringNull);
    }

}
