package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.temporal.Temporal;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public abstract class TemporalTypeMapperBase<T extends Temporal> extends TypeMapperBase<T>
        implements TemporalTypeMapper<T> {

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected TemporalTypeMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     */
    protected TemporalTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
        super(clazzType, defaultValue);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected TemporalTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings,
                                     boolean bEmptyStringNull) {
        super(clazzType, defaultValue, bTrimStrings, bEmptyStringNull);
    }

}
