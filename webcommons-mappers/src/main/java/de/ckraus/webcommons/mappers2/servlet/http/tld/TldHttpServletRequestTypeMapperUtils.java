package de.ckraus.webcommons.mappers2.servlet.http.tld;

import de.ckraus.webcommons.mappers2.servlet.http.HttpServletRequestTypeMapperUtils;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.Setter;
import org.owasp.validator.html.Policy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("javadoc")
@Setter(AccessLevel.PRIVATE)
public class TldHttpServletRequestTypeMapperUtils extends HttpServletRequestTypeMapperUtils {


    /**
     * Constructor
     */
    private TldHttpServletRequestTypeMapperUtils() {
        super();
    }


    /* ############### BigDecimal ############### */


    public static boolean hasBigDecimalAttribute(@NonNull String attributeName) {
        return getBigDecimalMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasBigDecimalAttributeValue(@NonNull String attributeName, BigDecimal expectedValue) {
        return getBigDecimalMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static BigDecimal mapBigDecimalAttribute(@NonNull String attributeName) {
        return getBigDecimalMapper().mapAttribute(attributeName);
    }

    public static BigDecimal mapBigDecimalAttribute(@NonNull String attributeName, BigDecimal defaultValue) {
        return getBigDecimalMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasBigDecimalParameter(@NonNull String parameterName) {
        return getBigDecimalMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasBigDecimalParameterValue(@NonNull String parameterName, BigDecimal expectedValue) {
        return getBigDecimalMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static BigDecimal mapBigDecimalParameter(@NonNull String parameterName) {
        return getBigDecimalMapper().mapParameter(parameterName);
    }

    public static BigDecimal mapBigDecimalParameter(@NonNull String parameterName, BigDecimal defaultValue) {
        return getBigDecimalMapper().mapParameter(parameterName, defaultValue);
    }

    public static BigDecimal mapBigDecimalParameter(@NonNull String parameterName, boolean bTrim,
                                                    boolean bEmptyIsNull) {
        return getBigDecimalMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static BigDecimal mapBigDecimalParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                                    BigDecimal defaultValue) {
        return getBigDecimalMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### BigInteger ############### */


    public static boolean hasBigIntegerAttribute(@NonNull String attributeName) {
        return getBigIntegerMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasBigIntegerAttributeValue(@NonNull String attributeName, BigInteger expectedValue) {
        return getBigIntegerMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static BigInteger mapBigIntegerAttribute(@NonNull String attributeName) {
        return getBigIntegerMapper().mapAttribute(attributeName);
    }

    public static BigInteger mapBigIntegerAttribute(@NonNull String attributeName, BigInteger defaultValue) {
        return getBigIntegerMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasBigIntegerParameter(@NonNull String parameterName) {
        return getBigIntegerMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasBigIntegerParameterValue(@NonNull String parameterName, BigInteger expectedValue) {
        return getBigIntegerMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static BigInteger mapBigIntegerParameter(@NonNull String parameterName) {
        return getBigIntegerMapper().mapParameter(parameterName);
    }

    public static BigInteger mapBigIntegerParameter(@NonNull String parameterName, BigInteger defaultValue) {
        return getBigIntegerMapper().mapParameter(parameterName, defaultValue);
    }

    public static BigInteger mapBigIntegerParameter(@NonNull String parameterName, boolean bTrim,
                                                    boolean bEmptyIsNull) {
        return getBigIntegerMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static BigInteger mapBigIntegerParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                                    BigInteger defaultValue) {
        return getBigIntegerMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Boolean ############### */


    public static boolean hasBooleanAttribute(@NonNull String attributeName) {
        return getBooleanMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasBooleanAttributeValue(@NonNull String attributeName, Boolean expectedValue) {
        return getBooleanMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Boolean mapBooleanAttribute(@NonNull String attributeName) {
        return getBooleanMapper().mapAttribute(attributeName);
    }

    public static Boolean mapBooleanAttribute(@NonNull String attributeName, Boolean defaultValue) {
        return getBooleanMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasBooleanParameter(@NonNull String parameterName) {
        return getBooleanMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasBooleanParameterValue(@NonNull String parameterName, Boolean expectedValue) {
        return getBooleanMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Boolean mapBooleanParameter(@NonNull String parameterName) {
        return getBooleanMapper().mapParameter(parameterName);
    }

    public static Boolean mapBooleanParameter(@NonNull String parameterName, Boolean defaultValue) {
        return getBooleanMapper().mapParameter(parameterName, defaultValue);
    }

    public static Boolean mapBooleanParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getBooleanMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Boolean mapBooleanParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                              Boolean defaultValue) {
        return getBooleanMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Byte ############### */


    public static boolean hasByteAttribute(@NonNull String attributeName) {
        return getByteMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasByteAttributeValue(@NonNull String attributeName, Byte expectedValue) {
        return getByteMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Byte mapByteAttribute(@NonNull String attributeName) {
        return getByteMapper().mapAttribute(attributeName);
    }

    public static Byte mapByteAttribute(@NonNull String attributeName, Byte defaultValue) {
        return getByteMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasByteParameter(@NonNull String parameterName) {
        return getByteMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasByteParameterValue(@NonNull String parameterName, Byte expectedValue) {
        return getByteMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Byte mapByteParameter(@NonNull String parameterName) {
        return getByteMapper().mapParameter(parameterName);
    }

    public static Byte mapByteParameter(@NonNull String parameterName, Byte defaultValue) {
        return getByteMapper().mapParameter(parameterName, defaultValue);
    }

    public static Byte mapByteParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getByteMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Byte mapByteParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                        Byte defaultValue) {
        return getByteMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Character ############### */


    public static boolean hasCharacterAttribute(@NonNull String attributeName) {
        return getCharacterMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasCharacterAttributeValue(@NonNull String attributeName, Character expectedValue) {
        return getCharacterMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Character mapCharacterAttribute(@NonNull String attributeName) {
        return getCharacterMapper().mapAttribute(attributeName);
    }

    public static Character mapCharacterAttribute(@NonNull String attributeName, Character defaultValue) {
        return getCharacterMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasCharacterParameter(@NonNull String parameterName) {
        return getCharacterMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasCharacterParameterValue(@NonNull String parameterName, Character expectedValue) {
        return getCharacterMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Character mapCharacterParameter(@NonNull String parameterName) {
        return getCharacterMapper().mapParameter(parameterName);
    }

    public static Character mapCharacterParameter(@NonNull String parameterName, Character defaultValue) {
        return getCharacterMapper().mapParameter(parameterName, defaultValue);
    }

    public static Character mapCharacterParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getCharacterMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Character mapCharacterParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                                  Character defaultValue) {
        return getCharacterMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Date ############### */


    public static boolean hasDateAttribute(@NonNull String attributeName) {
        return getDateMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasDateAttributeValue(@NonNull String attributeName, Date expectedValue) {
        return getDateMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Date mapDateAttribute(@NonNull String attributeName) {
        return getDateMapper().mapAttribute(attributeName);
    }

    public static Date mapDateAttribute(@NonNull String attributeName, Date defaultValue) {
        return getDateMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasDateParameter(@NonNull String parameterName) {
        return getDateMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasDateParameterValue(@NonNull String parameterName, Date expectedValue) {
        return getDateMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Date mapDateParameter(@NonNull String parameterName) {
        return getDateMapper().mapParameter(parameterName);
    }

    public static Date mapDateParameter(@NonNull String parameterName, Date defaultValue) {
        return getDateMapper().mapParameter(parameterName, defaultValue);
    }

    public static Date mapDateParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getDateMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Date mapDateParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                        Date defaultValue) {
        return getDateMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Double ############### */


    public static boolean hasDoubleAttribute(@NonNull String attributeName) {
        return getDoubleMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasDoubleAttributeValue(@NonNull String attributeName, Double expectedValue) {
        return getDoubleMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Double mapDoubleAttribute(@NonNull String attributeName) {
        return getDoubleMapper().mapAttribute(attributeName);
    }

    public static Double mapDoubleAttribute(@NonNull String attributeName, Double defaultValue) {
        return getDoubleMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasDoubleParameter(@NonNull String parameterName) {
        return getDoubleMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasDoubleParameterValue(@NonNull String parameterName, Double expectedValue) {
        return getDoubleMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Double mapDoubleParameter(@NonNull String parameterName) {
        return getDoubleMapper().mapParameter(parameterName);
    }

    public static Double mapDoubleParameter(@NonNull String parameterName, Double defaultValue) {
        return getDoubleMapper().mapParameter(parameterName, defaultValue);
    }

    public static Double mapDoubleParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getDoubleMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Double mapDoubleParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                            Double defaultValue) {
        return getDoubleMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Float ############### */


    public static boolean hasFloatAttribute(@NonNull String attributeName) {
        return getFloatMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasFloatAttributeValue(@NonNull String attributeName, Float expectedValue) {
        return getFloatMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Float mapFloatAttribute(@NonNull String attributeName) {
        return getFloatMapper().mapAttribute(attributeName);
    }

    public static Float mapFloatAttribute(@NonNull String attributeName, Float defaultValue) {
        return getFloatMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasFloatParameter(@NonNull String parameterName) {
        return getFloatMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasFloatParameterValue(@NonNull String parameterName, Float expectedValue) {
        return getFloatMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Float mapFloatParameter(@NonNull String parameterName) {
        return getFloatMapper().mapParameter(parameterName);
    }

    public static Float mapFloatParameter(@NonNull String parameterName, Float defaultValue) {
        return getFloatMapper().mapParameter(parameterName, defaultValue);
    }

    public static Float mapFloatParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getFloatMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Float mapFloatParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                          Float defaultValue) {
        return getFloatMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### GregorianCalendar ############### */


    public static boolean hasGregorianCalendarAttribute(@NonNull String attributeName) {
        return getGregorianCalendarMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasGregorianCalendarAttributeValue(@NonNull String attributeName,
                                                             GregorianCalendar expectedValue) {
        return getGregorianCalendarMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static GregorianCalendar mapGregorianCalendarAttribute(@NonNull String attributeName) {
        return getGregorianCalendarMapper().mapAttribute(attributeName);
    }

    public static GregorianCalendar mapGregorianCalendarAttribute(@NonNull String attributeName,
                                                                  GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasGregorianCalendarParameter(@NonNull String parameterName) {
        return getGregorianCalendarMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasGregorianCalendarParameterValue(@NonNull String parameterName,
                                                             GregorianCalendar expectedValue) {
        return getGregorianCalendarMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static GregorianCalendar mapGregorianCalendarParameter(@NonNull String parameterName) {
        return getGregorianCalendarMapper().mapParameter(parameterName);
    }

    public static GregorianCalendar mapGregorianCalendarParameter(@NonNull String parameterName,
                                                                  GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().mapParameter(parameterName, defaultValue);
    }

    public static GregorianCalendar mapGregorianCalendarParameter(@NonNull String parameterName, boolean bTrim,
                                                                  boolean bEmptyIsNull) {
        return getGregorianCalendarMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static GregorianCalendar mapGregorianCalendarParameter(@NonNull String parameterName, boolean bTrim,
                                                                  boolean bEmptyIsNull,
                                                                  GregorianCalendar defaultValue) {
        return getGregorianCalendarMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### Integer ############### */


    public static boolean hasIntegerAttribute(@NonNull String attributeName) {
        return getIntegerMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasIntegerAttributeValue(@NonNull String attributeName, Integer expectedValue) {
        return getIntegerMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Integer mapIntegerAttribute(@NonNull String attributeName) {
        return getIntegerMapper().mapAttribute(attributeName);
    }

    public static Integer mapIntegerAttribute(@NonNull String attributeName, Integer defaultValue) {
        return getIntegerMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasIntegerParameter(@NonNull String parameterName) {
        return getIntegerMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasIntegerParameterValue(@NonNull String parameterName, Integer expectedValue) {
        return getIntegerMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Integer mapIntegerParameter(@NonNull String parameterName) {
        return getIntegerMapper().mapParameter(parameterName);
    }

    public static Integer mapIntegerParameter(@NonNull String parameterName, Integer defaultValue) {
        return getIntegerMapper().mapParameter(parameterName, defaultValue);
    }

    public static Integer mapIntegerParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getIntegerMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Integer mapIntegerParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                              Integer defaultValue) {
        return getIntegerMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### LocalDate ############### */


    //    public static boolean hasLocalDateAttribute( @NonNull String attributeName ) {
    //        return getLocalDateMapper().hasTypedAttribute( attributeName );
    //    }
    //
    //    public static boolean hasLocalDateAttributeValue( @NonNull String attributeName, LocalDate expectedValue ) {
    //        return getLocalDateMapper().hasTypedAttributeValue( attributeName, expectedValue );
    //    }
    //
    //    public static LocalDate mapLocalDateAttribute( @NonNull String attributeName ) {
    //        return getLocalDateMapper().mapAttribute( attributeName );
    //    }
    //
    //    public static LocalDate mapLocalDateAttribute( @NonNull String attributeName, LocalDate defaultValue ) {
    //        return getLocalDateMapper().mapAttribute( attributeName, defaultValue );
    //    }
    //
    //    public static boolean hasLocalDateParameter( @NonNull String parameterName ) {
    //        return getLocalDateMapper().hasTypedParameter( parameterName );
    //    }
    //
    //    public static boolean hasLocalDateParameterValue( @NonNull String parameterName, LocalDate expectedValue ) {
    //        return getLocalDateMapper().hasTypedParameterValue( parameterName, expectedValue );
    //    }
    //
    //    public static LocalDate mapLocalDateParameter( @NonNull String parameterName ) {
    //        return getLocalDateMapper().mapParameter( parameterName );
    //    }
    //
    //    public static LocalDate mapLocalDateParameter( @NonNull String parameterName, LocalDate defaultValue ) {
    //        return getLocalDateMapper().mapParameter( parameterName, defaultValue );
    //    }
    //
    //    public static LocalDate mapLocalDateParameter( @NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull ) {
    //        return getLocalDateMapper().mapParameter( parameterName, bTrim, bEmptyIsNull );
    //    }
    //
    //    public static LocalDate mapLocalDateParameter( @NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
    //            LocalDate defaultValue ) {
    //        return getLocalDateMapper().mapParameter( parameterName, bTrim, bEmptyIsNull, defaultValue );
    //    }
    //

    /* ############### LocalDateTime ############### */


    //    public static boolean hasLocalDateTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalDateTimeMapper().hasTypedAttribute( attributeName );
    //    }
    //
    //    public static boolean hasLocalDateTimeAttributeValue( @NonNull String attributeName, LocalDateTime expectedValue ) {
    //        return getLocalDateTimeMapper().hasTypedAttributeValue( attributeName, expectedValue );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalDateTimeMapper().mapAttribute( attributeName );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeAttribute( @NonNull String attributeName, LocalDateTime defaultValue ) {
    //        return getLocalDateTimeMapper().mapAttribute( attributeName, defaultValue );
    //    }
    //
    //    public static boolean hasLocalDateTimeParameter( @NonNull String parameterName ) {
    //        return getLocalDateTimeMapper().hasTypedParameter( parameterName );
    //    }
    //
    //    public static boolean hasLocalDateTimeParameterValue( @NonNull String parameterName, LocalDateTime expectedValue ) {
    //        return getLocalDateTimeMapper().hasTypedParameterValue( parameterName, expectedValue );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeParameter( @NonNull String parameterName ) {
    //        return getLocalDateTimeMapper().mapParameter( parameterName );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeParameter( @NonNull String parameterName, LocalDateTime defaultValue ) {
    //        return getLocalDateTimeMapper().mapParameter( parameterName, defaultValue );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeParameter( @NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull ) {
    //        return getLocalDateTimeMapper().mapParameter( parameterName, bTrim, bEmptyIsNull );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeParameter( @NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
    //            LocalDateTime defaultValue ) {
    //        return getLocalDateTimeMapper().mapParameter( parameterName, bTrim, bEmptyIsNull, defaultValue );
    //    }
    //

    /* ############### LocalTime ############### */


    //    public static boolean hasLocalTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalTimeMapper().hasTypedAttribute( attributeName );
    //    }
    //
    //    public static boolean hasLocalTimeAttributeValue( @NonNull String attributeName, LocalTime expectedValue ) {
    //        return getLocalTimeMapper().hasTypedAttributeValue( attributeName, expectedValue );
    //    }
    //
    //    public static LocalTime mapLocalTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalTimeMapper().mapAttribute( attributeName );
    //    }
    //
    //    public static LocalTime mapLocalTimeAttribute( @NonNull String attributeName, LocalTime defaultValue ) {
    //        return getLocalTimeMapper().mapAttribute( attributeName, defaultValue );
    //    }
    //
    //    public static boolean hasLocalTimeParameter( @NonNull String parameterName ) {
    //        return getLocalTimeMapper().hasTypedParameter( parameterName );
    //    }
    //
    //    public static boolean hasLocalTimeParameterValue( @NonNull String parameterName, LocalTime expectedValue ) {
    //        return getLocalTimeMapper().hasTypedParameterValue( parameterName, expectedValue );
    //    }
    //
    //    public static LocalTime mapLocalTimeParameter( @NonNull String parameterName ) {
    //        return getLocalTimeMapper().mapParameter( parameterName );
    //    }
    //
    //    public static LocalTime mapLocalTimeParameter( @NonNull String parameterName, LocalTime defaultValue ) {
    //        return getLocalTimeMapper().mapParameter( parameterName, defaultValue );
    //    }
    //
    //    public static LocalTime mapLocalTimeParameter( @NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull ) {
    //        return getLocalTimeMapper().mapParameter( parameterName, bTrim, bEmptyIsNull );
    //    }
    //
    //    public static LocalTime mapLocalTimeParameter( @NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
    //            LocalTime defaultValue ) {
    //        return getLocalTimeMapper().mapParameter( parameterName, bTrim, bEmptyIsNull, defaultValue );
    //    }


    /* ############### Long ############### */


    public static boolean hasLongAttribute(@NonNull String attributeName) {
        return getLongMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasLongAttributeValue(@NonNull String attributeName, Long expectedValue) {
        return getLongMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Long mapLongAttribute(@NonNull String attributeName) {
        return getLongMapper().mapAttribute(attributeName);
    }

    public static Long mapLongAttribute(@NonNull String attributeName, Long defaultValue) {
        return getLongMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasLongParameter(@NonNull String parameterName) {
        return getLongMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasLongParameterValue(@NonNull String parameterName, Long expectedValue) {
        return getLongMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Long mapLongParameter(@NonNull String parameterName) {
        return getLongMapper().mapParameter(parameterName);
    }

    public static Long mapLongParameter(@NonNull String parameterName, Long defaultValue) {
        return getLongMapper().mapParameter(parameterName, defaultValue);
    }

    public static Long mapLongParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getLongMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Long mapLongParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                        Long defaultValue) {
        return getLongMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### OWASPAntiSamyHtml ############### */


    public static boolean hasOWASPAntiSamyHtmlAttribute(@NonNull String attributeName) {
        return getOWASPAntiSamyHtmlMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasOWASPAntiSamyHtmlAttributeValue(@NonNull String attributeName, String expectedValue) {
        return getOWASPAntiSamyHtmlMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static String mapOWASPAntiSamyHtmlAttribute(@NonNull String attributeName) {
        return getOWASPAntiSamyHtmlMapper().mapAttribute(attributeName);
    }

    public static String mapOWASPAntiSamyHtmlAttribute(@NonNull String attributeName, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasOWASPAntiSamyHtmlParameter(@NonNull String parameterName) {
        return getOWASPAntiSamyHtmlMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasOWASPAntiSamyHtmlParameterValue(@NonNull String parameterName, String expectedValue) {
        return getOWASPAntiSamyHtmlMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static String mapOWASPAntiSamyHtmlParameter(@NonNull String parameterName) {
        return getOWASPAntiSamyHtmlMapper().mapParameter(parameterName);
    }

    public static String mapOWASPAntiSamyHtmlParameter(@NonNull String parameterName, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameter(parameterName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameter(@NonNull String parameterName, boolean bTrim,
                                                       boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static String mapOWASPAntiSamyHtmlParameter(@NonNull String parameterName, boolean bTrim,
                                                       boolean bEmptyIsNull, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithPolicy(@NonNull String sPolicyFile,
                                                                 @NonNull String attributeName) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithPolicy(sPolicyFile, attributeName);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithPolicy(@NonNull String sPolicyFile,
                                                                 @NonNull String attributeName, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithPolicy(sPolicyFile, attributeName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull String sPolicyFile,
                                                                 @NonNull String parameterName) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(sPolicyFile, parameterName);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull String sPolicyFile,
                                                                 @NonNull String parameterName, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(sPolicyFile, parameterName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull String sPolicyFile,
                                                                 @NonNull String parameterName, boolean bTrim,
                                                                 boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(sPolicyFile, parameterName, bTrim, bEmptyIsNull);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull String sPolicyFile,
                                                                 @NonNull String parameterName, boolean bTrim,
                                                                 boolean bEmptyIsNull, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(sPolicyFile, parameterName, bTrim, bEmptyIsNull,
                defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithPolicy(@NonNull Policy policy,
                                                                 @NonNull String attributeName) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithPolicy(policy, attributeName);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithPolicy(@NonNull Policy policy, @NonNull String attributeName,
                                                                 String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithPolicy(policy, attributeName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull Policy policy,
                                                                 @NonNull String parameterName) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(policy, parameterName);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName,
                                                                 String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(policy, parameterName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName,
                                                                 boolean bTrim, boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(policy, parameterName, bTrim, bEmptyIsNull);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName,
                                                                 boolean bTrim, boolean bEmptyIsNull,
                                                                 String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithPolicy(policy, parameterName, bTrim, bEmptyIsNull,
                defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithCachedAntiSamy(@NonNull String attributeName) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithCachedAntiSamy(attributeName);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithCachedAntiSamy(@NonNull String sCacheKey,
                                                                         @NonNull String attributeName) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithCachedAntiSamy(sCacheKey, attributeName);
    }

    public static String mapOWASPAntiSamyHtmlAttributeWithCachedAntiSamy(@NonNull String sCacheKey,
                                                                         @NonNull String attributeName,
                                                                         String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapAttributeWithCachedAntiSamy(sCacheKey, attributeName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithCachedAntiSamy(@NonNull String parameterName) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithCachedAntiSamy(parameterName);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithCachedAntiSamy(@NonNull String sCacheKey,
                                                                         @NonNull String parameterName) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithCachedAntiSamy(sCacheKey, parameterName);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithCachedAntiSamy(@NonNull String sCacheKey,
                                                                         @NonNull String parameterName,
                                                                         String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithCachedAntiSamy(sCacheKey, parameterName, defaultValue);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithCachedAntiSamy(@NonNull String sCacheKey,
                                                                         @NonNull String parameterName, boolean bTrim,
                                                                         boolean bEmptyIsNull) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithCachedAntiSamy(sCacheKey, parameterName, bTrim,
                bEmptyIsNull);
    }

    public static String mapOWASPAntiSamyHtmlParameterWithCachedAntiSamy(@NonNull String sCacheKey,
                                                                         @NonNull String parameterName, boolean bTrim,
                                                                         boolean bEmptyIsNull, String defaultValue) {
        return getOWASPAntiSamyHtmlMapper().mapParameterWithCachedAntiSamy(sCacheKey, parameterName, bTrim,
                bEmptyIsNull, defaultValue);
    }


    /* ############### Short ############### */


    public static boolean hasShortAttribute(@NonNull String attributeName) {
        return getShortMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasShortAttributeValue(@NonNull String attributeName, Short expectedValue) {
        return getShortMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static Short mapShortAttribute(@NonNull String attributeName) {
        return getShortMapper().mapAttribute(attributeName);
    }

    public static Short mapShortAttribute(@NonNull String attributeName, Short defaultValue) {
        return getShortMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasShortParameter(@NonNull String parameterName) {
        return getShortMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasShortParameterValue(@NonNull String parameterName, Short expectedValue) {
        return getShortMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static Short mapShortParameter(@NonNull String parameterName) {
        return getShortMapper().mapParameter(parameterName);
    }

    public static Short mapShortParameter(@NonNull String parameterName, Short defaultValue) {
        return getShortMapper().mapParameter(parameterName, defaultValue);
    }

    public static Short mapShortParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getShortMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static Short mapShortParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                          Short defaultValue) {
        return getShortMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }


    /* ############### String ############### */


    public static boolean hasStringAttribute(@NonNull String attributeName) {
        return getStringMapper().hasTypedAttribute(attributeName);
    }

    public static boolean hasStringAttributeValue(@NonNull String attributeName, String expectedValue) {
        return getStringMapper().hasTypedAttributeValue(attributeName, expectedValue);
    }

    public static String mapStringAttribute(@NonNull String attributeName) {
        return getStringMapper().mapAttribute(attributeName);
    }

    public static String mapStringAttribute(@NonNull String attributeName, String defaultValue) {
        return getStringMapper().mapAttribute(attributeName, defaultValue);
    }

    public static boolean hasStringParameter(@NonNull String parameterName) {
        return getStringMapper().hasTypedParameter(parameterName);
    }

    public static boolean hasStringParameterValue(@NonNull String parameterName, String expectedValue) {
        return getStringMapper().hasTypedParameterValue(parameterName, expectedValue);
    }

    public static String mapStringParameter(@NonNull String parameterName) {
        return getStringMapper().mapParameter(parameterName);
    }

    public static String mapStringParameter(@NonNull String parameterName, String defaultValue) {
        return getStringMapper().mapParameter(parameterName, defaultValue);
    }

    public static String mapStringParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return getStringMapper().mapParameter(parameterName, bTrim, bEmptyIsNull);
    }

    public static String mapStringParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull,
                                            String defaultValue) {
        return getStringMapper().mapParameter(parameterName, bTrim, bEmptyIsNull, defaultValue);
    }

}
