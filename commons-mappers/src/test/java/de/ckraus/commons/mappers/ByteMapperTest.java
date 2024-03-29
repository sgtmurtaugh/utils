package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;
import java.util.Map;

import static de.ckraus.commons.mappers.TestHelper.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
@SuppressWarnings({ "javadoc", "Duplicates" })
class ByteMapperTest {

    private final static Locale locale = Locale.GERMAN;
    private final static String FORMAT_PATTERN = "#,##0.00;(#,##0.00)";

    private final static Byte ANOTHER_DEFAULT_VALUE = Byte.parseByte("64");

    private final ByteMapper mapper = () -> Byte.class;


    /**
     * getDefaultBigDecimal
     *
     * @return
     */
    private Byte getDefaultBigDecimal() {
        return ((BigDecimal) getParameters().get(PARAMS_KEY_BIG_DECIMAL)).byteValue();
    }

    /**
     * getDefaultBigDecimal
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultBigDecimal(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(
                    format.parse(getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING).toString()).toString()).byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultBigInteger
     *
     * @return
     */
    private Byte getDefaultBigInteger() {
        return ((BigInteger) getParameters().get(PARAMS_KEY_BIG_INTEGER)).byteValue();
    }

    /**
     * getDefaultBigInteger
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultBigInteger(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(
                    format.parse(getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING).toString()).toString()).byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultByte
     *
     * @return
     */
    private Byte getDefaultByte() {
        return (Byte) getParameters().get(PARAMS_KEY_BYTE);
    }

    /**
     * getDefaultByte
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultByte(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(format.parse(getParameters().get(PARAMS_KEY_BYTE_STRING).toString()).toString())
                    .byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultDouble
     *
     * @return
     */
    private Byte getDefaultDouble() {
        return ((Double) getParameters().get(PARAMS_KEY_DOUBLE)).byteValue();
    }

    /**
     * getDefaultDouble
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultDouble(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(format.parse(getParameters().get(PARAMS_KEY_DOUBLE_STRING).toString()).toString())
                    .byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultFloat
     *
     * @return
     */
    private Byte getDefaultFloat() {
        return ((Float) getParameters().get(PARAMS_KEY_FLOAT)).byteValue();
    }

    /**
     * getDefaultFloat
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultFloat(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(format.parse(getParameters().get(PARAMS_KEY_FLOAT_STRING).toString()).toString())
                    .byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultInteger
     *
     * @return
     */
    private Byte getDefaultInteger() {
        return ((Integer) getParameters().get(PARAMS_KEY_INTEGER)).byteValue();
    }

    /**
     * getDefaultInteger
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultInteger(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue =
                    new BigDecimal(format.parse(getParameters().get(PARAMS_KEY_INTEGER_STRING).toString()).toString())
                            .byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultLong
     *
     * @return
     */
    private Byte getDefaultLong() {
        return ((Long) getParameters().get(PARAMS_KEY_LONG)).byteValue();
    }

    /**
     * getDefaultLong
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultLong(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(format.parse(getParameters().get(PARAMS_KEY_LONG_STRING).toString()).toString())
                    .byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }

    /**
     * getDefaultShort
     *
     * @return
     */
    private Byte getDefaultShort() {
        return ((Short) getParameters().get(PARAMS_KEY_SHORT)).byteValue();
    }

