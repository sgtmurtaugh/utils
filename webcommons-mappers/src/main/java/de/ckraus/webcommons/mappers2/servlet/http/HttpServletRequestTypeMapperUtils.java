package de.ckraus.webcommons.mappers2.servlet.http;

import de.materna.cms.cae.database.users.BkcmsProfile;
import de.materna.cms.cae.database.users.BkcmsTomcatUser;
import de.materna.cms.cae.forms.FileUploadWrapper;
import de.materna.cms.cae.forms.action.ActionMessages;
import de.materna.cms.cae.util.CMUtil;
import de.materna.cms.customers.kbscore.cae.constants.KBSCoreSpringBeans;
import lombok.NonNull;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.security.Principal;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@SuppressWarnings("javadoc")
public class HttpServletRequestTypeMapperUtils {

    /**
     * Constructor
     */
    protected HttpServletRequestTypeMapperUtils() {
        super();
    }

    /**
     * @return
     */
    public static synchronized HttpServletRequestTypeMapperFactoryImpl getFactory() {
        return CMUtil.getSpringBean(KBSCoreSpringBeans.BEAN_HTTP_SERVLET_REQUEST_TYPE_MAPPER_FACTORY,
                HttpServletRequestTypeMapperFactoryImpl.class);
    }


    /* ########## allgemeine Methoden verwenden den StringHttpServletRequestMapper als Implementierung ########## */


    /**
     * Liefert den aktuellen Request zur&uuml;ck. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getScope()}
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        return getStringMapper().getScope();
    }

    /**
     * Liefert ein Objekt vom Request. Die default Implementierung deligiert an {@link
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
     * Liefert alle Attributnamen, die aktuell auf dem Request liegen, zur&uuml;ck. Die default Implementierung
     * deligiert an {@link #getStringMapper()#getAttributeNames()}
     *
     * @return
     */
    public static Enumeration<String> getAttributeNames() {
        return getStringMapper().getAttributeNames();
    }

    /**
     * Liefert alle Attributnamen, die aktuell auf dem Request liegen, als Liste zur&uuml;ck. Die default
     * Implementierung deligiert an {@link #getStringMapper()#getAttributePairList()}
     *
     * @return
     */
    public static List<String> getAttributePairList() {
        return getStringMapper().getAttributePairList();
    }

    /**
     * Pr&uumlft, ob das Attribut auf dem Request existiert. Die default Implementierung deligiert an {@link
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
     * Pr&uumlft, ob das Attribut mit angegebene Wert auf dem Request existiert. Die default Implementierung deligiert
     * an {@link #getStringMapper()#hasAttributeValue(String, Object)}
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
     * Speichert ein Objekt auf dem Request. Die default Implementierung deligiert an {@link
     * #getStringMapper()#setAttribute(String, Object)}
     *
     * @param attributeName
     * @param attributeValue
     */
    public static void setAttribute(@NonNull String attributeName, Object attributeValue) {
        getStringMapper().setAttribute(attributeName, attributeValue);
    }

    /**
     * Liefert einen String vom Request. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getParameter(String)}
     *
     * @param parameterName
     *
     * @return
     */
    public static String getParameter(@NonNull String parameterName) {
        return getStringMapper().getParameter(parameterName);
    }

    /**
     * Liefert alle Parameternamen, die aktuell auf dem Request liegen, zur&uuml;ck. Die default Implementierung
     * deligiert an {@link #getStringMapper()#getParameterNames()}
     *
     * @return
     */
    public static Enumeration<String> getParameterNames() {
        return getStringMapper().getParameterNames();
    }

    /**
     * Liefert alle Werte des angegebenen Parameters vom Request zur&uuml;ck. Die default Implementierung deligiert an
     * {@link #getStringMapper()#getParameters(String)}
     *
     * @param parameterName
     *
     * @return
     */
    public static String[] getParameters(String parameterName) {
        return getStringMapper().getParameters(parameterName);
    }

    /**
     * Liefert alle Werte des angegebenen Parameters vom Request und ggf. der TokenMap zur&uuml;ck. Die default
     * Implementierung deligiert an {@link #getStringMapper()#getParametersFromRequestOrTokenMap(String)}
     *
     * @param parameterName
     *
     * @return
     */
    public static String[] getParametersFromRequestOrTokenMap(String parameterName) {
        return getStringMapper().getParametersFromRequestOrTokenMap(parameterName);
    }

    /**
     * Liefert alle Werte des angegebenen Parameters vom Request als Liste zur&uuml;ck. Die default Implementierung
     * deligiert an {@link #getStringMapper()#getParameters(String)}
     *
     * @param parameterName
     *
     * @return
     */
    public static List<String> getParameterList(String parameterName) {
        return getStringMapper().getParameterList(parameterName);
    }

