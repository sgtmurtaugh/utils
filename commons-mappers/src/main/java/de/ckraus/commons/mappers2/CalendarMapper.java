package de.ckraus.commons.mappers2;

import java.text.DateFormat;
import java.util.Calendar;

@SuppressWarnings({ "javadoc", "unused" })
public interface CalendarMapper<T extends Calendar> extends TypeMapper<T> {

    boolean DEFAULT_LENIENT = Boolean.FALSE;

    /**
     * map
     *
     * @param s
     * @param format
     * @param defaultValue
     *
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, Calendar)} with default lenient value
     *         {@link #DEFAULT_LENIENT}</p>
     */
    T map(String s, DateFormat format, T defaultValue);

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
    T map(String s, DateFormat format, boolean lenient, T defaultValue);

}
