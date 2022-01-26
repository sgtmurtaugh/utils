package de.ckraus.webcommons.mappers2.servlet.http;

import de.materna.cms.cae.util.CMUtil;
import de.materna.cms.customers.kbscore.cae.constants.KBSCoreSpringBeans;
import lombok.NonNull;

import javax.servlet.ServletContext;
import java.util.Enumeration;
import java.util.List;

@SuppressWarnings("javadoc")
public class ServletContextTypeMapperUtils {

    /**
     * Constructor
     */
    protected ServletContextTypeMapperUtils() {
        super();
    }

    /**
     * @return
     */
    public static synchronized ServletContextTypeMapperFactoryImpl getFactory() {
        return CMUtil.getSpringBean(KBSCoreSpringBeans.BEAN_HTTP_SESSION_TYPE_MAPPER_FACTORY,
                ServletContextTypeMapperFactoryImpl.class);
    }


    /* ########## allgemeine Methoden verwenden den StringHttpServletRequestMapper als Implementierung ########## */


    /**
     * Liefert die aktuelle Session zur&uuml;ck. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getScope()}
     *
     * @return
     */
    public static ServletContext getServletContext() {
        return getStringMapper().getScope();
    }

    /**
     * Liefert ein Objekt von der Session. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getAttribute(String)}
     *
     * @param attributeName
     *
     * @return
     */
    public static Object getAttribute(@NonNull String attributeName) {
        return getStringMapper().getAttribute(attributeName);
    }

    /**
     * Liefert ein Objekt vom Request. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getAttribute(String)}
     *
     * @param attributeName
     *
     * @return
     */
    public static Object getAttribute(@NonNull String attributeName, Object defaultValue) {
        return getStringMapper().getAttribute(attributeName, defaultValue);
    }

    /**
     * Liefert alle Attributnamen, die aktuell auf der Session liegen, zur&uuml;ck. Die default Implementierung
     * deligiert an {@link #getStringMapper()#getAttributeNames()}
     *
     * @return
     */
    public static Enumeration<String> getAttributeNames() {
        return getStringMapper().getAttributeNames();
    }

    /**
     * Liefert alle Attributnamen, die aktuell auf der Session liegen, als Liste zur&uuml;ck. Die default
     * Implementierung deligiert an {@link #getStringMapper()#getAttributePairList()}
     *
     * @return
     */
    public static List<String> getAttributePairList() {
        return getStringMapper().getAttributePairList();
    }

    /**
     * Pr&uumlft, ob das Attribut auf der Session existiert. Die default Implementierung deligiert an {@link
     * #getStringMapper()#hasAttribute(String)}
     *
     * @param attributeName
     *
     * @return
     */
    public static boolean hasAttribute(@NonNull String attributeName) {
        return getStringMapper().hasAttribute(attributeName);
    }

    /**
     * Pr&uumlft, ob das Attribut mit angegebene Wert auf der Session existiert. Die default Implementierung deligiert
     * an {@link #getStringMapper()#hasAttribute(String, Object)}
     *
     * @param attributeName
     * @param expectedValue
     *
     * @return
     */
    public static boolean hasAttributeValue(@NonNull String attributeName, Object expectedValue) {
        return getStringMapper().hasAttributeValue(attributeName, expectedValue);
    }

    /**
     * Entfernt ein Attribute von der Session. Die default Implementierung deligiert an {@link
     * #getStringMapper()#removeAttribute(String)}
     *
     * @param attributeName
     *
     * @return
     */
    public static void removeAttribute(@NonNull String attributeName) {
        getStringMapper().removeAttribute(attributeName);
    }

    /**
     * Speichert ein Objekt auf der Session. Die default Implementierung deligiert an {@link
     * #getStringMapper()#setAttribute(String, Object)}
     *
     * @param attributeName
     * @param attributeValue
     */
    public static void setAttribute(@NonNull String attributeName, Object attributeValue) {
        getStringMapper().setAttribute(attributeName, attributeValue);
    }

    /**
     * Konvertiert einen Array in eine Liste des verwendeten Typs. Die default Implementierung deligiert an {@link
     * #getStringMapper()#toList(Object[])}
     *
     * @param array
     * @param <E>
     *
     * @return
     */
    public static <E> List<E> toList(E[] array) {
        return getStringMapper().toList(array);
    }


    /* ### additional Methods ############ */


    /**
     * Liefert eine {@link BigDecimalServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigDecimalServletContextMapper getBigDecimalMapper() {
        return getFactory().getBigDecimalMapper();
    }

    /**
     * Liefert eine {@link BigIntegerServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigIntegerServletContextMapper getBigIntegerMapper() {
        return getFactory().getBigIntegerMapper();
    }

    /**
     * Liefert eine {@link BooleanServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BooleanServletContextMapper getBooleanMapper() {
        return getFactory().getBooleanMapper();
    }

    /**
     * Liefert eine {@link ByteServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ByteServletContextMapper getByteMapper() {
        return getFactory().getByteMapper();
    }

    /**
     * Liefert eine {@link CharacterServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static CharacterServletContextMapper getCharacterMapper() {
        return getFactory().getCharacterMapper();
    }

    /**
     * Liefert eine {@link DateServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DateServletContextMapper getDateMapper() {
        return getFactory().getDateMapper();
    }

    /**
     * Liefert eine {@link DoubleServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DoubleServletContextMapper getDoubleMapper() {
        return getFactory().getDoubleMapper();
    }

    /**
     * Liefert eine {@link FloatServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static FloatServletContextMapper getFloatMapper() {
        return getFactory().getFloatMapper();
    }

    /**
     * Liefert eine {@link GregorianCalendarServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static GregorianCalendarServletContextMapper getGregorianCalendarMapper() {
        return getFactory().getGregorianCalendarMapper();
    }

    /**
     * Liefert eine {@link IntegerServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static IntegerServletContextMapper getIntegerMapper() {
        return getFactory().getIntegerMapper();
    }

    /**
     * Liefert eine {@link LocalDateServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateServletContextMapper getLocalDateMapper() {
    //        return getFactory().getLocalDateMapper();
    //    }

    /**
     * Liefert eine {@link LocalDateTimeServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateTimeServletContextMapper getLocalDateTimeMapper() {
    //        return getFactory().getLocalDateTimeMapper();
    //    }

    /**
     * Liefert eine {@link LocalTimeServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalTimeServletContextMapper getLocalTimeMapper() {
    //        return getFactory().getLocalTimeMapper();
    //    }

    /**
     * Liefert eine {@link LongServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static LongServletContextMapper getLongMapper() {
        return getFactory().getLongMapper();
    }

    /**
     * Liefert eine {@link ShortServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ShortServletContextMapper getShortMapper() {
        return getFactory().getShortMapper();
    }

    /**
     * Liefert eine {@link StringServletContextMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static StringServletContextMapper getStringMapper() {
        return getFactory().getStringMapper();
    }

}
