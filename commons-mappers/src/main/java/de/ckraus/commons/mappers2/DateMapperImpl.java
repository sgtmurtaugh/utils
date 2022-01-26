package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

@Component("dateMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class DateMapperImpl extends TypeMapperBase<Date> implements DateMapper {

    /**
     * Constructor
     */
    DateMapperImpl() {
        super(Date.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    DateMapperImpl(Date defaultValue) {
        super(Date.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static DateMapper getInstance() {
        return TypeMapperUtils.getDateMapper();
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
    public Date mapObject(Object obj, Date defaultValue) {
        Date e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof Date) {
            e = this.map((Date) obj, defaultValue);
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
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, Date)} with {@link
     *         DateFormat#getDateInstance()}
     */
    @Override
    public Date map(String s, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return this.map(this.prepare(s, bTrim, bEmptyIsNull), DateFormat.getDateInstance(), DEFAULT_LENIENT,
                defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param format
     * @param defaultValue
     *
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, Date)} with default lenient value
     *         {@link #DEFAULT_LENIENT}</p>
     */
    public Date map(String s, DateFormat format, Date defaultValue) {
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
    public Date map(String s, DateFormat format, boolean lenient, Date defaultValue) {
        Date date = defaultValue;
        String preparedString = this.prepare(s, this.isTrimString(), this.isEmptyStringNull());

        if (StringUtils.isNotEmpty(preparedString) && null != format) {
            try {
                format.setLenient(lenient);
                date = format.parse(preparedString);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }
}
