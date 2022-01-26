package de.ckraus.commons.mappers2;

import de.ckraus.commons.mappers.LocalDateTimeMapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

@Component("localDateTimeMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalDateTimeMapperImpl extends TemporalTypeMapperBase<LocalDateTime> implements LocalDateTimeMapper {

    /**
     * Constructor
     */
    LocalDateTimeMapperImpl() {
        super(LocalDateTime.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    LocalDateTimeMapperImpl(LocalDateTime defaultValue) {
        super(LocalDateTime.class, defaultValue);
    }


    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static LocalDateTimeMapper getInstance() {
        return TypeMapperUtils.getLocalDateTimeMapper();
    }

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    public LocalDateTime mapObject(Object obj, LocalDateTime defaultValue) {
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
    public LocalDateTime map(String s, boolean bTrim, boolean bEmptyIsNull, LocalDateTime defaultValue) {
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
    public LocalDateTime map(String s, DateTimeFormatter formatter, LocalDateTime defaultValue) {
        LocalDateTime localDateTime = defaultValue;
        String preparedString = this.prepare(s, this.isTrimString(), this.isEmptyStringNull());

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
    public LocalDateTime map(String s, FormatStyle formatStyle, LocalDateTime defaultValue) {
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
    public LocalDateTime map(String s, FormatStyle dateStyle, FormatStyle timeStyle) {
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
    public LocalDateTime map(String s, FormatStyle dateStyle, FormatStyle timeStyle, LocalDateTime defaultValue) {
        DateTimeFormatter formatter = null;

        if (null != dateStyle && null != timeStyle) {

            formatter = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);
        }

        return this.map(s, formatter, defaultValue);
    }

}
