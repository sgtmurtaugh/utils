package de.ckraus.commons.mappers2;

import java.text.DateFormat;
import java.util.GregorianCalendar;

@SuppressWarnings({ "javadoc", "unused" })
public interface GregorianCalendarMapper extends CalendarMapper<GregorianCalendar> {

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    GregorianCalendar mapObject(Object obj, GregorianCalendar defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, GregorianCalendar)}
     */
    @Override
    GregorianCalendar map(String s, boolean bTrim, boolean bEmptyIsNull, GregorianCalendar defaultValue);

    /**
     * map
     *
     * @param s
     * @param format
     * @param lenient
     * @param defaultValue
     *
     * @return
     */
    @Override
    GregorianCalendar map(String s, DateFormat format, boolean lenient, GregorianCalendar defaultValue);

}
