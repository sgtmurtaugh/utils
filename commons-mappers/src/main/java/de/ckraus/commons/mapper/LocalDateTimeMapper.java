package de.ckraus.commons.mapper;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
    default LocalDateTime mapObject(Object obj, LocalDateTime defaultValue) {
        LocalDateTime e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof LocalDateTime) {
            e = this.map((LocalDateTime) obj, defaultValue);
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
     * @return <p>Delegates to {@link #map(String, DateTimeFormatter, LocalDateTime)} with {@link
     *         DateTimeFormatter#ISO_DATE_TIME}
     */
    @Override
    default LocalDateTime map(String s, boolean bTrim, boolean bEmptyIsNull, LocalDateTime defaultValue) {
        return this.map(this.prepare(s, bTrim, bEmptyIsNull), DateTimeFormatter.ISO_DATE_TIME, defaultValue);
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
    default LocalDateTime map(String s, DateTimeFormatter formatter, LocalDateTime defaultValue) {
        var localDateTime = defaultValue;
        var preparedString = this.prepare(s, this.isTrimStrings(), this.isEmptyStringNull());

        if (StringUtils.isNotEmpty(preparedString) && null != formatter) {
            try {
                localDateTime = LocalDateTime.parse(preparedString, formatter);
            }
            catch (DateTimeParseException e) {
                e.printStackTrace();
            }
        }
        return localDateTime;
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
    default LocalDateTime map(String s, FormatStyle formatStyle, LocalDateTime defaultValue) {
        DateTimeFormatter formatter = null;

        if (null != formatStyle) {
            formatter = DateTimeFormatter.ofLocalizedDateTime(formatStyle);
        }

        return this.map(s, formatter, defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param dateStyle
     * @param timeStyle
     *
     * @return
     */
    default LocalDateTime map(String s, FormatStyle dateStyle, FormatStyle timeStyle) {
        return this.map(s, dateStyle, timeStyle, this.getDefaultValue());
    }

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
    default LocalDateTime map(String s, FormatStyle dateStyle, FormatStyle timeStyle, LocalDateTime defaultValue) {
        DateTimeFormatter formatter = null;

        if (null != dateStyle && null != timeStyle) {

            formatter = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);
        }

        return this.map(s, formatter, defaultValue);
    }

}
