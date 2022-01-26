package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.text.DateFormat;
import java.util.Calendar;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class CalendarMapperTest {

    private final CalendarMapper<Calendar> mapper = new CalendarMapper<>() {
        @Override
        public Class<Calendar> forType() {
            return Calendar.class;
        }

        @Override
        public Calendar map(String s, boolean bTrim, boolean bEmptyIsNull, Calendar defaultValue) {
            return defaultValue;
        }

        @Override
        public Calendar map(String s, DateFormat format, boolean lenient, Calendar defaultValue) {
            return defaultValue;
        }
    };

}
