package de.ckraus.commons.mappers2;

import java.text.DateFormat;
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
    Date mapObject(Object obj, Date defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return <p>Delegates to {@link #map(String, DateFormat, boolean, Date)}
     */
    @Override
    Date map(String s, boolean bTrim, boolean bEmptyIsNull, Date defaultValue);

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
    Date map(String s, DateFormat format, Date defaultValue);

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
    Date map(String s, DateFormat format, boolean lenient, Date defaultValue);

}
