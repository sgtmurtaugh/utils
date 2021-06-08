package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public abstract class CalendarMapperBase<T extends Calendar> extends TypeMapperBase<T> implements CalendarMapper<T> {

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected CalendarMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * Constructor
     *
     * @param clazzType
     * @param defaultValue
     */
    protected CalendarMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
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
    protected CalendarMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings,
                                 boolean bEmptyStringNull) {
        super(clazzType, defaultValue, bTrimStrings, bEmptyStringNull);
    }


}
