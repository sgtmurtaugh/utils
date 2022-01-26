package de.ckraus.webcommons.mappers2.servlet.http.tld;

import de.ckraus.commons.mappers2.*;
import org.owasp.validator.html.Policy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

@SuppressWarnings({ "javadoc" })
public class TldTypeMapperUtils {
    private static final String CLASS = TldTypeMapperUtils.class.getSimpleName();
    protected static GenericLogger log = new GenericLogger(TldTypeMapperUtils.class);

    /**
     * Constructor
     */
    private TldTypeMapperUtils() {
        super();
    }


    /**
     * @return
     */
    public static synchronized TypeMapperFactoryImpl getFactory() {
        return TypeMapperUtils.getFactory();
    }

    /**
     * Liefert eine {@link BigDecimalMapperImpl} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigDecimalMapperImpl getBigDecimalMapper() {
        return TypeMapperUtils.getBigDecimalMapper();
    }

    /**
     * Liefert eine {@link BigIntegerMapperImpl} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigIntegerMapperImpl getBigIntegerMapper() {
        return getFactory().getBigIntegerMapper();
    }

    /**
     * Liefert eine {@link BooleanMapperImpl} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BooleanMapperImpl getBooleanMapper() {
        return getFactory().getBooleanMapper();
    }

    /**
     * Liefert eine {@link ByteMapperImpl} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ByteMapperImpl getByteMapper() {
        return getFactory().getByteMapper();
    }

    /**
     * Liefert eine {@link CharacterMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static CharacterMapper getCharacterMapper() {
        return getFactory().getCharacterMapper();
    }

    /**
     * Liefert eine {@link DateMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DateMapper getDateMapper() {
        return getFactory().getDateMapper();
    }

    /**
     * Liefert eine {@link DoubleMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DoubleMapper getDoubleMapper() {
        return getFactory().getDoubleMapper();
    }

    /**
     * Liefert eine {@link FloatMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static FloatMapper getFloatMapper() {
        return getFactory().getFloatMapper();
    }

    /**
     * Liefert eine {@link GregorianCalendarMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static GregorianCalendarMapper getGregorianCalendarMapper() {
        return getFactory().getGregorianCalendarMapper();
    }

    /**
     * Liefert eine {@link IntegerMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static IntegerMapper getIntegerMapper() {
        return getFactory().getIntegerMapper();
    }

    /**
     * Liefert eine {@link LocalDateMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateMapper getLocalDateMapper() {
    //        return getFactory().getLocalDateMapper();
    //    }

    /**
     * Liefert eine {@link LocalDateTimeMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateTimeMapper getLocalDateTimeMapper() {
    //        return getFactory().getLocalDateTimeMapper();
    //    }

    /**
     * Liefert eine {@link LocalTimeMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalTimeMapper getLocalTimeMapper() {
    //        return getFactory().getLocalTimeMapper();
    //    }

    /**
     * Liefert eine {@link LongMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static LongMapper getLongMapper() {
        return getFactory().getLongMapper();
    }

    /**
     * Liefert eine {@link OWASPAntiSamyHtmlMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static OWASPAntiSamyHtmlMapper getOWASPAntiSamyHtmlMapper() {
        return getFactory().getOWASPAntiSamyHtmlMapper();
    }

    /**
     * Liefert eine {@link ShortMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ShortMapper getShortMapper() {
        return getFactory().getShortMapper();
    }

    /**
     * Liefert eine {@link StringMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static StringMapper getStringMapper() {
        return getFactory().getStringMapper();
    }


    /* ############### BigDecimal ############### */


