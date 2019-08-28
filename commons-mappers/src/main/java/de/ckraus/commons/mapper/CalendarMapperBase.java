package de.ckraus.commons.mapper;

import java.util.Calendar;

@SuppressWarnings( { "javadoc", "unused" } )
public abstract class CalendarMapperBase<E extends Calendar> extends TypeMapperBase<E>
        implements CalendarMapper<E> {

    private final static String CLASS = CalendarMapperBase.class.getSimpleName();


    /**
     * Constructor
     */
    public CalendarMapperBase() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public CalendarMapperBase( E defaultValue ) {
        super( defaultValue );
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    public CalendarMapperBase( E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull ) {
        super( defaultValue, bTrimStrings, bEmptyStringNull );
    }


}
