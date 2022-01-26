package de.ckraus.commons.mappers2;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.util.Locale;

@SuppressWarnings({ "javadoc", "unused" })
public interface TemporalTypeMapper<T extends Temporal> extends TypeMapper<T> {

    /**
     * map
     *
     * @param s
     * @param formatter
     *
     * @return
     */
    T map(String s, DateTimeFormatter formatter);

    /**
     * map
     *
     * @param s
     * @param formatter
     * @param defaultValue
     *
     * @return
     */
    T map(String s, DateTimeFormatter formatter, T defaultValue);

    /**
     * map
     *
     * @param s
     * @param formatStyle
     *
     * @return
     */
    T map(String s, FormatStyle formatStyle);

    /**
     * map
     *
     * @param s
     * @param formatStyle
     * @param defaultValue
     *
     * @return
     */
    T map(String s, FormatStyle formatStyle, T defaultValue);

    /**
     * map
     *
     * @param s
     * @param sPattern
     *
     * @return
     */
    T map(String s, String sPattern);

    /**
     * map
     *
     * @param s
     * @param sPattern
     * @param defaultValue
     *
     * @return
     */
    T map(String s, String sPattern, T defaultValue);

    /**
     * map
     *
     * @param s
     * @param sPattern
     * @param locale
     *
     * @return
     */
    T map(String s, String sPattern, Locale locale);

    /**
     * map
     *
     * @param s
     * @param sPattern
     * @param locale
     * @param defaultValue
     *
     * @return
     */
    T map(String s, String sPattern, Locale locale, T defaultValue);

}