    public static BigDecimal toBigDecimal(Number number) {
        return getBigDecimalMapper().toType(number);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, Locale locale) {
        return getBigDecimalMapper().map(map, key, locale);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, String sPattern) {
        return getBigDecimalMapper().map(map, key, sPattern);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getBigDecimalMapper().map(map, key, locale, sPattern);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols) {
        return getBigDecimalMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols) {
        return getBigDecimalMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(map, key, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String sNumber) {
        return getBigDecimalMapper().map(sNumber);
    }

    public static BigDecimal mapBigDecimal(String sNumber, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(sNumber, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String s, boolean bTrim, boolean bEmptyIsNull, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, Locale locale, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(map, key, locale, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, String sPattern, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(map, key, sPattern, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, Locale locale, String sPattern,
                                           BigDecimal defaultValue) {
        return getBigDecimalMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Number number) {
        return getBigDecimalMapper().map(number);
    }

    public static BigDecimal mapBigDecimal(Number number, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(number, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String sNumber, Locale locale) {
        return getBigDecimalMapper().map(sNumber, locale);
    }

    public static BigDecimal mapBigDecimal(String sNumber, String sPattern) {
        return getBigDecimalMapper().map(sNumber, sPattern);
    }

    public static BigDecimal mapBigDecimal(String sNumber, Locale locale, String sPattern) {
        return getBigDecimalMapper().map(sNumber, locale, sPattern);
    }

    public static BigDecimal mapBigDecimal(String sNumber, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols) {
        return getBigDecimalMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static BigDecimal mapBigDecimal(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getBigDecimalMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static BigDecimal mapBigDecimal(String sNumber, Locale locale, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(sNumber, locale, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String sNumber, String sPattern, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(sNumber, sPattern, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String sNumber, Locale locale, String sPattern, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                           BigDecimal defaultValue) {
        return getBigDecimalMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String sNumber, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigDecimal unformatBigDecimal(String sNumber) {
        return getBigDecimalMapper().parse(sNumber);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, Locale locale) {
        return getBigDecimalMapper().parse(sNumber, locale);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, String sPattern) {
        return getBigDecimalMapper().parse(sNumber, sPattern);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, Locale locale, String sPattern) {
        return getBigDecimalMapper().parse(sNumber, locale, sPattern);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, Locale locale, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols) {
        return getBigDecimalMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols) {
        return getBigDecimalMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, BigDecimal defaultValue) {
        return getBigDecimalMapper().parse(sNumber, defaultValue);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, Locale locale, BigDecimal defaultValue) {
        return getBigDecimalMapper().parse(sNumber, locale, defaultValue);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, String sPattern, BigDecimal defaultValue) {
        return getBigDecimalMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, Locale locale, String sPattern,
                                                BigDecimal defaultValue) {
        return getBigDecimalMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols, BigDecimal defaultValue) {
        return getBigDecimalMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigDecimal unformatBigDecimal(String sNumber, Locale locale, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols, BigDecimal defaultValue) {
        return getBigDecimalMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableBigDecimal(Object o) {
        return getBigDecimalMapper().isMappable(o);
    }

    public static BigDecimal mapBigDecimal(Properties props, String key) {
        return getBigDecimalMapper().map(props, key);
    }

    public static BigDecimal mapBigDecimal(Properties props, String key, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(props, key, defaultValue);
    }

    public static BigDecimal mapBigDecimal(Map<String, ?> map, String key) {
        return getBigDecimalMapper().map(map, key);
    }

    public static BigDecimal mapBigDecimal(BigDecimal bigDecimal) {
        return getBigDecimalMapper().map(bigDecimal);
    }

    public static BigDecimal mapBigDecimal(BigDecimal bigDecimal, BigDecimal defaultValue) {
        return getBigDecimalMapper().map(bigDecimal, defaultValue);
    }

    public static BigDecimal mapBigDecimal(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getBigDecimalMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### BigInteger ############### */

    public static BigInteger toBigInteger(Number number) {
        return getBigIntegerMapper().toType(number);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, Locale locale) {
        return getBigIntegerMapper().map(map, key, locale);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, String sPattern) {
        return getBigIntegerMapper().map(map, key, sPattern);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getBigIntegerMapper().map(map, key, locale, sPattern);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols) {
        return getBigIntegerMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols) {
        return getBigIntegerMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, BigInteger defaultValue) {
        return getBigIntegerMapper().map(map, key, defaultValue);
    }

    public static BigInteger mapBigInteger(String sNumber) {
        return getBigIntegerMapper().map(sNumber);
    }

    public static BigInteger mapBigInteger(String sNumber, BigInteger defaultValue) {
        return getBigIntegerMapper().map(sNumber, defaultValue);
    }

    public static BigInteger mapBigInteger(String s, boolean bTrim, boolean bEmptyIsNull, BigInteger defaultValue) {
        return getBigIntegerMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, Locale locale, BigInteger defaultValue) {
        return getBigIntegerMapper().map(map, key, locale, defaultValue);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, String sPattern, BigInteger defaultValue) {
        return getBigIntegerMapper().map(map, key, sPattern, defaultValue);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, Locale locale, String sPattern,
                                           BigInteger defaultValue) {
        return getBigIntegerMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols, BigInteger defaultValue) {
        return getBigIntegerMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols, BigInteger defaultValue) {
        return getBigIntegerMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigInteger mapBigInteger(Number number) {
        return getBigIntegerMapper().map(number);
    }

    public static BigInteger mapBigInteger(Number number, BigInteger defaultValue) {
        return getBigIntegerMapper().map(number, defaultValue);
    }

    public static BigInteger mapBigInteger(String sNumber, Locale locale) {
        return getBigIntegerMapper().map(sNumber, locale);
    }

    public static BigInteger mapBigInteger(String sNumber, String sPattern) {
        return getBigIntegerMapper().map(sNumber, sPattern);
    }

    public static BigInteger mapBigInteger(String sNumber, Locale locale, String sPattern) {
        return getBigIntegerMapper().map(sNumber, locale, sPattern);
    }

    public static BigInteger mapBigInteger(String sNumber, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols) {
        return getBigIntegerMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static BigInteger mapBigInteger(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getBigIntegerMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static BigInteger mapBigInteger(String sNumber, Locale locale, BigInteger defaultValue) {
        return getBigIntegerMapper().map(sNumber, locale, defaultValue);
    }

    public static BigInteger mapBigInteger(String sNumber, String sPattern, BigInteger defaultValue) {
        return getBigIntegerMapper().map(sNumber, sPattern, defaultValue);
    }

    public static BigInteger mapBigInteger(String sNumber, Locale locale, String sPattern, BigInteger defaultValue) {
        return getBigIntegerMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static BigInteger mapBigInteger(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                           BigInteger defaultValue) {
        return getBigIntegerMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigInteger mapBigInteger(String sNumber, Locale locale, String sPattern,
                                           DecimalFormatSymbols decimalFormatSymbols, BigInteger defaultValue) {
        return getBigIntegerMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigInteger unformatBigInteger(String sNumber) {
        return getBigIntegerMapper().parse(sNumber);
    }

    public static BigInteger unformatBigInteger(String sNumber, Locale locale) {
        return getBigIntegerMapper().parse(sNumber, locale);
    }

    public static BigInteger unformatBigInteger(String sNumber, String sPattern) {
        return getBigIntegerMapper().parse(sNumber, sPattern);
    }

    public static BigInteger unformatBigInteger(String sNumber, Locale locale, String sPattern) {
        return getBigIntegerMapper().parse(sNumber, locale, sPattern);
    }

    public static BigInteger unformatBigInteger(String sNumber, Locale locale, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols) {
        return getBigIntegerMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static BigInteger unformatBigInteger(String sNumber, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols) {
        return getBigIntegerMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static BigInteger unformatBigInteger(String sNumber, BigInteger defaultValue) {
        return getBigIntegerMapper().parse(sNumber, defaultValue);
    }

    public static BigInteger unformatBigInteger(String sNumber, Locale locale, BigInteger defaultValue) {
        return getBigIntegerMapper().parse(sNumber, locale, defaultValue);
    }

    public static BigInteger unformatBigInteger(String sNumber, String sPattern, BigInteger defaultValue) {
        return getBigIntegerMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static BigInteger unformatBigInteger(String sNumber, Locale locale, String sPattern,
                                                BigInteger defaultValue) {
        return getBigIntegerMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static BigInteger unformatBigInteger(String sNumber, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols, BigInteger defaultValue) {
        return getBigIntegerMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static BigInteger unformatBigInteger(String sNumber, Locale locale, String sPattern,
                                                DecimalFormatSymbols decimalFormatSymbols, BigInteger defaultValue) {
        return getBigIntegerMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableBigInteger(Object o) {
        return getBigIntegerMapper().isMappable(o);
    }

    public static BigInteger mapBigInteger(Properties props, String key) {
        return getBigIntegerMapper().map(props, key);
    }

    public static BigInteger mapBigInteger(Properties props, String key, BigInteger defaultValue) {
        return getBigIntegerMapper().map(props, key, defaultValue);
    }

    public static BigInteger mapBigInteger(Map<String, ?> map, String key) {
        return getBigIntegerMapper().map(map, key);
    }

    public static BigInteger mapBigInteger(BigInteger bigInteger) {
        return getBigIntegerMapper().map(bigInteger);
    }

    public static BigInteger mapBigInteger(BigInteger bigInteger, BigInteger defaultValue) {
        return getBigIntegerMapper().map(bigInteger, defaultValue);
    }

    public static BigInteger mapBigInteger(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getBigIntegerMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Boolean ############### */

    public static boolean isFalse(Character c) {
        return getBooleanMapper().isFalse(c);
    }

    public static boolean isFalse(Integer i) {
        return getBooleanMapper().isFalse(i);
    }

    public static boolean isFalse(String s) {
        return getBooleanMapper().isFalse(s);
    }

    public static boolean isTrue(Character c) {
        return getBooleanMapper().isTrue(c);
    }

    public static boolean isTrue(Integer i) {
        return getBooleanMapper().isTrue(i);
    }

    public static boolean isTrue(String s) {
        return getBooleanMapper().isTrue(s);
    }

    public static boolean isMappableBoolean(Object o) {
        return getBooleanMapper().isMappable(o);
    }

    public static Boolean mapBoolean(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getBooleanMapper().map(s, bTrim, bEmptyIsNull);
    }

    public static Boolean mapBoolean(String s, boolean bTrim, boolean bEmptyIsNull, Boolean defaultValue) {
        return getBooleanMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Boolean mapBoolean(Boolean b) {
        return getBooleanMapper().map(b);
    }

    public static Boolean mapBoolean(Boolean b, Boolean defaultValue) {
        return getBooleanMapper().map(b, defaultValue);
    }

    public static Boolean mapBoolean(Character c) {
        return getBooleanMapper().map(c);
    }

    public static Boolean mapBoolean(Character c, Boolean defaultValue) {
        return getBooleanMapper().map(c, defaultValue);
    }

    public static Boolean mapBoolean(Integer i) {
        return getBooleanMapper().map(i);
    }

    public static Boolean mapBoolean(Integer i, Boolean defaultValue) {
        return getBooleanMapper().map(i, defaultValue);
    }

    public static boolean isFalse(Object o) {
        return getBooleanMapper().isFalse(o);
    }

    public static boolean isTrue(Object o) {
        return getBooleanMapper().isTrue(o);
    }

    public static Boolean mapBoolean(Properties props, String key) {
        return getBooleanMapper().map(props, key);
    }

    public static Boolean mapBoolean(Properties props, String key, Boolean defaultValue) {
        return getBooleanMapper().map(props, key, defaultValue);
    }

    public static Boolean mapBoolean(Map<String, ?> map, String key) {
        return getBooleanMapper().map(map, key);
    }

    public static Boolean mapBoolean(Map<String, ?> map, String key, Boolean defaultValue) {
        return getBooleanMapper().map(map, key, defaultValue);
    }

    public static Boolean mapBoolean(String s) {
        return getBooleanMapper().map(s);
    }

    public static Boolean mapBoolean(String s, Boolean defaultValue) {
        return getBooleanMapper().map(s, defaultValue);
    }


    /* ############### Byte ############### */


    public static Byte toByte(Number number) {
        return getByteMapper().toType(number);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Locale locale) {
        return getByteMapper().map(map, key, locale);
    }

    public static Byte mapByte(Map<String, ?> map, String key, String sPattern) {
        return getByteMapper().map(map, key, sPattern);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getByteMapper().map(map, key, locale, sPattern);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols) {
        return getByteMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static Byte mapByte(Map<String, ?> map, String key, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols) {
        return getByteMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Byte defaultValue) {
        return getByteMapper().map(map, key, defaultValue);
    }

    public static Byte mapByte(String sNumber) {
        return getByteMapper().map(sNumber);
    }

    public static Byte mapByte(String sNumber, Byte defaultValue) {
        return getByteMapper().map(sNumber, defaultValue);
    }

    public static Byte mapByte(String s, boolean bTrim, boolean bEmptyIsNull, Byte defaultValue) {
        return getByteMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Locale locale, Byte defaultValue) {
        return getByteMapper().map(map, key, locale, defaultValue);
    }

    public static Byte mapByte(Map<String, ?> map, String key, String sPattern, Byte defaultValue) {
        return getByteMapper().map(map, key, sPattern, defaultValue);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Locale locale, String sPattern, Byte defaultValue) {
        return getByteMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static Byte mapByte(Map<String, ?> map, String key, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols, Byte defaultValue) {
        return getByteMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Byte mapByte(Map<String, ?> map, String key, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols, Byte defaultValue) {
        return getByteMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Byte mapByte(Number number) {
        return getByteMapper().map(number);
    }

    public static Byte mapByte(Number number, Byte defaultValue) {
        return getByteMapper().map(number, defaultValue);
    }

    public static Byte mapByte(String sNumber, Locale locale) {
        return getByteMapper().map(sNumber, locale);
    }

    public static Byte mapByte(String sNumber, String sPattern) {
        return getByteMapper().map(sNumber, sPattern);
    }

    public static Byte mapByte(String sNumber, Locale locale, String sPattern) {
        return getByteMapper().map(sNumber, locale, sPattern);
    }

    public static Byte mapByte(String sNumber, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols) {
        return getByteMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Byte mapByte(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getByteMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Byte mapByte(String sNumber, Locale locale, Byte defaultValue) {
        return getByteMapper().map(sNumber, locale, defaultValue);
    }

    public static Byte mapByte(String sNumber, String sPattern, Byte defaultValue) {
        return getByteMapper().map(sNumber, sPattern, defaultValue);
    }

    public static Byte mapByte(String sNumber, Locale locale, String sPattern, Byte defaultValue) {
        return getByteMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static Byte mapByte(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                               Byte defaultValue) {
        return getByteMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Byte mapByte(String sNumber, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols, Byte defaultValue) {
        return getByteMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Byte unformatByte(String sNumber) {
        return getByteMapper().parse(sNumber);
    }

    public static Byte unformatByte(String sNumber, Locale locale) {
        return getByteMapper().parse(sNumber, locale);
    }

    public static Byte unformatByte(String sNumber, String sPattern) {
        return getByteMapper().parse(sNumber, sPattern);
    }

    public static Byte unformatByte(String sNumber, Locale locale, String sPattern) {
        return getByteMapper().parse(sNumber, locale, sPattern);
    }

    public static Byte unformatByte(String sNumber, Locale locale, String sPattern,
                                    DecimalFormatSymbols decimalFormatSymbols) {
        return getByteMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Byte unformatByte(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getByteMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Byte unformatByte(String sNumber, Byte defaultValue) {
        return getByteMapper().parse(sNumber, defaultValue);
    }

    public static Byte unformatByte(String sNumber, Locale locale, Byte defaultValue) {
        return getByteMapper().parse(sNumber, locale, defaultValue);
    }

    public static Byte unformatByte(String sNumber, String sPattern, Byte defaultValue) {
        return getByteMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static Byte unformatByte(String sNumber, Locale locale, String sPattern, Byte defaultValue) {
        return getByteMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static Byte unformatByte(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                    Byte defaultValue) {
        return getByteMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Byte unformatByte(String sNumber, Locale locale, String sPattern,
                                    DecimalFormatSymbols decimalFormatSymbols, Byte defaultValue) {
        return getByteMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableByte(Object o) {
        return getByteMapper().isMappable(o);
    }

    public static Byte mapByte(Properties props, String key) {
        return getByteMapper().map(props, key);
    }

    public static Byte mapByte(Properties props, String key, Byte defaultValue) {
        return getByteMapper().map(props, key, defaultValue);
    }

    public static Byte mapByte(Map<String, ?> map, String key) {
        return getByteMapper().map(map, key);
    }

    public static Byte mapByte(Byte aByte) {
        return getByteMapper().map(aByte);
    }

    public static Byte mapByte(Byte aByte, Byte defaultValue) {
        return getByteMapper().map(aByte, defaultValue);
    }

    public static Byte mapByte(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getByteMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Character ############### */

    public static boolean isMappableCharacter(Object o) {
        return getCharacterMapper().isMappable(o);
    }

    public static Character mapCharacter(Character c, Character defaultValue) {
        return getCharacterMapper().map(c, defaultValue);
    }

    public static Character mapCharacter(Integer i) {
        return getCharacterMapper().map(i);
    }

    public static Character mapCharacter(Integer i, Character defaultValue) {
        return getCharacterMapper().map(i, defaultValue);
    }

    public static Character mapCharacter(String s, boolean bTrim, boolean bEmptyIsNull, Character defaultValue) {
        return getCharacterMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Character mapCharacter(String s, boolean bEvaluateCodePoints) {
        return getCharacterMapper().map(s, bEvaluateCodePoints);
    }

    public static Character mapCharacter(String s, boolean bEvaluateCodePoints, Character defaultValue) {
        return getCharacterMapper().map(s, bEvaluateCodePoints, defaultValue);
    }

    public static Character mapCharacter(String s, boolean bTrim, boolean bEmptyIsNull, boolean bEvaluateCodePoints,
                                         Character defaultValue) {
        return getCharacterMapper().map(s, bTrim, bEmptyIsNull, bEvaluateCodePoints, defaultValue);
    }

    public static Character mapCharacter(Properties props, String key) {
        return getCharacterMapper().map(props, key);
    }

    public static Character mapCharacter(Properties props, String key, Character defaultValue) {
        return getCharacterMapper().map(props, key, defaultValue);
    }

    public static Character mapCharacter(Map<String, ?> map, String key) {
        return getCharacterMapper().map(map, key);
    }

    public static Character mapCharacter(Map<String, ?> map, String key, Character defaultValue) {
        return getCharacterMapper().map(map, key, defaultValue);
    }

    public static Character mapCharacter(Character character) {
        return getCharacterMapper().map(character);
    }

    public static Character mapCharacter(String s) {
        return getCharacterMapper().map(s);
    }

    public static Character mapCharacter(String s, Character defaultValue) {
        return getCharacterMapper().map(s, defaultValue);
    }

    public static Character mapCharacter(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getCharacterMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Date ############### */

    public static Date mapDate(String s, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return getDateMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Date mapDate(String s, DateFormat format, Date defaultValue) {
        return getDateMapper().map(s, format, defaultValue);
    }

    public static Date mapDate(String s, DateFormat format, boolean lenient, Date defaultValue) {
        return getDateMapper().map(s, format, lenient, defaultValue);
    }

    public static boolean isMappableDate(Object o) {
        return getDateMapper().isMappable(o);
    }

    public static Date mapDate(Properties props, String key) {
        return getDateMapper().map(props, key);
    }

    public static Date mapDate(Properties props, String key, Date defaultValue) {
        return getDateMapper().map(props, key, defaultValue);
    }

    public static Date mapDate(Map<String, ?> map, String key) {
        return getDateMapper().map(map, key);
    }

    public static Date mapDate(Map<String, ?> map, String key, Date defaultValue) {
        return getDateMapper().map(map, key, defaultValue);
    }

    public static Date mapDate(Date date) {
        return getDateMapper().map(date);
    }

    public static Date mapDate(Date date, Date defaultValue) {
        return getDateMapper().map(date, defaultValue);
    }

    public static Date mapDate(String s) {
        return getDateMapper().map(s);
    }

    public static Date mapDate(String s, Date defaultValue) {
        return getDateMapper().map(s, defaultValue);
    }

    public static Date mapDate(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getDateMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Double ############### */

    public static Double toDouble(Number number) {
        return getDoubleMapper().toType(number);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Locale locale) {
        return getDoubleMapper().map(map, key, locale);
    }

    public static Double mapDouble(Map<String, ?> map, String key, String sPattern) {
        return getDoubleMapper().map(map, key, sPattern);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getDoubleMapper().map(map, key, locale, sPattern);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Locale locale, String sPattern,
                                   DecimalFormatSymbols decimalFormatSymbols) {
        return getDoubleMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static Double mapDouble(Map<String, ?> map, String key, String sPattern,
                                   DecimalFormatSymbols decimalFormatSymbols) {
        return getDoubleMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Double defaultValue) {
        return getDoubleMapper().map(map, key, defaultValue);
    }

    public static Double mapDouble(String sNumber) {
        return getDoubleMapper().map(sNumber);
    }

    public static Double mapDouble(String sNumber, Double defaultValue) {
        return getDoubleMapper().map(sNumber, defaultValue);
    }

    public static Double mapDouble(String s, boolean bTrim, boolean bEmptyIsNull, Double defaultValue) {
        return getDoubleMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Locale locale, Double defaultValue) {
        return getDoubleMapper().map(map, key, locale, defaultValue);
    }

    public static Double mapDouble(Map<String, ?> map, String key, String sPattern, Double defaultValue) {
        return getDoubleMapper().map(map, key, sPattern, defaultValue);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Locale locale, String sPattern,
                                   Double defaultValue) {
        return getDoubleMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static Double mapDouble(Map<String, ?> map, String key, String sPattern,
                                   DecimalFormatSymbols decimalFormatSymbols, Double defaultValue) {
        return getDoubleMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Double mapDouble(Map<String, ?> map, String key, Locale locale, String sPattern,
                                   DecimalFormatSymbols decimalFormatSymbols, Double defaultValue) {
        return getDoubleMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Double mapDouble(Number number) {
        return getDoubleMapper().map(number);
    }

    public static Double mapDouble(Number number, Double defaultValue) {
        return getDoubleMapper().map(number, defaultValue);
    }

    public static Double mapDouble(String sNumber, Locale locale) {
        return getDoubleMapper().map(sNumber, locale);
    }

    public static Double mapDouble(String sNumber, String sPattern) {
        return getDoubleMapper().map(sNumber, sPattern);
    }

    public static Double mapDouble(String sNumber, Locale locale, String sPattern) {
        return getDoubleMapper().map(sNumber, locale, sPattern);
    }

    public static Double mapDouble(String sNumber, Locale locale, String sPattern,
                                   DecimalFormatSymbols decimalFormatSymbols) {
        return getDoubleMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Double mapDouble(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getDoubleMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Double mapDouble(String sNumber, Locale locale, Double defaultValue) {
        return getDoubleMapper().map(sNumber, locale, defaultValue);
    }

    public static Double mapDouble(String sNumber, String sPattern, Double defaultValue) {
        return getDoubleMapper().map(sNumber, sPattern, defaultValue);
    }

    public static Double mapDouble(String sNumber, Locale locale, String sPattern, Double defaultValue) {
        return getDoubleMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static Double mapDouble(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                   Double defaultValue) {
        return getDoubleMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Double mapDouble(String sNumber, Locale locale, String sPattern,
                                   DecimalFormatSymbols decimalFormatSymbols, Double defaultValue) {
        return getDoubleMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Double unformatDouble(String sNumber) {
        return getDoubleMapper().parse(sNumber);
    }

    public static Double unformatDouble(String sNumber, Locale locale) {
        return getDoubleMapper().parse(sNumber, locale);
    }

    public static Double unformatDouble(String sNumber, String sPattern) {
        return getDoubleMapper().parse(sNumber, sPattern);
    }

    public static Double unformatDouble(String sNumber, Locale locale, String sPattern) {
        return getDoubleMapper().parse(sNumber, locale, sPattern);
    }

    public static Double unformatDouble(String sNumber, Locale locale, String sPattern,
                                        DecimalFormatSymbols decimalFormatSymbols) {
        return getDoubleMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Double unformatDouble(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getDoubleMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Double unformatDouble(String sNumber, Double defaultValue) {
        return getDoubleMapper().parse(sNumber, defaultValue);
    }

    public static Double unformatDouble(String sNumber, Locale locale, Double defaultValue) {
        return getDoubleMapper().parse(sNumber, locale, defaultValue);
    }

    public static Double unformatDouble(String sNumber, String sPattern, Double defaultValue) {
        return getDoubleMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static Double unformatDouble(String sNumber, Locale locale, String sPattern, Double defaultValue) {
        return getDoubleMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static Double unformatDouble(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                        Double defaultValue) {
        return getDoubleMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Double unformatDouble(String sNumber, Locale locale, String sPattern,
                                        DecimalFormatSymbols decimalFormatSymbols, Double defaultValue) {
        return getDoubleMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableDouble(Object o) {
        return getDoubleMapper().isMappable(o);
    }

    public static Double mapDouble(Properties props, String key) {
        return getDoubleMapper().map(props, key);
    }

    public static Double mapDouble(Properties props, String key, Double defaultValue) {
        return getDoubleMapper().map(props, key, defaultValue);
    }

    public static Double mapDouble(Map<String, ?> map, String key) {
        return getDoubleMapper().map(map, key);
    }

    public static Double mapDouble(Double aDouble) {
        return getDoubleMapper().map(aDouble);
    }

    public static Double mapDouble(Double aDouble, Double defaultValue) {
        return getDoubleMapper().map(aDouble, defaultValue);
    }

    public static Double mapDouble(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getDoubleMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Float ############### */

    public static Float toFloat(Number number) {
        return getFloatMapper().toType(number);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Locale locale) {
        return getFloatMapper().map(map, key, locale);
    }

    public static Float mapFloat(Map<String, ?> map, String key, String sPattern) {
        return getFloatMapper().map(map, key, sPattern);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getFloatMapper().map(map, key, locale, sPattern);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols) {
        return getFloatMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static Float mapFloat(Map<String, ?> map, String key, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols) {
        return getFloatMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Float defaultValue) {
        return getFloatMapper().map(map, key, defaultValue);
    }

    public static Float mapFloat(String sNumber) {
        return getFloatMapper().map(sNumber);
    }

    public static Float mapFloat(String sNumber, Float defaultValue) {
        return getFloatMapper().map(sNumber, defaultValue);
    }

    public static Float mapFloat(String s, boolean bTrim, boolean bEmptyIsNull, Float defaultValue) {
        return getFloatMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Locale locale, Float defaultValue) {
        return getFloatMapper().map(map, key, locale, defaultValue);
    }

    public static Float mapFloat(Map<String, ?> map, String key, String sPattern, Float defaultValue) {
        return getFloatMapper().map(map, key, sPattern, defaultValue);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Locale locale, String sPattern, Float defaultValue) {
        return getFloatMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static Float mapFloat(Map<String, ?> map, String key, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols, Float defaultValue) {
        return getFloatMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Float mapFloat(Map<String, ?> map, String key, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols, Float defaultValue) {
        return getFloatMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Float mapFloat(Number number) {
        return getFloatMapper().map(number);
    }

    public static Float mapFloat(Number number, Float defaultValue) {
        return getFloatMapper().map(number, defaultValue);
    }

    public static Float mapFloat(String sNumber, Locale locale) {
        return getFloatMapper().map(sNumber, locale);
    }

    public static Float mapFloat(String sNumber, String sPattern) {
        return getFloatMapper().map(sNumber, sPattern);
    }

    public static Float mapFloat(String sNumber, Locale locale, String sPattern) {
        return getFloatMapper().map(sNumber, locale, sPattern);
    }

    public static Float mapFloat(String sNumber, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols) {
        return getFloatMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Float mapFloat(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getFloatMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Float mapFloat(String sNumber, Locale locale, Float defaultValue) {
        return getFloatMapper().map(sNumber, locale, defaultValue);
    }

    public static Float mapFloat(String sNumber, String sPattern, Float defaultValue) {
        return getFloatMapper().map(sNumber, sPattern, defaultValue);
    }

    public static Float mapFloat(String sNumber, Locale locale, String sPattern, Float defaultValue) {
        return getFloatMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static Float mapFloat(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                 Float defaultValue) {
        return getFloatMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Float mapFloat(String sNumber, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols, Float defaultValue) {
        return getFloatMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Float unformatFloat(String sNumber) {
        return getFloatMapper().parse(sNumber);
    }

    public static Float unformatFloat(String sNumber, Locale locale) {
        return getFloatMapper().parse(sNumber, locale);
    }

    public static Float unformatFloat(String sNumber, String sPattern) {
        return getFloatMapper().parse(sNumber, sPattern);
    }

    public static Float unformatFloat(String sNumber, Locale locale, String sPattern) {
        return getFloatMapper().parse(sNumber, locale, sPattern);
    }

    public static Float unformatFloat(String sNumber, Locale locale, String sPattern,
                                      DecimalFormatSymbols decimalFormatSymbols) {
        return getFloatMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Float unformatFloat(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getFloatMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Float unformatFloat(String sNumber, Float defaultValue) {
        return getFloatMapper().parse(sNumber, defaultValue);
    }

    public static Float unformatFloat(String sNumber, Locale locale, Float defaultValue) {
        return getFloatMapper().parse(sNumber, locale, defaultValue);
    }

    public static Float unformatFloat(String sNumber, String sPattern, Float defaultValue) {
        return getFloatMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static Float unformatFloat(String sNumber, Locale locale, String sPattern, Float defaultValue) {
        return getFloatMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static Float unformatFloat(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                      Float defaultValue) {
        return getFloatMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Float unformatFloat(String sNumber, Locale locale, String sPattern,
                                      DecimalFormatSymbols decimalFormatSymbols, Float defaultValue) {
        return getFloatMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableFloat(Object o) {
        return getFloatMapper().isMappable(o);
    }

    public static Float mapFloat(Properties props, String key) {
        return getFloatMapper().map(props, key);
    }

    public static Float mapFloat(Properties props, String key, Float defaultValue) {
        return getFloatMapper().map(props, key, defaultValue);
    }

    public static Float mapFloat(Map<String, ?> map, String key) {
        return getFloatMapper().map(map, key);
    }

    public static Float mapFloat(Float aFloat) {
        return getFloatMapper().map(aFloat);
    }

    public static Float mapFloat(Float aFloat, Float defaultValue) {
        return getFloatMapper().map(aFloat, defaultValue);
    }

    public static Float mapFloat(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getFloatMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### GregorianCalendar ############### */

    public static GregorianCalendar mapGregorianCalendar(String s, DateFormat format, GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(s, format, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendar(String s, boolean bTrim, boolean bEmptyIsNull,
                                                         GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendar(String s, DateFormat format, boolean lenient,
                                                         GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(s, format, lenient, defaultValue);
    }

    public static boolean isMappableGregorianCalendar(Object o) {
        return getGregorianCalendarMapper().isMappable(o);
    }

    public static GregorianCalendar mapGregorianCalendar(Properties props, String key) {
        return getGregorianCalendarMapper().map(props, key);
    }

    public static GregorianCalendar mapGregorianCalendar(Properties props, String key, GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(props, key, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendar(Map<String, ?> map, String key) {
        return getGregorianCalendarMapper().map(map, key);
    }

    public static GregorianCalendar mapGregorianCalendar(Map<String, ?> map, String key,
                                                         GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(map, key, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendar(GregorianCalendar gregorianCalendar) {
        return getGregorianCalendarMapper().map(gregorianCalendar);
    }

    public static GregorianCalendar mapGregorianCalendar(GregorianCalendar gregorianCalendar,
                                                         GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(gregorianCalendar, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendar(String s) {
        return getGregorianCalendarMapper().map(s);
    }

    public static GregorianCalendar mapGregorianCalendar(String s, GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().map(s, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendar(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getGregorianCalendarMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Integer ############### */

    public static Integer toInteger(Number number) {
        return getIntegerMapper().toType(number);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Locale locale) {
        return getIntegerMapper().map(map, key, locale);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, String sPattern) {
        return getIntegerMapper().map(map, key, sPattern);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getIntegerMapper().map(map, key, locale, sPattern);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Locale locale, String sPattern,
                                     DecimalFormatSymbols decimalFormatSymbols) {
        return getIntegerMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, String sPattern,
                                     DecimalFormatSymbols decimalFormatSymbols) {
        return getIntegerMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Integer defaultValue) {
        return getIntegerMapper().map(map, key, defaultValue);
    }

    public static Integer mapInteger(String sNumber) {
        return getIntegerMapper().map(sNumber);
    }

    public static Integer mapInteger(String sNumber, Integer defaultValue) {
        return getIntegerMapper().map(sNumber, defaultValue);
    }

    public static Integer mapInteger(String s, boolean bTrim, boolean bEmptyIsNull, Integer defaultValue) {
        return getIntegerMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Locale locale, Integer defaultValue) {
        return getIntegerMapper().map(map, key, locale, defaultValue);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, String sPattern, Integer defaultValue) {
        return getIntegerMapper().map(map, key, sPattern, defaultValue);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Locale locale, String sPattern,
                                     Integer defaultValue) {
        return getIntegerMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, String sPattern,
                                     DecimalFormatSymbols decimalFormatSymbols, Integer defaultValue) {
        return getIntegerMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Integer mapInteger(Map<String, ?> map, String key, Locale locale, String sPattern,
                                     DecimalFormatSymbols decimalFormatSymbols, Integer defaultValue) {
        return getIntegerMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Integer mapInteger(Number number) {
        return getIntegerMapper().map(number);
    }

    public static Integer mapInteger(Number number, Integer defaultValue) {
        return getIntegerMapper().map(number, defaultValue);
    }

    public static Integer mapInteger(String sNumber, Locale locale) {
        return getIntegerMapper().map(sNumber, locale);
    }

    public static Integer mapInteger(String sNumber, String sPattern) {
        return getIntegerMapper().map(sNumber, sPattern);
    }

    public static Integer mapInteger(String sNumber, Locale locale, String sPattern) {
        return getIntegerMapper().map(sNumber, locale, sPattern);
    }

    public static Integer mapInteger(String sNumber, Locale locale, String sPattern,
                                     DecimalFormatSymbols decimalFormatSymbols) {
        return getIntegerMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Integer mapInteger(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getIntegerMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Integer mapInteger(String sNumber, Locale locale, Integer defaultValue) {
        return getIntegerMapper().map(sNumber, locale, defaultValue);
    }

    public static Integer mapInteger(String sNumber, String sPattern, Integer defaultValue) {
        return getIntegerMapper().map(sNumber, sPattern, defaultValue);
    }

    public static Integer mapInteger(String sNumber, Locale locale, String sPattern, Integer defaultValue) {
        return getIntegerMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static Integer mapInteger(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                     Integer defaultValue) {
        return getIntegerMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Integer mapInteger(String sNumber, Locale locale, String sPattern,
                                     DecimalFormatSymbols decimalFormatSymbols, Integer defaultValue) {
        return getIntegerMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Integer unformatInteger(String sNumber) {
        return getIntegerMapper().parse(sNumber);
    }

    public static Integer unformatInteger(String sNumber, Locale locale) {
        return getIntegerMapper().parse(sNumber, locale);
    }

    public static Integer unformatInteger(String sNumber, String sPattern) {
        return getIntegerMapper().parse(sNumber, sPattern);
    }

    public static Integer unformatInteger(String sNumber, Locale locale, String sPattern) {
        return getIntegerMapper().parse(sNumber, locale, sPattern);
    }

    public static Integer unformatInteger(String sNumber, Locale locale, String sPattern,
                                          DecimalFormatSymbols decimalFormatSymbols) {
        return getIntegerMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Integer unformatInteger(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getIntegerMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Integer unformatInteger(String sNumber, Integer defaultValue) {
        return getIntegerMapper().parse(sNumber, defaultValue);
    }

    public static Integer unformatInteger(String sNumber, Locale locale, Integer defaultValue) {
        return getIntegerMapper().parse(sNumber, locale, defaultValue);
    }

    public static Integer unformatInteger(String sNumber, String sPattern, Integer defaultValue) {
        return getIntegerMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static Integer unformatInteger(String sNumber, Locale locale, String sPattern, Integer defaultValue) {
        return getIntegerMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static Integer unformatInteger(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                          Integer defaultValue) {
        return getIntegerMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Integer unformatInteger(String sNumber, Locale locale, String sPattern,
                                          DecimalFormatSymbols decimalFormatSymbols, Integer defaultValue) {
        return getIntegerMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableInteger(Object o) {
        return getIntegerMapper().isMappable(o);
    }

    public static Integer mapInteger(Properties props, String key) {
        return getIntegerMapper().map(props, key);
    }

    public static Integer mapInteger(Properties props, String key, Integer defaultValue) {
        return getIntegerMapper().map(props, key, defaultValue);
    }

    public static Integer mapInteger(Map<String, ?> map, String key) {
        return getIntegerMapper().map(map, key);
    }

    public static Integer mapInteger(Integer integer) {
        return getIntegerMapper().map(integer);
    }

    public static Integer mapInteger(Integer integer, Integer defaultValue) {
        return getIntegerMapper().map(integer, defaultValue);
    }

    public static Integer mapInteger(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getIntegerMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### LocalDate ############### */


    // TODO Delegate Methoden fuer LocalDateMapper


    /* ############### LocalDateTime ############### */


    // TODO Delegate Methoden fuer LocalDateTimeMapper


    /* ############### LocalTime ############### */


    // TODO Delegate Methoden fuer LocalTimeMapper


    /* ############### Long ############### */

    public static Long toLong(Number number) {
        return getLongMapper().toType(number);
    }

    public static Long mapLong(Map<String, ?> map, String key, Locale locale) {
        return getLongMapper().map(map, key, locale);
    }

    public static Long mapLong(Map<String, ?> map, String key, String sPattern) {
        return getLongMapper().map(map, key, sPattern);
    }

    public static Long mapLong(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getLongMapper().map(map, key, locale, sPattern);
    }

    public static Long mapLong(Map<String, ?> map, String key, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols) {
        return getLongMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static Long mapLong(Map<String, ?> map, String key, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols) {
        return getLongMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static Long mapLong(Map<String, ?> map, String key, Long defaultValue) {
        return getLongMapper().map(map, key, defaultValue);
    }

    public static Long mapLong(String sNumber) {
        return getLongMapper().map(sNumber);
    }

    public static Long mapLong(String sNumber, Long defaultValue) {
        return getLongMapper().map(sNumber, defaultValue);
    }

    public static Long mapLong(String s, boolean bTrim, boolean bEmptyIsNull, Long defaultValue) {
        return getLongMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Long mapLong(Map<String, ?> map, String key, Locale locale, Long defaultValue) {
        return getLongMapper().map(map, key, locale, defaultValue);
    }

    public static Long mapLong(Map<String, ?> map, String key, String sPattern, Long defaultValue) {
        return getLongMapper().map(map, key, sPattern, defaultValue);
    }

    public static Long mapLong(Map<String, ?> map, String key, Locale locale, String sPattern, Long defaultValue) {
        return getLongMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static Long mapLong(Map<String, ?> map, String key, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols, Long defaultValue) {
        return getLongMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Long mapLong(Map<String, ?> map, String key, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols, Long defaultValue) {
        return getLongMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Long mapLong(Number number) {
        return getLongMapper().map(number);
    }

    public static Long mapLong(Number number, Long defaultValue) {
        return getLongMapper().map(number, defaultValue);
    }

    public static Long mapLong(String sNumber, Locale locale) {
        return getLongMapper().map(sNumber, locale);
    }

    public static Long mapLong(String sNumber, String sPattern) {
        return getLongMapper().map(sNumber, sPattern);
    }

    public static Long mapLong(String sNumber, Locale locale, String sPattern) {
        return getLongMapper().map(sNumber, locale, sPattern);
    }

    public static Long mapLong(String sNumber, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols) {
        return getLongMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Long mapLong(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getLongMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Long mapLong(String sNumber, Locale locale, Long defaultValue) {
        return getLongMapper().map(sNumber, locale, defaultValue);
    }

    public static Long mapLong(String sNumber, String sPattern, Long defaultValue) {
        return getLongMapper().map(sNumber, sPattern, defaultValue);
    }

    public static Long mapLong(String sNumber, Locale locale, String sPattern, Long defaultValue) {
        return getLongMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static Long mapLong(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                               Long defaultValue) {
        return getLongMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Long mapLong(String sNumber, Locale locale, String sPattern,
                               DecimalFormatSymbols decimalFormatSymbols, Long defaultValue) {
        return getLongMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Long unformatLong(String sNumber) {
        return getLongMapper().parse(sNumber);
    }

    public static Long unformatLong(String sNumber, Locale locale) {
        return getLongMapper().parse(sNumber, locale);
    }

    public static Long unformatLong(String sNumber, String sPattern) {
        return getLongMapper().parse(sNumber, sPattern);
    }

    public static Long unformatLong(String sNumber, Locale locale, String sPattern) {
        return getLongMapper().parse(sNumber, locale, sPattern);
    }

    public static Long unformatLong(String sNumber, Locale locale, String sPattern,
                                    DecimalFormatSymbols decimalFormatSymbols) {
        return getLongMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Long unformatLong(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getLongMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Long unformatLong(String sNumber, Long defaultValue) {
        return getLongMapper().parse(sNumber, defaultValue);
    }

    public static Long unformatLong(String sNumber, Locale locale, Long defaultValue) {
        return getLongMapper().parse(sNumber, locale, defaultValue);
    }

    public static Long unformatLong(String sNumber, String sPattern, Long defaultValue) {
        return getLongMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static Long unformatLong(String sNumber, Locale locale, String sPattern, Long defaultValue) {
        return getLongMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static Long unformatLong(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                    Long defaultValue) {
        return getLongMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Long unformatLong(String sNumber, Locale locale, String sPattern,
                                    DecimalFormatSymbols decimalFormatSymbols, Long defaultValue) {
        return getLongMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static boolean isMappableLong(Object o) {
        return getLongMapper().isMappable(o);
    }

    public static Long mapLong(Properties props, String key) {
        return getLongMapper().map(props, key);
    }

    public static Long mapLong(Properties props, String key, Long defaultValue) {
        return getLongMapper().map(props, key, defaultValue);
    }

    public static Long mapLong(Map<String, ?> map, String key) {
        return getLongMapper().map(map, key);
    }

    public static Long mapLong(Long aLong) {
        return getLongMapper().map(aLong);
    }

    public static Long mapLong(Long aLong, Long defaultValue) {
        return getLongMapper().map(aLong, defaultValue);
    }

    public static Long mapLong(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getLongMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### OWASPAntiSamyHtml ############### */

    public static String mapHtmlWithPolicy(String policyFile, String s) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policyFile, s);
    }

    public static String mapHtmlWithPolicy(String policyFile, String s, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policyFile, s, defaultValue);
    }

    public static String mapHtmlWithPolicy(String policyFile, String s, boolean bTrim, boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policyFile, s, bTrim, bEmptyIsNull);
    }

    public static String mapHtmlWithPolicy(String policyFile, String s, boolean bTrim, boolean bEmptyIsNull,
                                           String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policyFile, s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static String mapHtmlWithPolicy(Policy policy, String s) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policy, s);
    }

    public static String mapHtmlWithPolicy(Policy policy, String s, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policy, s, defaultValue);
    }

    public static String mapHtmlWithPolicy(Policy policy, String s, boolean bTrim, boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policy, s, bTrim, bEmptyIsNull);
    }

    public static String mapHtmlWithPolicy(Policy policy, String s, boolean bTrim, boolean bEmptyIsNull,
                                           String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapWithPolicy(policy, s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static String mapHtmlWithCachedAntiSamy(String s) {
        return getOWASPAntiSamyHtmlMapper().mapWithCachedAntiSamy(s);
    }

    public static String mapHtmlWithCachedAntiSamy(String cacheKey, String s) {
        return getOWASPAntiSamyHtmlMapper().mapWithCachedAntiSamy(cacheKey, s);
    }

    public static String mapHtmlWithCachedAntiSamy(String cacheKey, String s, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapWithCachedAntiSamy(cacheKey, s, defaultValue);
    }

    public static String mapHtmlWithCachedAntiSamy(String cacheKey, String s, boolean bTrim, boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapWithCachedAntiSamy(cacheKey, s, bTrim, bEmptyIsNull);
    }

    public static String mapHtmlWithCachedAntiSamy(String cacheKey, String s, boolean bTrim, boolean bEmptyIsNull,
                                                   String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapWithCachedAntiSamy(cacheKey, s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static String mapHtml(String s) {
        return getOWASPAntiSamyHtmlMapper().map(s);
    }

    public static String mapHtml(String s, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().map(s, defaultValue);
    }

    public static String mapHtml(String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static boolean isMappableHtml(Object o) {
        return getOWASPAntiSamyHtmlMapper().isMappable(o);
    }

    public static String mapHtml(Properties props, String key) {
        return getOWASPAntiSamyHtmlMapper().map(props, key);
    }

    public static String mapHtml(Properties props, String key, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().map(props, key, defaultValue);
    }

    public static String mapHtml(Map<String, ?> map, String key) {
        return getOWASPAntiSamyHtmlMapper().map(map, key);
    }

    public static String mapHtml(Map<String, ?> map, String key, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().map(map, key, defaultValue);
    }

    public static String mapHtml(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### Short ############### */

    public static Short mapShort(Map<String, ?> map, String key, Locale locale) {
        return getShortMapper().map(map, key, locale);
    }

    public static Short mapShort(Map<String, ?> map, String key, String sPattern) {
        return getShortMapper().map(map, key, sPattern);
    }

    public static Short mapShort(Map<String, ?> map, String key, Locale locale, String sPattern) {
        return getShortMapper().map(map, key, locale, sPattern);
    }

    public static Short mapShort(Map<String, ?> map, String key, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols) {
        return getShortMapper().map(map, key, locale, sPattern, decimalFormatSymbols);
    }

    public static Short mapShort(Map<String, ?> map, String key, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols) {
        return getShortMapper().map(map, key, sPattern, decimalFormatSymbols);
    }

    public static Short mapShort(Map<String, ?> map, String key, Short defaultValue) {
        return getShortMapper().map(map, key, defaultValue);
    }

    public static Short mapShort(String sNumber) {
        return getShortMapper().map(sNumber);
    }

    public static Short mapShort(String sNumber, Short defaultValue) {
        return getShortMapper().map(sNumber, defaultValue);
    }

    public static Short mapShort(String s, boolean bTrim, boolean bEmptyIsNull, Short defaultValue) {
        return getShortMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static Short mapShort(Map<String, ?> map, String key, Locale locale, Short defaultValue) {
        return getShortMapper().map(map, key, locale, defaultValue);
    }

    public static Short mapShort(Map<String, ?> map, String key, String sPattern, Short defaultValue) {
        return getShortMapper().map(map, key, sPattern, defaultValue);
    }

    public static Short mapShort(Map<String, ?> map, String key, Locale locale, String sPattern, Short defaultValue) {
        return getShortMapper().map(map, key, locale, sPattern, defaultValue);
    }

    public static Short mapShort(Map<String, ?> map, String key, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols, Short defaultValue) {
        return getShortMapper().map(map, key, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Short mapShort(Map<String, ?> map, String key, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols, Short defaultValue) {
        return getShortMapper().map(map, key, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Short mapShort(Number number) {
        return getShortMapper().map(number);
    }

    public static Short mapShort(Number number, Short defaultValue) {
        return getShortMapper().map(number, defaultValue);
    }

    public static Short mapShort(String sNumber, Locale locale) {
        return getShortMapper().map(sNumber, locale);
    }

    public static Short mapShort(String sNumber, String sPattern) {
        return getShortMapper().map(sNumber, sPattern);
    }

    public static Short mapShort(String sNumber, Locale locale, String sPattern) {
        return getShortMapper().map(sNumber, locale, sPattern);
    }

    public static Short mapShort(String sNumber, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols) {
        return getShortMapper().map(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Short mapShort(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getShortMapper().map(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Short mapShort(String sNumber, Locale locale, Short defaultValue) {
        return getShortMapper().map(sNumber, locale, defaultValue);
    }

    public static Short mapShort(String sNumber, String sPattern, Short defaultValue) {
        return getShortMapper().map(sNumber, sPattern, defaultValue);
    }

    public static Short mapShort(String sNumber, Locale locale, String sPattern, Short defaultValue) {
        return getShortMapper().map(sNumber, locale, sPattern, defaultValue);
    }

    public static Short mapShort(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                 Short defaultValue) {
        return getShortMapper().map(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Short mapShort(String sNumber, Locale locale, String sPattern,
                                 DecimalFormatSymbols decimalFormatSymbols, Short defaultValue) {
        return getShortMapper().map(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Short unformatShort(String sNumber) {
        return getShortMapper().parse(sNumber);
    }

    public static Short unformatShort(String sNumber, Locale locale) {
        return getShortMapper().parse(sNumber, locale);
    }

    public static Short unformatShort(String sNumber, String sPattern) {
        return getShortMapper().parse(sNumber, sPattern);
    }

    public static Short unformatShort(String sNumber, Locale locale, String sPattern) {
        return getShortMapper().parse(sNumber, locale, sPattern);
    }

    public static Short unformatShort(String sNumber, Locale locale, String sPattern,
                                      DecimalFormatSymbols decimalFormatSymbols) {
        return getShortMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols);
    }

    public static Short unformatShort(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols) {
        return getShortMapper().parse(sNumber, sPattern, decimalFormatSymbols);
    }

    public static Short unformatShort(String sNumber, Short defaultValue) {
        return getShortMapper().parse(sNumber, defaultValue);
    }

    public static Short unformatShort(String sNumber, Locale locale, Short defaultValue) {
        return getShortMapper().parse(sNumber, locale, defaultValue);
    }

    public static Short unformatShort(String sNumber, String sPattern, Short defaultValue) {
        return getShortMapper().parse(sNumber, sPattern, defaultValue);
    }

    public static Short unformatShort(String sNumber, Locale locale, String sPattern, Short defaultValue) {
        return getShortMapper().parse(sNumber, locale, sPattern, defaultValue);
    }

    public static Short unformatShort(String sNumber, String sPattern, DecimalFormatSymbols decimalFormatSymbols,
                                      Short defaultValue) {
        return getShortMapper().parse(sNumber, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Short unformatShort(String sNumber, Locale locale, String sPattern,
                                      DecimalFormatSymbols decimalFormatSymbols, Short defaultValue) {
        return getShortMapper().parse(sNumber, locale, sPattern, decimalFormatSymbols, defaultValue);
    }

    public static Short toShort(Number number) {
        return getShortMapper().toType(number);
    }

    public static boolean isMappableShort(Object o) {
        return getShortMapper().isMappable(o);
    }

    public static Short mapShort(Properties props, String key) {
        return getShortMapper().map(props, key);
    }

    public static Short mapShort(Properties props, String key, Short defaultValue) {
        return getShortMapper().map(props, key, defaultValue);
    }

    public static Short mapShort(Map<String, ?> map, String key) {
        return getShortMapper().map(map, key);
    }

    public static Short mapShort(Short aShort) {
        return getShortMapper().map(aShort);
    }

    public static Short mapShort(Short aShort, Short defaultValue) {
        return getShortMapper().map(aShort, defaultValue);
    }

    public static Short mapShort(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getShortMapper().map(s, bTrim, bEmptyIsNull);
    }


    /* ############### String ############### */


    public static String mapString(String s) {
        return getStringMapper().map(s);
    }

    public static String mapString(String s, String defaultValue) {
        return getStringMapper().map(s, defaultValue);
    }

    public static String mapString(String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return getStringMapper().map(s, bTrim, bEmptyIsNull, defaultValue);
    }

    public static boolean isMappableString(Object o) {
        return getStringMapper().isMappable(o);
    }

    public static String mapString(Properties props, String key) {
        return getStringMapper().map(props, key);
    }

    public static String mapString(Properties props, String key, String defaultValue) {
        return getStringMapper().map(props, key, defaultValue);
    }

    public static String mapString(Map<String, ?> map, String key) {
        return getStringMapper().map(map, key);
    }

    public static String mapString(Map<String, ?> map, String key, String defaultValue) {
        return getStringMapper().map(map, key, defaultValue);
    }

    public static String mapString(String s, boolean bTrim, boolean bEmptyIsNull) {
        return getStringMapper().map(s, bTrim, bEmptyIsNull);
    }
}
