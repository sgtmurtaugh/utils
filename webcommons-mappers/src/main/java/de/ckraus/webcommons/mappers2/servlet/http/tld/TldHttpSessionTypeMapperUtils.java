package de.ckraus.webcommons.mappers2.servlet.http.tld;

import de.ckraus.webcommons.mappers2.servlet.http.HttpSessionTypeMapperUtils;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

@SuppressWarnings("javadoc")
@Setter(AccessLevel.PRIVATE)
public class TldHttpSessionTypeMapperUtils extends HttpSessionTypeMapperUtils {


    /**
     * Constructor
     */
    private TldHttpSessionTypeMapperUtils() {
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


    /* ############### LocalDate ############### */


    //    public static boolean hasLocalDateAttribute( @NonNull String attributeName ) {
    //        return getLocalDateHttpSessionMapper().hasTypedAttribute( attributeName );
    //    }
    //
    //    public static boolean hasLocalDateAttributeValue( @NonNull String attributeName, LocalDate expectedValue ) {
    //        return getLocalDateHttpSessionMapper().hasTypedAttributeValue( attributeName, expectedValue );
    //    }
    //
    //    public static LocalDate mapLocalDateAttribute( @NonNull String attributeName ) {
    //        return getLocalDateHttpSessionMapper().mapAttribute( attributeName );
    //    }
    //
    //    public static LocalDate mapLocalDateAttribute( @NonNull String attributeName, LocalDate defaultValue ) {
    //        return getLocalDateHttpSessionMapper().mapAttribute( attributeName, defaultValue );
    //    }


    /* ############### LocalDateTime ############### */


    //    public static boolean hasLocalDateTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalDateTimeHttpSessionMapper().hasTypedAttribute( attributeName );
    //    }
    //
    //    public static boolean hasLocalDateTimeAttributeValue( @NonNull String attributeName, LocalDateTime expectedValue ) {
    //        return getLocalDateTimeHttpSessionMapper().hasTypedAttributeValue( attributeName, expectedValue );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalDateTimeHttpSessionMapper().mapAttribute( attributeName );
    //    }
    //
    //    public static LocalDateTime mapLocalDateTimeAttribute( @NonNull String attributeName, LocalDateTime defaultValue ) {
    //        return getLocalDateTimeHttpSessionMapper().mapAttribute( attributeName, defaultValue );
    //    }


    /* ############### LocalTime ############### */


    //    public static boolean hasLocalTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalTimeHttpSessionMapper().hasTypedAttribute( attributeName );
    //    }
    //
    //    public static boolean hasLocalTimeAttributeValue( @NonNull String attributeName, LocalTime expectedValue ) {
    //        return getLocalTimeHttpSessionMapper().hasTypedAttributeValue( attributeName, expectedValue );
    //    }
    //
    //    public static LocalTime mapLocalTimeAttribute( @NonNull String attributeName ) {
    //        return getLocalTimeHttpSessionMapper().mapAttribute( attributeName );
    //    }
    //
    //    public static LocalTime mapLocalTimeAttribute( @NonNull String attributeName, LocalTime defaultValue ) {
    //        return getLocalTimeHttpSessionMapper().mapAttribute( attributeName, defaultValue );
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

}
