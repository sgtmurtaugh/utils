package de.ckraus.commons.mappers;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
    default LocalDate mapObject(Object obj, LocalDate defaultValue) {
        LocalDate e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof LocalDate) {
            e = this.map((LocalDate) obj, defaultValue);
        }
        else if (obj instanceof String) {
            e = this.map((String) obj, defaultValue);
        }
        else {
            e = this.map(obj.toString(), defaultValue);
        }
        return e;
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>Delegates to {@link #map(String, DateTimeFormatter, LocalDate)} with {@link
     *         DateTimeFormatter#ISO_DATE}
     */
    @Override
    default LocalDate map(String s, boolean bTrim, boolean bEmptyIsNull, LocalDate defaultValue) {
        return this.map(this.prepare(s, bTrim, bEmptyIsNull), DateTimeFormatter.ISO_DATE, defaultValue);
    }

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
    default LocalDate map(String s, DateTimeFormatter formatter, LocalDate defaultValue) {
        var localDate = defaultValue;
        var preparedString = this.prepare(s, this.isTrimString(), this.isEmptyStringNull());

        if (StringUtils.isNotEmpty(preparedString) && null != formatter) {
            try {
                localDate = LocalDate.parse(preparedString, formatter);
            }
            catch (DateTimeParseException e) {
                e.printStackTrace();
            }
        }
        return localDate;
    }

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
    default LocalDate map(String s, FormatStyle formatStyle, LocalDate defaultValue) {
        DateTimeFormatter formatter = null;

        if (null != formatStyle) {
            formatter = DateTimeFormatter.ofLocalizedDate(formatStyle);
        }

        return this.map(s, formatter, defaultValue);
    }

}