    /**
     * Liefert alle Werte des angegebenen Parameters vom Request und ggf. der TokenMap als Liste zur&uuml;ck. Die
     * default Implementierung deligiert an {@link #getStringMapper()#getParametersFromRequestOrTokenMap(String)}
     *
     * @param parameterName
     *
     * @return
     */
    public static List<String> getParameterListFromRequestOrTokenMap(String parameterName) {
        return getStringMapper().getParameterListFromRequestOrTokenMap(parameterName);
    }

    /**
     * Liefert alle Parameternamen, die aktuell auf dem Request liegen, als Liste zur&uuml;ck.
     * <p>
     * Die default Implementierung deligiert an {@link #getStringMapper()#getParameterPairList()}
     *
     * @return
     */
    public static List<String> getParameterPairList() {
        return getStringMapper().getParameterPairList();
    }

    /**
     * Pr&uumlft, ob der Parameter auf dem Request existiert.
     *
     * @param parameterName
     *
     * @return
     */
    public static boolean hasParameter(@NonNull String parameterName) {
        return getStringMapper().hasParameter(parameterName);
    }

    /**
     * Pr&uumlft, ob der Parameter auf dem Request existiert.
     *
     * @param parameterName
     *
     * @return
     */
    public static boolean hasParameter(@NonNull String parameterName, boolean emptyIsNull) {
        return getStringMapper().hasParameter(parameterName, emptyIsNull);
    }


    /**
     * Pr&uumlft, ob der Parameter mit angegebene Wert auf dem Request existiert. Die default Implementierung delegiert
     * an {@link #getStringMapper()#hasParameter(String, boolean)}
     *
     * @param parameterName
     * @param expectedValue
     *
     * @return
     */
    public static boolean hasParameterValue(@NonNull String parameterName, Object expectedValue) {
        return getStringMapper().hasParameterValue(parameterName, expectedValue);
    }

    /**
     * Ermittelt die Struts ActionMessages vom Request. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getStrutsActionMessages()}
     *
     * @return
     */
    public static ActionMessages getStrutsActionMessages() {
        return getStringMapper().getStrutsActionMessages();
    }

    /**
     * Speichert die &uuml;bergebenen Struts ActionMessages auf dem Request. Die default Implementierung deligiert an
     * {@link #getStringMapper()#setStrutsActionMessages(ActionMessages)}
     *
     * @param actionMessages
     */
    public static void setStrutsActionMessages(ActionMessages actionMessages) {
        getStringMapper().setStrutsActionMessages(actionMessages);
    }

    /**
     * Pr&uuml;ft, ob auf dem Request Struts ActionMessages vorhanden sind. Die default Implementierung deligiert an
     * {@link #getStringMapper()#hasStrutsActionMessages()}
     *
     * @return
     */
    public static boolean hasStrutsActionMessages() {
        return getStringMapper().hasStrutsActionMessages();
    }

    /**
     * Ermittelt die ActionParameters der TokenMap Action.     * Die default Implementierung deligiert an {@link
     * #getStringMapper()#getTokenMapParameters()}
     *
     * @return
     */
    public static Map<String, Object> getTokenMapParameters() {
        return getStringMapper().getTokenMapParameters();
    }

    /**
     * Ermittelt das aktuelle {@link Principal} Objekt. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getUserPrincipal()}
     *
     * @return
     */
    public static Principal getUserPrincipal() {
        return getStringMapper().getUserPrincipal();
    }

    /**
     * Ermittelt das aktuelle {@link BkcmsTomcatUser} Objekt. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getBkcmsTomcatUser()}
     *
     * @return
     */
    public static BkcmsTomcatUser getBkcmsTomcatUser() {
        return getStringMapper().getBkcmsTomcatUser();
    }

