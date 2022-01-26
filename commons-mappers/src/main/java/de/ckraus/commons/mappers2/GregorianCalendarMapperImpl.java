package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component("gregorianCalendarMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class GregorianCalendarMapperImpl extends CalendarMapperBase<GregorianCalendar>
        implements GregorianCalendarMapper {

    /**
     * Constructor
     */
    GregorianCalendarMapperImpl() {
        super(GregorianCalendar.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    GregorianCalendarMapperImpl(GregorianCalendar defaultValue) {
        super(GregorianCalendar.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static GregorianCalendarMapper getInstance() {
        return TypeMapperUtils.getGregorianCalendarMapper();
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
    public GregorianCalendar mapObject(Object obj, GregorianCalendar defaultValue) {
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
     *         with {@link DateFormat#getDateTimeInstance()}
     */
    @Override
    public GregorianCalendar map(String s, boolean bTrim, boolean bEmptyIsNull, GregorianCalendar defaultValue) {
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
    public GregorianCalendar map(String s, DateFormat format, boolean lenient, GregorianCalendar defaultValue) {
        GregorianCalendar gregorianCalendar = defaultValue;
        String preparedString = this.prepare(s, this.isTrimString(), this.isEmptyStringNull());

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
