package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public abstract class NumericTypeMapperBase<T extends Number> extends TypeMapperBase<T>
        implements NumericTypeMapper<T> {

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected NumericTypeMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     */
    protected NumericTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
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
    protected NumericTypeMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings,
                                    boolean bEmptyStringNull) {
        super(clazzType, defaultValue, bTrimStrings, bEmptyStringNull);
    }

}
