package de.ckraus.commons.mapper;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SuppressWarnings({ "javadoc", "unused" })
public interface DateMapper extends TypeMapper<Date> {

    boolean DEFAULT_LENIENT = Boolean.FALSE;

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    default Date mapObject(Object obj, Date defaultValue) {
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
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, Date)} with {@link DateTimeFormatter#ISO_TIME}
     */
    @Override
    default Date map(String s, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return this
                .map(this.prepare(s, bTrim, bEmptyIsNull), DateFormat.getDateInstance(), DEFAULT_LENIENT, defaultValue);
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
    default Date map(String s, DateFormat format, Date defaultValue) {
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
    default Date map(String s, DateFormat format, boolean lenient, Date defaultValue) {
        var date = defaultValue;
        var preparedString = this.prepare(s, this.isTrimStrings(), this.isEmptyStringNull());

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
