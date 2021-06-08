package de.ckraus.commons.mappers;

import java.text.DateFormat;
import java.util.Calendar;

@SuppressWarnings({ "javadoc", "unused" })
public interface CalendarMapper<E extends Calendar> extends TypeMapper<E> {

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
    default E map(String s, DateFormat format, E defaultValue) {
        return this.map(s, format, DEFAULT_LENIENT, defaultValue);
    }

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
    E map(String s, DateFormat format, boolean lenient, E defaultValue);

}
