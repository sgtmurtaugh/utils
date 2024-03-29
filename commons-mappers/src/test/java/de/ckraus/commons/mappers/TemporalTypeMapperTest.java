package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class TemporalTypeMapperTest {

    private final TemporalTypeMapper mapper = new TemporalTypeMapper() {
        @Override
        public Temporal map(String s, DateTimeFormatter formatter, Temporal defaultValue) {
            return defaultValue;
        }

        @Override
        public Temporal map(String s, FormatStyle formatStyle, Temporal defaultValue) {
            return defaultValue;
        }

        @Override
        public Class forType() {
            return Temporal.class;
        }

        @Override
        public Object map(String s, boolean bTrim, boolean bEmptyIsNull, Object defaultValue) {
            return defaultValue;
        }
    };

}
