package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public abstract class CalendarMapperBase<E extends Calendar> extends TypeMapperBase<E> implements CalendarMapper<E> {

    /**
     * Constructor
     */
    protected CalendarMapperBase() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    protected CalendarMapperBase(E defaultValue) {
        super(defaultValue);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected CalendarMapperBase(E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull) {
        super(defaultValue, bTrimStrings, bEmptyStringNull);
    }


}