    /**
     * Ermittelt das aktuelle {@link BkcmsProfile} Objekt. Die default Implementierung deligiert an {@link
     * #getStringMapper()#getBkcmsProfile()}
     *
     * @return
     */
    public static BkcmsProfile getBkcmsProfile() {
        return getStringMapper().getBkcmsProfile();
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

    /**
     * Pr&uuml;ft, ob der Cancel Parameter auf dem Request liegt. Die default Implementierung deligiert an {@link
     * #getStringMapper()#isCancelled()}
     */
    public static boolean isCancelled() {
        return getStringMapper().isCancelled();
    }

    /**
     * Pr&uuml;ft, ob aktuell Https verwendet werden soll. Die default Implementierung deligiert an {@link
     * #getStringMapper()#isHttps()}
     */
    public static boolean isHttps() {
        return getStringMapper().isHttps();
    }

    /**
     * @param parameterName
     *
     * @return
     */
    public static File getFileFromRequestOrTokenMap(String parameterName) {
        return getStringMapper().getFileFromRequestOrTokenMap(parameterName);
    }

    /**
     * @return
     */
    public static List<File> getFilesFromRequestOrTokenMap() {
        return getStringMapper().getFilesFromRequestOrTokenMap();
    }

    /**
     * getFileUploadWrapperFromRequestOrTokenMap
     *
     * @return
     */
    public static FileUploadWrapper getFileUploadWrapperFromRequestOrTokenMap(String parameterName) {
        return getStringMapper().getFileUploadWrapperFromRequestOrTokenMap(parameterName);
    }

    /**
     * getMultipartFile
     *
     * @return
     */
    public static MultipartFile getMultipartFile(String parameterName) {
        return getStringMapper().getMultipartFile(parameterName);
    }


    /* ### additional Methods ############ */


    /**
     * Liefert eine {@link BigDecimalHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigDecimalHttpServletRequestMapper getBigDecimalMapper() {
        return getFactory().getBigDecimalMapper();
    }

    /**
     * Liefert eine {@link BigIntegerHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BigIntegerHttpServletRequestMapper getBigIntegerMapper() {
        return getFactory().getBigIntegerMapper();
    }

    /**
     * Liefert eine {@link BooleanHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static BooleanHttpServletRequestMapper getBooleanMapper() {
        return getFactory().getBooleanMapper();
    }

    /**
     * Liefert eine {@link ByteHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ByteHttpServletRequestMapper getByteMapper() {
        return getFactory().getByteMapper();
    }

    /**
     * Liefert eine {@link CharacterHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static CharacterHttpServletRequestMapper getCharacterMapper() {
        return getFactory().getCharacterMapper();
    }

    /**
     * Liefert eine {@link DateHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DateHttpServletRequestMapper getDateMapper() {
        return getFactory().getDateMapper();
    }

    /**
     * Liefert eine {@link DoubleHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static DoubleHttpServletRequestMapper getDoubleMapper() {
        return getFactory().getDoubleMapper();
    }

    /**
     * Liefert eine {@link FloatHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static FloatHttpServletRequestMapper getFloatMapper() {
        return getFactory().getFloatMapper();
    }

    /**
     * Liefert eine {@link GregorianCalendarHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static GregorianCalendarHttpServletRequestMapper getGregorianCalendarMapper() {
        return getFactory().getGregorianCalendarMapper();
    }

    /**
     * Liefert eine {@link IntegerHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static IntegerHttpServletRequestMapper getIntegerMapper() {
        return getFactory().getIntegerMapper();
    }

    /**
     * Liefert eine {@link LocalDateHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateHttpServletRequestMapper getLocalDateMapper() {
    //        return getFactory().getLocalDateMapper();
    //    }

    /**
     * Liefert eine {@link LocalDateTimeHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalDateTimeHttpServletRequestMapper getLocalDateTimeMapper() {
    //        return getFactory().getLocalDateTimeMapper();
    //    }

    /**
     * Liefert eine {@link LocalTimeHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!
    //    public static LocalTimeHttpServletRequestMapper getLocalTimeMapper() {
    //        return getFactory().getLocalTimeMapper();
    //    }

    /**
     * Liefert eine {@link LongHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static LongHttpServletRequestMapper getLongMapper() {
        return getFactory().getLongMapper();
    }

    /**
     * Liefert eine {@link OWASPAntiSamyHtmlHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static OWASPAntiSamyHtmlHttpServletRequestMapper getOWASPAntiSamyHtmlMapper() {
        return getFactory().getOWASPAntiSamyHtmlMapper();
    }

    /**
     * Liefert eine {@link ShortHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static ShortHttpServletRequestMapper getShortMapper() {
        return getFactory().getShortMapper();
    }

    /**
     * Liefert eine {@link StringHttpServletRequestMapper} Instanz zur&uuml;ck.
     *
     * @return
     */
    public static StringHttpServletRequestMapper getStringMapper() {
        return getFactory().getStringMapper();
    }


    /**
     * getMarvinsParameterPairList
     * TODO: Mechanismus und Verwendung ueberdenken!!!!
     *
     * @return
     *
     * @deprecated Baaaaaaaad!
     */
    @Deprecated
    public static List<String> getMarvinsParameterPairList() {
        return getStringMapper().getMarvinsParameterPairList();
    }
}
