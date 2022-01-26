package de.ckraus.commons.mappers2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@SuppressWarnings({ "javadoc", "unused" })
public interface LocalDateTimeMapper extends TemporalTypeMapper<LocalDateTime> {

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    LocalDateTime mapObject(Object obj, LocalDateTime defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>Delegates to {@link #map(String, DateTimeFormatter, LocalDateTime)}
     */
    @Override
    LocalDateTime map(String s, boolean bTrim, boolean bEmptyIsNull, LocalDateTime defaultValue);

    /**
     * map
     *
     * @param s
     * @param formatter
     * @param defaultValue
     *
     * @return
     */
    @Override
    LocalDateTime map(String s, DateTimeFormatter formatter, LocalDateTime defaultValue);

    /**
     * map
     *
     * @param s
     * @param formatStyle
     * @param defaultValue
     *
     * @return
     */
    @Override
    LocalDateTime map(String s, FormatStyle formatStyle, LocalDateTime defaultValue);

    /**
     * map
     *
     * @param s
     * @param dateStyle
     * @param timeStyle
     *
     * @return
     */
    LocalDateTime map(String s, FormatStyle dateStyle, FormatStyle timeStyle);

    /**
     * map
     *
     * @param s
     * @param dateStyle
     * @param timeStyle
     * @param defaultValue
     *
     * @return
     */
    LocalDateTime map(String s, FormatStyle dateStyle, FormatStyle timeStyle, LocalDateTime defaultValue);

}