    /**
     * getDefaultShort
     *
     * @param locale
     *
     * @return
     */
    private Byte getDefaultShort(Locale locale) {
        Byte retValue = null;
        DecimalFormat format;

        if (null != locale) {
            format = (DecimalFormat) DecimalFormat.getInstance(locale);
        }
        else {
            format = (DecimalFormat) DecimalFormat.getInstance();
        }

        try {
            retValue = new BigDecimal(format.parse(getParameters().get(PARAMS_KEY_SHORT_STRING).toString()).toString())
                    .byteValue();
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        return retValue;
    }


    /**
     * test for {@link BigDecimalMapper#map(Map, String)}
     */
    @Test
    void map() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimal, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL));
        assertEquals(defaultBigDecimalString, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING));
        assertEquals(defaultBigInteger, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER));
        assertEquals(defaultBigIntegerString, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE));
        assertEquals(defaultByteString, mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE));
        assertEquals(defaultDoubleString, mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT));
        assertEquals(defaultFloatString, mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER));
        assertEquals(defaultIntegerString, mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG));
        assertEquals(defaultLongString, mapper.map(getParameters(), PARAMS_KEY_LONG_STRING));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT));
        assertEquals(defaultShortString, mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING));

        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_KEY));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_VALUE));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_OBJECT));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Locale)}
     */
    @Test
    void map1() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimal, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, locale));
        assertEquals(defaultBigDecimalString, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, locale));
        assertEquals(defaultBigInteger, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, locale));
        assertEquals(defaultBigIntegerString, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, locale));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, locale));
        assertEquals(defaultByteString, mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, locale));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, locale));
        assertEquals(defaultDoubleString, mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, locale));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, locale));
        assertEquals(defaultFloatString, mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, locale));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, locale));
        assertEquals(defaultIntegerString, mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, locale));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, locale));
        assertEquals(defaultLongString, mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, locale));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, locale));
        assertEquals(defaultShortString, mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, locale));

        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_KEY, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_OBJECT, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, locale));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, String)}
     */
    @Test
    void map2() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimal, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, FORMAT_PATTERN));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, FORMAT_PATTERN));
        assertEquals(defaultBigInteger, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, FORMAT_PATTERN));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, FORMAT_PATTERN));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, FORMAT_PATTERN));
        assertEquals(defaultByteString, mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, FORMAT_PATTERN));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, FORMAT_PATTERN));
        assertEquals(defaultDoubleString, mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, FORMAT_PATTERN));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, FORMAT_PATTERN));
        assertEquals(defaultFloatString, mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, FORMAT_PATTERN));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, FORMAT_PATTERN));
        assertEquals(defaultIntegerString, mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, FORMAT_PATTERN));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, FORMAT_PATTERN));
        assertEquals(defaultLongString, mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, FORMAT_PATTERN));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, FORMAT_PATTERN));
        assertEquals(defaultShortString, mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, FORMAT_PATTERN));

        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_KEY, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_OBJECT, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, FORMAT_PATTERN));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Locale, String)}
     */
    @Test
    void map3() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimal, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, locale, FORMAT_PATTERN));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultBigInteger, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, locale, FORMAT_PATTERN));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, locale, FORMAT_PATTERN));
        assertEquals(defaultByteString, mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, locale, FORMAT_PATTERN));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, locale, FORMAT_PATTERN));
        assertEquals(defaultFloatString, mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, locale, FORMAT_PATTERN));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, locale, FORMAT_PATTERN));
        assertEquals(defaultLongString, mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, locale, FORMAT_PATTERN));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, locale, FORMAT_PATTERN));
        assertEquals(defaultShortString, mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, locale, FORMAT_PATTERN));

        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_KEY, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_OBJECT, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, locale, FORMAT_PATTERN));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Locale, String, DecimalFormatSymbols)}
     */
    @Test
    void map4() {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimal,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigInteger,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultByteString,
                mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloatString,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultLongString,
                mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultShortString,
                mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, locale, FORMAT_PATTERN, symbols));

        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_NO_KEY, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_OBJECT, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, locale, FORMAT_PATTERN, symbols));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, String, DecimalFormatSymbols)}
     */
    @Test
    void map5() {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();

        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimal, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigInteger, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, FORMAT_PATTERN, symbols));
        assertEquals(defaultByteString, mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, FORMAT_PATTERN, symbols));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloatString, mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, FORMAT_PATTERN, symbols));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, FORMAT_PATTERN, symbols));
        assertEquals(defaultLongString, mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, FORMAT_PATTERN, symbols));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, FORMAT_PATTERN, symbols));
        assertEquals(defaultShortString, mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, FORMAT_PATTERN, symbols));

        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_NO_KEY, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_OBJECT, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(getParameters(), PARAMS_KEY_STRING, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(),
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, FORMAT_PATTERN, symbols));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Number)}
     */
    @Test
    void map6() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimal, mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigInteger, mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(getParameters(), PARAMS_KEY_NO_KEY, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(getParameters(), PARAMS_KEY_OBJECT, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(getParameters(), PARAMS_KEY_STRING, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Locale, Number)}
     */
    @Test
    void map7() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimal,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigInteger,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDouble, mapper.map(getParameters(), PARAMS_KEY_DOUBLE, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloat, mapper.map(getParameters(), PARAMS_KEY_FLOAT, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShort, mapper.map(getParameters(), PARAMS_KEY_SHORT, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, locale, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_KEY, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_OBJECT, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, locale, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, String, Number)}
     */
    @Test
    void map8() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimal,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigInteger,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByte, mapper.map(getParameters(), PARAMS_KEY_BYTE, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDouble,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloat,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultInteger,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLong, mapper.map(getParameters(), PARAMS_KEY_LONG, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShort,
                mapper.map(getParameters(), PARAMS_KEY_SHORT, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_KEY, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_OBJECT, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Locale, String, Number)}
     */
    @Test
    void map9() {
        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimal,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, locale, FORMAT_PATTERN,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigInteger,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, locale, FORMAT_PATTERN,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByte,
                mapper.map(getParameters(), PARAMS_KEY_BYTE, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDouble,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloat,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultInteger,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLong,
                mapper.map(getParameters(), PARAMS_KEY_LONG, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShort,
                mapper.map(getParameters(), PARAMS_KEY_SHORT, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_KEY, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_OBJECT, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, locale, FORMAT_PATTERN,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, locale, FORMAT_PATTERN,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, String, DecimalFormatSymbols, Number)}
     */
    @Test
    void map10() {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();

        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimal,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigInteger,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByte,
                mapper.map(getParameters(), PARAMS_KEY_BYTE, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDouble,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloat,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultInteger,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLong,
                mapper.map(getParameters(), PARAMS_KEY_LONG, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShort,
                mapper.map(getParameters(), PARAMS_KEY_SHORT, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_KEY, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_OBJECT, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(Map, String, Locale, String, DecimalFormatSymbols, Number)}
     */
    @Test
    void map11() {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimal = this.getDefaultBigDecimal();
        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigInteger = this.getDefaultBigInteger();
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByte = this.getDefaultByte();
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDouble = this.getDefaultDouble();
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloat = this.getDefaultFloat();
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultInteger = this.getDefaultInteger();
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLong = this.getDefaultLong();
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShort = this.getDefaultShort();
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimal,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigDecimalString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigInteger,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByte,
                mapper.map(getParameters(), PARAMS_KEY_BYTE, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.map(getParameters(), PARAMS_KEY_BYTE_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDouble,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.map(getParameters(), PARAMS_KEY_DOUBLE_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloat,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.map(getParameters(), PARAMS_KEY_FLOAT_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultInteger, mapper.map(getParameters(), PARAMS_KEY_INTEGER, locale, FORMAT_PATTERN, symbols,
                ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(getParameters(), PARAMS_KEY_INTEGER_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLong,
                mapper.map(getParameters(), PARAMS_KEY_LONG, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.map(getParameters(), PARAMS_KEY_LONG_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShort,
                mapper.map(getParameters(), PARAMS_KEY_SHORT, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.map(getParameters(), PARAMS_KEY_SHORT_STRING, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_KEY, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_NO_VALUE, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_OBJECT, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__EMPTY, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(getParameters(), PARAMS_KEY_STRING_BUILDER, locale, FORMAT_PATTERN, symbols,
                        ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String)}
     */
    @Test
    void map12() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString));
        assertEquals(defaultByteString, mapper.map(sByteString));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString));
        assertEquals(defaultFloatString, mapper.map(sFloatString));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString));
        assertEquals(defaultLongString, mapper.map(sLongString));
        assertEquals(defaultShortString, mapper.map(sShortString));

        assertEquals(mapper.getDefaultValue(), mapper.map(sNull));
        assertEquals(mapper.getDefaultValue(), mapper.map(sObject));
        assertEquals(mapper.getDefaultValue(), mapper.map(sString));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringEmpty));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmed));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmedEmpty));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringBuilder));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, boolean, boolean, Number)}
     */
    @Test
    void map13() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(sByteString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(sFloatString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(sLongString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(sShortString, true, true, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sObject, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sString, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringEmpty, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmed, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmedEmpty, true, true, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringBuilder, true, true, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Locale)}
     */
    @Test
    void map14() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, locale));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, locale));
        assertEquals(defaultByteString, mapper.map(sByteString, locale));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, locale));
        assertEquals(defaultFloatString, mapper.map(sFloatString, locale));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, locale));
        assertEquals(defaultLongString, mapper.map(sLongString, locale));
        assertEquals(defaultShortString, mapper.map(sShortString, locale));

        assertEquals(mapper.getDefaultValue(), mapper.map(sNull, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(sObject, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(sString, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringEmpty, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmed, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmedEmpty, locale));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringBuilder, locale));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, String)}
     */
    @Test
    void map15() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, FORMAT_PATTERN));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, FORMAT_PATTERN));
        assertEquals(defaultByteString, mapper.map(sByteString, FORMAT_PATTERN));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, FORMAT_PATTERN));
        assertEquals(defaultFloatString, mapper.map(sFloatString, FORMAT_PATTERN));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, FORMAT_PATTERN));
        assertEquals(defaultLongString, mapper.map(sLongString, FORMAT_PATTERN));
        assertEquals(defaultShortString, mapper.map(sShortString, FORMAT_PATTERN));

        assertEquals(mapper.getDefaultValue(), mapper.map(sNull, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sObject, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sString, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringEmpty, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmed, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmedEmpty, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringBuilder, FORMAT_PATTERN));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Locale, String)}
     */
    @Test
    void map16() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, locale, FORMAT_PATTERN));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, locale, FORMAT_PATTERN));
        assertEquals(defaultByteString, mapper.map(sByteString, locale, FORMAT_PATTERN));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, locale, FORMAT_PATTERN));
        assertEquals(defaultFloatString, mapper.map(sFloatString, locale, FORMAT_PATTERN));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, locale, FORMAT_PATTERN));
        assertEquals(defaultLongString, mapper.map(sLongString, locale, FORMAT_PATTERN));
        assertEquals(defaultShortString, mapper.map(sShortString, locale, FORMAT_PATTERN));

        assertEquals(mapper.getDefaultValue(), mapper.map(sNull, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sObject, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sString, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringEmpty, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmed, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmedEmpty, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringBuilder, locale, FORMAT_PATTERN));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Locale, String, DecimalFormatSymbols)}
     */
    @Test
    void map17() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultByteString, mapper.map(sByteString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloatString, mapper.map(sFloatString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultLongString, mapper.map(sLongString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultShortString, mapper.map(sShortString, locale, FORMAT_PATTERN, symbols));

        assertEquals(mapper.getDefaultValue(), mapper.map(sNull, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sObject, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sString, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringEmpty, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmed, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmedEmpty, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringBuilder, locale, FORMAT_PATTERN, symbols));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, String, DecimalFormatSymbols)}
     */
    @Test
    void map18() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, FORMAT_PATTERN, symbols));
        assertEquals(defaultByteString, mapper.map(sByteString, FORMAT_PATTERN, symbols));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloatString, mapper.map(sFloatString, FORMAT_PATTERN, symbols));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, FORMAT_PATTERN, symbols));
        assertEquals(defaultLongString, mapper.map(sLongString, FORMAT_PATTERN, symbols));
        assertEquals(defaultShortString, mapper.map(sShortString, FORMAT_PATTERN, symbols));

        assertEquals(mapper.getDefaultValue(), mapper.map(sNull, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sObject, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sString, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringEmpty, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmed, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringUntrimmedEmpty, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.map(sStringBuilder, FORMAT_PATTERN, symbols));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Number)}
     */
    @Test
    void map19() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(sByteString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(sFloatString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(sLongString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(sShortString, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sObject, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sString, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringEmpty, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmed, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmedEmpty, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringBuilder, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Locale, Number)}
     */
    @Test
    void map20() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(sByteString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(sFloatString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(sLongString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(sShortString, locale, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sObject, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringEmpty, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmed, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmedEmpty, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringBuilder, locale, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, String, Number)}
     */
    @Test
    void map21() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.map(sBigDecimalString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString, mapper.map(sBigIntegerString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(sByteString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(sFloatString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(sLongString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(sShortString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sObject, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringEmpty, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmed, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringUntrimmedEmpty, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringBuilder, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Locale, String, Number)}
     */
    @Test
    void map22() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString,
                mapper.map(sBigDecimalString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(sBigIntegerString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(sByteString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(sFloatString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(sLongString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(sShortString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sObject, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringEmpty, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringUntrimmed, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringUntrimmedEmpty, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringBuilder, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, String, DecimalFormatSymbols, Number)}
     */
    @Test
    void map23() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString,
                mapper.map(sBigDecimalString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(sBigIntegerString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.map(sByteString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.map(sDoubleString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.map(sFloatString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.map(sIntegerString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.map(sLongString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.map(sShortString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sObject, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringEmpty, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringUntrimmed, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringUntrimmedEmpty, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sStringBuilder, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#map(String, Locale, String, DecimalFormatSymbols, Number)}
     */
    @Test
    void map24() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString,
                mapper.map(sBigDecimalString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.map(sBigIntegerString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.map(sByteString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.map(sDoubleString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.map(sFloatString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.map(sIntegerString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.map(sLongString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.map(sShortString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.map(sNull, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sObject, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringEmpty, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringUntrimmed, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringUntrimmedEmpty, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.map(sStringBuilder, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String)}
     */
    @Test
    void unformat() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString));
        assertEquals(defaultByteString, mapper.unformat(sByteString));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString));
        assertEquals(defaultLongString, mapper.unformat(sLongString));
        assertEquals(defaultShortString, mapper.unformat(sShortString));

        assertEquals(mapper.getDefaultValue(), mapper.unformat(sNull));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sObject));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sString));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringEmpty));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmed));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmedEmpty));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringBuilder));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Locale)}
     */
    @Test
    void unformat1() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, locale));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, locale));
        assertEquals(defaultByteString, mapper.unformat(sByteString, locale));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, locale));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, locale));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, locale));
        assertEquals(defaultLongString, mapper.unformat(sLongString, locale));
        assertEquals(defaultShortString, mapper.unformat(sShortString, locale));

        assertEquals(mapper.getDefaultValue(), mapper.unformat(sNull, locale));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sObject, locale));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sString, locale));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringEmpty, locale));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmed, locale));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmedEmpty, locale));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringBuilder, locale));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, String)}
     */
    @Test
    void unformat2() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, FORMAT_PATTERN));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, FORMAT_PATTERN));
        assertEquals(defaultByteString, mapper.unformat(sByteString, FORMAT_PATTERN));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, FORMAT_PATTERN));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, FORMAT_PATTERN));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, FORMAT_PATTERN));
        assertEquals(defaultLongString, mapper.unformat(sLongString, FORMAT_PATTERN));
        assertEquals(defaultShortString, mapper.unformat(sShortString, FORMAT_PATTERN));

        assertEquals(mapper.getDefaultValue(), mapper.unformat(sNull, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sObject, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sString, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringEmpty, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmed, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmedEmpty, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringBuilder, FORMAT_PATTERN));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Locale, String)}
     */
    @Test
    void unformat3() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, locale, FORMAT_PATTERN));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, locale, FORMAT_PATTERN));
        assertEquals(defaultByteString, mapper.unformat(sByteString, locale, FORMAT_PATTERN));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, locale, FORMAT_PATTERN));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, locale, FORMAT_PATTERN));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, locale, FORMAT_PATTERN));
        assertEquals(defaultLongString, mapper.unformat(sLongString, locale, FORMAT_PATTERN));
        assertEquals(defaultShortString, mapper.unformat(sShortString, locale, FORMAT_PATTERN));

        assertEquals(mapper.getDefaultValue(), mapper.unformat(sNull, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sObject, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sString, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringEmpty, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmed, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmedEmpty, locale, FORMAT_PATTERN));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringBuilder, locale, FORMAT_PATTERN));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Locale, String, DecimalFormatSymbols)}
     */
    @Test
    void unformat4() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultByteString, mapper.unformat(sByteString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultLongString, mapper.unformat(sLongString, locale, FORMAT_PATTERN, symbols));
        assertEquals(defaultShortString, mapper.unformat(sShortString, locale, FORMAT_PATTERN, symbols));

        assertEquals(mapper.getDefaultValue(), mapper.unformat(sNull, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sObject, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sString, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringEmpty, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmed, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmedEmpty, locale, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringBuilder, locale, FORMAT_PATTERN, symbols));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, String, DecimalFormatSymbols)}
     */
    @Test
    void unformat5() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, FORMAT_PATTERN, symbols));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, FORMAT_PATTERN, symbols));
        assertEquals(defaultByteString, mapper.unformat(sByteString, FORMAT_PATTERN, symbols));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, FORMAT_PATTERN, symbols));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, FORMAT_PATTERN, symbols));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, FORMAT_PATTERN, symbols));
        assertEquals(defaultLongString, mapper.unformat(sLongString, FORMAT_PATTERN, symbols));
        assertEquals(defaultShortString, mapper.unformat(sShortString, FORMAT_PATTERN, symbols));

        assertEquals(mapper.getDefaultValue(), mapper.unformat(sNull, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sObject, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sString, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringEmpty, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmed, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringUntrimmedEmpty, FORMAT_PATTERN, symbols));
        assertEquals(mapper.getDefaultValue(), mapper.unformat(sStringBuilder, FORMAT_PATTERN, symbols));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Number)}
     */
    @Test
    void unformat6() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.unformat(sByteString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.unformat(sLongString, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.unformat(sShortString, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sNull, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sObject, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sString, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringEmpty, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringUntrimmed, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringUntrimmedEmpty, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringBuilder, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Locale, Number)}
     */
    @Test
    void unformat7() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString, mapper.unformat(sBigDecimalString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString, mapper.unformat(sBigIntegerString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.unformat(sByteString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.unformat(sLongString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.unformat(sShortString, locale, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sNull, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sObject, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sString, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringEmpty, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringUntrimmed, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringUntrimmedEmpty, locale, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringBuilder, locale, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, String, Number)}
     */
    @Test
    void unformat8() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString,
                mapper.unformat(sBigDecimalString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.unformat(sBigIntegerString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.unformat(sByteString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString, mapper.unformat(sDoubleString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString, mapper.unformat(sIntegerString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.unformat(sLongString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.unformat(sShortString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sNull, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sObject, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sString, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringEmpty, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringUntrimmed, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmedEmpty, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sStringBuilder, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Locale, String, Number)}
     */
    @Test
    void unformat9() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString,
                mapper.unformat(sBigDecimalString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.unformat(sBigIntegerString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.unformat(sByteString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.unformat(sDoubleString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.unformat(sIntegerString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.unformat(sLongString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.unformat(sShortString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sNull, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sObject, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sString, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringEmpty, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmed, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmedEmpty, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringBuilder, locale, FORMAT_PATTERN, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, String, DecimalFormatSymbols, Number)}
     */
    @Test
    void unformat10() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(null);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(null);
        Byte defaultByteString = this.getDefaultByte(null);
        Byte defaultDoubleString = this.getDefaultDouble(null);
        Byte defaultFloatString = this.getDefaultFloat(null);
        Byte defaultIntegerString = this.getDefaultInteger(null);
        Byte defaultLongString = this.getDefaultLong(null);
        Byte defaultShortString = this.getDefaultShort(null);

        assertEquals(defaultBigDecimalString,
                mapper.unformat(sBigDecimalString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.unformat(sBigIntegerString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString, mapper.unformat(sByteString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.unformat(sDoubleString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString, mapper.unformat(sFloatString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.unformat(sIntegerString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString, mapper.unformat(sLongString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString, mapper.unformat(sShortString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sNull, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sObject, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE, mapper.unformat(sString, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringEmpty, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmed, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmedEmpty, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringBuilder, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
    }

    /**
     * test for {@link BigDecimalMapper#unformat(String, Locale, String, DecimalFormatSymbols, Number)}
     */
    @Test
    void unformat11() {
        String sBigDecimalString = (String) getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING);
        String sBigIntegerString = (String) getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING);
        String sByteString = (String) getParameters().get(PARAMS_KEY_BYTE_STRING);
        String sDoubleString = (String) getParameters().get(PARAMS_KEY_DOUBLE_STRING);
        String sFloatString = (String) getParameters().get(PARAMS_KEY_FLOAT_STRING);
        String sIntegerString = (String) getParameters().get(PARAMS_KEY_INTEGER_STRING);
        String sLongString = (String) getParameters().get(PARAMS_KEY_LONG_STRING);
        String sShortString = (String) getParameters().get(PARAMS_KEY_SHORT_STRING);

        String sNull = null;
        String sObject = getParameters().get(PARAMS_KEY_OBJECT).toString();
        String sString = (String) getParameters().get(PARAMS_KEY_STRING);
        String sStringEmpty = (String) getParameters().get(PARAMS_KEY_STRING__EMPTY);
        String sStringUntrimmed = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED);
        String sStringUntrimmedEmpty = (String) getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY);
        String sStringBuilder = getParameters().get(PARAMS_KEY_STRING_BUILDER).toString();

        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);

        Byte defaultBigDecimalString = this.getDefaultBigDecimal(locale);
        Byte defaultBigIntegerString = this.getDefaultBigInteger(locale);
        Byte defaultByteString = this.getDefaultByte(locale);
        Byte defaultDoubleString = this.getDefaultDouble(locale);
        Byte defaultFloatString = this.getDefaultFloat(locale);
        Byte defaultIntegerString = this.getDefaultInteger(locale);
        Byte defaultLongString = this.getDefaultLong(locale);
        Byte defaultShortString = this.getDefaultShort(locale);

        assertEquals(defaultBigDecimalString,
                mapper.unformat(sBigDecimalString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultBigIntegerString,
                mapper.unformat(sBigIntegerString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultByteString,
                mapper.unformat(sByteString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultDoubleString,
                mapper.unformat(sDoubleString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultFloatString,
                mapper.unformat(sFloatString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultIntegerString,
                mapper.unformat(sIntegerString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultLongString,
                mapper.unformat(sLongString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(defaultShortString,
                mapper.unformat(sShortString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));

        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sNull, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sObject, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sString, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringEmpty, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmed, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringUntrimmedEmpty, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
        assertEquals(ANOTHER_DEFAULT_VALUE,
                mapper.unformat(sStringBuilder, locale, FORMAT_PATTERN, symbols, ANOTHER_DEFAULT_VALUE));
    }

}
