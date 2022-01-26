package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

@Component("localDateMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalDateMapperImpl extends TemporalTypeMapperBase<LocalDate> implements LocalDateMapper {

    /**
     * Constructor
     */
    LocalDateMapperImpl() {
        super(LocalDate.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    LocalDateMapperImpl(LocalDate defaultValue) {
        super(LocalDate.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static LocalDateMapper getInstance() {
        return TypeMapperUtils.getLocalDateMapper();
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
    public LocalDate mapObject(Object obj, LocalDate defaultValue) {
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
    public LocalDate map(String s, boolean bTrim, boolean bEmptyIsNull, LocalDate defaultValue) {
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
    public LocalDate map(String s, DateTimeFormatter formatter, LocalDate defaultValue) {
        LocalDate localDate = defaultValue;
        String preparedString = this.prepare(s, this.isTrimString(), this.isEmptyStringNull());

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
    public LocalDate map(String s, FormatStyle formatStyle, LocalDate defaultValue) {
        DateTimeFormatter formatter = null;

        if (null != formatStyle) {
            formatter = DateTimeFormatter.ofLocalizedDate(formatStyle);
        }

        return this.map(s, formatter, defaultValue);
    }

}
