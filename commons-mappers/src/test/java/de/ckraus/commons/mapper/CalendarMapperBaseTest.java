package de.ckraus.commons.mapper;

import java.text.DateFormat;
import java.util.Calendar;

public class CalendarMapperBaseTest {

    private final TypeMapper<Calendar> mapper = new CalendarMapperBase<>() {
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
