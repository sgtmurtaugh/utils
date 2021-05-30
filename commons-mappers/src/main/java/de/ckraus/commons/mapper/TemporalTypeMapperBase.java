package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.temporal.Temporal;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public abstract class TemporalTypeMapperBase<E extends Temporal> extends TypeMapperBase<E>
        implements TemporalTypeMapper<E> {

    /**
     * Constructor
     */
    protected TemporalTypeMapperBase() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    protected TemporalTypeMapperBase(E defaultValue) {
        super(defaultValue);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected TemporalTypeMapperBase(E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull) {
        super(defaultValue, bTrimStrings, bEmptyStringNull);
    }

}
