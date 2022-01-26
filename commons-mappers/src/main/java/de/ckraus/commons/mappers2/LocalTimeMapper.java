package de.ckraus.commons.mappers2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@SuppressWarnings({ "javadoc", "unused" })
public interface LocalTimeMapper extends TemporalTypeMapper<LocalTime> {

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    LocalTime mapObject(Object obj, LocalTime defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>Delegates to {@link #map(String, DateTimeFormatter, LocalTime)} with {@link
     *         DateTimeFormatter#ISO_TIME}
     */
    @Override
    LocalTime map(String s, boolean bTrim, boolean bEmptyIsNull, LocalTime defaultValue);

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
    LocalTime map(String s, DateTimeFormatter formatter, LocalTime defaultValue);

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
    LocalTime map(String s, FormatStyle formatStyle, LocalTime defaultValue);

}
