package de.ckraus.commons.mappers;

import java.text.DateFormat;
import java.util.Calendar;

public class CalendarMapperBaseTest {

    private final TypeMapper<Calendar> mapper = new CalendarMapperBase<>(Calendar.class) {
        @Override
        public Calendar map(String s, DateFormat format, boolean lenient, Calendar defaultValue) {
            return defaultValue;
        }

        @Override
        public Calendar map(String s, boolean bTrim, boolean bEmptyIsNull, Calendar defaultValue) {
            return defaultValue;
        }
    };

}
