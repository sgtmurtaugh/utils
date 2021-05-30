package de.ckraus.commons.mapper;

import lombok.Getter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

class TestHelper {

    static final String PARAMS_KEY_BIG_DECIMAL = "bigDecimal";
    static final String PARAMS_KEY_BIG_DECIMAL_STRING = "bigDecimalString";
    static final String PARAMS_KEY_BIG_INTEGER = "bigInteger";
    static final String PARAMS_KEY_BIG_INTEGER_STRING = "bigIntegerString";
    static final String PARAMS_KEY_BOOLEAN = "boolean";
    static final String PARAMS_KEY_BOOLEAN_STRING = "booleanString";
    static final String PARAMS_KEY_BYTE = "byte";
    static final String PARAMS_KEY_BYTE_STRING = "byteString";
    static final String PARAMS_KEY_CALENDAR = "calendar";
    static final String PARAMS_KEY_CALENDAR_STRING = "calendarString";
    static final String PARAMS_KEY_CHARACTER = "character";
    static final String PARAMS_KEY_DATE = "date";
    static final String PARAMS_KEY_DATE_STRING = "dateString";
    static final String PARAMS_KEY_DOUBLE = "double";
    static final String PARAMS_KEY_DOUBLE_STRING = "doubleString";
    static final String PARAMS_KEY_FLOAT = "float";
    static final String PARAMS_KEY_FLOAT_STRING = "floatString";
    static final String PARAMS_KEY_INTEGER = "integer";
    static final String PARAMS_KEY_INTEGER_STRING = "integerString";
    static final String PARAMS_KEY_LIST = "list";
    static final String PARAMS_KEY_LOCALDATE = "localdate";
    static final String PARAMS_KEY_LOCALDATE_STRING = "localdateString";
    static final String PARAMS_KEY_LOCALDATETIME = "localdatetime";
    static final String PARAMS_KEY_LOCALDATETIME_STRING = "localdatetimeString";
    static final String PARAMS_KEY_LOCALTIME = "localtime";
    static final String PARAMS_KEY_LOCALTIME_STRING = "localtimeString";
    static final String PARAMS_KEY_LONG = "long";
    static final String PARAMS_KEY_LONG_STRING = "longString";
    static final String PARAMS_KEY_NO_KEY = "noKey";
    static final String PARAMS_KEY_NO_VALUE = "noValue";
    static final String PARAMS_KEY_OBJECT = "object";
    static final String PARAMS_KEY_SHORT = "short";
    static final String PARAMS_KEY_SHORT_STRING = "shortString";
    static final String PARAMS_KEY_STRING = "string";
    static final String PARAMS_KEY_STRING__EMPTY = "stringEmpty";
    static final String PARAMS_KEY_STRING__UNTRIMMED = "stringUntrimmed";
    static final String PARAMS_KEY_STRING__UNTRIMMED_EMPTY = "stringUntrimmedEmpty";
    static final String PARAMS_KEY_STRING_BUILDER = "stringBuilder";

    @Getter
    private final static Map<String, Object> parameters;

    static {
        parameters = new HashMap<>();
        parameters.put(PARAMS_KEY_BIG_DECIMAL, new BigDecimal("987654321.0123"));
        parameters.put(PARAMS_KEY_BIG_DECIMAL_STRING, "987654321,0123");
        parameters.put(PARAMS_KEY_BIG_INTEGER, new BigInteger("123456789"));
        parameters.put(PARAMS_KEY_BIG_INTEGER_STRING, "123456789");
        parameters.put(PARAMS_KEY_BOOLEAN, Boolean.TRUE);
        parameters.put(PARAMS_KEY_BOOLEAN_STRING, "true");
        parameters.put(PARAMS_KEY_BYTE, (byte) 1);
        parameters.put(PARAMS_KEY_BYTE_STRING, "1");
        parameters.put(PARAMS_KEY_CALENDAR, new GregorianCalendar());
        parameters.put(PARAMS_KEY_CALENDAR_STRING, new GregorianCalendar().toString());
        parameters.put(PARAMS_KEY_CHARACTER, 'a');
        parameters.put(PARAMS_KEY_DATE, new Date());
        parameters.put(PARAMS_KEY_DATE_STRING, new Date().toString());
        parameters.put(PARAMS_KEY_DOUBLE, 1.23d);
        parameters.put(PARAMS_KEY_DOUBLE_STRING, "1,23");
        parameters.put(PARAMS_KEY_FLOAT, 2.34f);
        parameters.put(PARAMS_KEY_FLOAT_STRING, "2,34");
        parameters.put(PARAMS_KEY_INTEGER, 42);
        parameters.put(PARAMS_KEY_INTEGER_STRING, "42");
        parameters.put(PARAMS_KEY_LIST, new ArrayList<>());
        parameters.put(PARAMS_KEY_LOCALDATE, LocalDate.now());
        parameters.put(PARAMS_KEY_LOCALDATE_STRING, LocalDate.now().toString());
        parameters.put(PARAMS_KEY_LOCALDATETIME, LocalDateTime.now());
        parameters.put(PARAMS_KEY_LOCALDATETIME_STRING, LocalDateTime.now().toString());
        parameters.put(PARAMS_KEY_LOCALTIME, LocalTime.now());
        parameters.put(PARAMS_KEY_LOCALTIME_STRING, LocalTime.now().toString());
        parameters.put(PARAMS_KEY_LONG, 4711L);
        parameters.put(PARAMS_KEY_LONG_STRING, "4711");
        parameters.put(PARAMS_KEY_NO_VALUE, null);
        parameters.put(PARAMS_KEY_OBJECT, new Object());
        parameters.put(PARAMS_KEY_SHORT, (short) 127);
        parameters.put(PARAMS_KEY_SHORT_STRING, "127");
        parameters.put(PARAMS_KEY_STRING, "Hello World!");
        parameters.put(PARAMS_KEY_STRING__EMPTY, "");
        parameters.put(PARAMS_KEY_STRING__UNTRIMMED, "   BAM!   ");
        parameters.put(PARAMS_KEY_STRING__UNTRIMMED_EMPTY, "      ");
        parameters.put(PARAMS_KEY_STRING_BUILDER, new StringBuilder("false"));
    }

}
