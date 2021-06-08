package de.ckraus.commons.mappers;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings({ "javadoc", "unused" })
public interface GregorianCalendarMapper extends CalendarMapper<GregorianCalendar> {

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    default GregorianCalendar mapObject(Object obj, GregorianCalendar defaultValue) {
        GregorianCalendar e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof GregorianCalendar) {
            e = this.map((GregorianCalendar) obj, defaultValue);
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
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, GregorianCalendar)}
     *         with {@link DateTimeFormatter#ISO_TIME}
     */
    @Override
    default GregorianCalendar map(String s, boolean bTrim, boolean bEmptyIsNull, GregorianCalendar defaultValue) {
        return this.map(this.prepare(s, bTrim, bEmptyIsNull), DateFormat.getDateTimeInstance(), defaultValue);
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
    @Override
    default GregorianCalendar map(String s, DateFormat format, boolean lenient, GregorianCalendar defaultValue) {
        var gregorianCalendar = defaultValue;
        var preparedString = this.prepare(s, this.isTrimString(), this.isEmptyStringNull());

        if (StringUtils.isNotEmpty(preparedString) && null != format) {
            try {
                format.setLenient(lenient);
                Date date = format.parse(preparedString);
                gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
                gregorianCalendar.setTime(date);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return gregorianCalendar;
    }

}
