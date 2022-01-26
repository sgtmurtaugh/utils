package de.ckraus.commons.mappers2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@SuppressWarnings({ "javadoc", "unused" })
public interface LocalDateMapper extends TemporalTypeMapper<LocalDate> {

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    LocalDate mapObject(Object obj, LocalDate defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>Delegates to {@link #map(String, DateTimeFormatter, LocalDate)}
     */
    @Override
    LocalDate map(String s, boolean bTrim, boolean bEmptyIsNull, LocalDate defaultValue);

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
    LocalDate map(String s, DateTimeFormatter formatter, LocalDate defaultValue);

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
    LocalDate map(String s, FormatStyle formatStyle, LocalDate defaultValue);

}
