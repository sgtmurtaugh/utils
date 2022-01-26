package de.ckraus.webcommons.mappers2.servlet.http;

import de.materna.cms.cae.tokenGeneration.RandomTokenService;
import de.materna.cms.cae.util.CMUtil;
import de.materna.cms.customers.kbscore.cae.constants.KBSCoreSpringBeans;
import lombok.NonNull;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;

@SuppressWarnings("javadoc")
public class HttpSessionTypeMapperUtils {

    /**
     * Constructor
     */
    protected HttpSessionTypeMapperUtils() {
        super();
    }

    /**
     * @return
     */
    public static synchronized HttpSessionTypeMapperFactoryImpl getFactory() {
        return CMUtil.getSpringBean(KBSCoreSpringBeans.BEAN_HTTP_SESSION_TYPE_MAPPER_FACTORY,
                HttpSessionTypeMapperFactoryImpl.class);
    }


    /* ########## allgemeine Methoden verwenden den StringHttpServletRequestMapper als Implementierung ########## */


    /**
     * Liefert die aktuelle Session zur&uuml;ck. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getScope()}
     *
     * @return
     */
    public static HttpSession getSession() {
        return getStringMapper().getScope();
    }

    /**
     * Liefert den aktuellen {@link RandomTokenService} zur&uuml;ck. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getTokenService()}
     *
     * @return
     */
    public static RandomTokenService getTokenService() {
        return getStringMapper().getTokenService();
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
     * Liefert eine {@link BigDecimalHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigDecimalHttpSessionMapper getBigDecimalMapper() {
        return getFactory().getBigDecimalMapper();
    }

    /**
     * Liefert eine {@link BigIntegerHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigIntegerHttpSessionMapper getBigIntegerMapper() {
        return getFactory().getBigIntegerMapper();
    }

    /**
     * Liefert eine {@link BooleanHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BooleanHttpSessionMapper getBooleanMapper() {
        return getFactory().getBooleanMapper();
    }

    /**
     * Liefert eine {@link ByteHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ByteHttpSessionMapper getByteMapper() {
        return getFactory().getByteMapper();
    }

    /**
     * Liefert eine {@link CharacterHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static CharacterHttpSessionMapper getCharacterMapper() {
        return getFactory().getCharacterMapper();
    }

    /**
     * Liefert eine {@link DateHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DateHttpSessionMapper getDateMapper() {
        return getFactory().getDateMapper();
    }

    /**
     * Liefert eine {@link DoubleHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DoubleHttpSessionMapper getDoubleMapper() {
        return getFactory().getDoubleMapper();
    }

    /**
     * Liefert eine {@link FloatHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static FloatHttpSessionMapper getFloatMapper() {
        return getFactory().getFloatMapper();
    }

    /**
     * Liefert eine {@link GregorianCalendarHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static GregorianCalendarHttpSessionMapper getGregorianCalendarMapper() {
        return getFactory().getGregorianCalendarMapper();
    }

    /**
     * Liefert eine {@link IntegerHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static IntegerHttpSessionMapper getIntegerMapper() {
        return getFactory().getIntegerMapper();
    }

    /**
     * Liefert eine {@link LocalDateHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateHttpSessionMapper getLocalDateMapper() {
    //        return getFactory().getLocalDateMapper();
    //    }

    /**
     * Liefert eine {@link LocalDateTimeHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateTimeHttpSessionMapper getLocalDateTimeMapper() {
    //        return getFactory().getLocalDateTimeMapper();
    //    }

    /**
     * Liefert eine {@link LocalTimeHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalTimeHttpSessionMapper getLocalTimeMapper() {
    //        return getFactory().getLocalTimeMapper();
    //    }

    /**
     * Liefert eine {@link LongHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static LongHttpSessionMapper getLongMapper() {
        return getFactory().getLongMapper();
    }

    /**
     * Liefert eine {@link ShortHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ShortHttpSessionMapper getShortMapper() {
        return getFactory().getShortMapper();
    }

    /**
     * Liefert eine {@link StringHttpSessionMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static StringHttpSessionMapper getStringMapper() {
        return getFactory().getStringMapper();
    }

}
