package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeMapper;
import de.materna.cms.cae.contentbeans.AbsDocumentImpl;
import de.materna.cms.cae.forms.action.ActionMessages;
import de.materna.cms.cae.util.CMUtil;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@SuppressWarnings("javadoc")
public interface HttpServletRequestMapper<T> extends ScopeMapper<HttpServletRequest, T> {

    /**
     * @param parameterName
     *
     * @return
     */
    String getPlainParameter(@NonNull String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    String getParameter(@NonNull String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    String getParameterFromRequestOrTokenMap(String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    String[] getParameters(String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    String[] getParametersFromRequestOrTokenMap(String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    List<String> getParameterList(String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    List<String> getParameterListFromRequestOrTokenMap(String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    boolean hasParameter(@NonNull String parameterName);

    /**
     * @param parameterName
     *
     * @return
     */
    boolean hasParameter(@NonNull String parameterName, boolean emptyIsNull);

    /**
     * @param parameterName
     * @param expectedValue
     *
     * @return
     */
    boolean hasParameterValue(@NonNull String parameterName, Object expectedValue);

    /**
     * @param parameterName
     *
     * @return
     */
    T mapParameter(@NonNull String parameterName);

    /**
     * @param parameterName
     * @param defaultValue
     *
     * @return
     */
    T mapParameter(@NonNull String parameterName, T defaultValue);

    /**
     * @param parameterName
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    T mapParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull);

    /**
     * @param parameterName
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    T mapParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull, T defaultValue);

    /**
     * @param parameterName
     *
     * @return
     */
    boolean hasTypedParameter(@NonNull String parameterName);

    /**
     * @param parameterName
     * @param expectedValue
     *
     * @return
     */
    boolean hasTypedParameterValue(@NonNull String parameterName, T expectedValue);

    /**
     * @return
     */
    Principal getUserPrincipal();

    /**
     * Deligiert unter Verwendung von {@link CMUtil#getCurrentForm()} an {@link #getParameterName(String)}
     *
     * @param parameterName
     *
     * @return
     */
    String getParameterName(@NonNull String parameterName);

    /**
     * Ermittelt mit Hilfe der Methode {@link CMUtil#getRequestParameterName(String, AbsDocumentImpl)} den tats&auml;
     * chlichen Parameternamen (ggf. inkl. mandantenspezifischen CMS-Prefix)
     *
     * @param parameterName
     *
     * @return
     */
    String getParameterName(@NonNull String parameterName, AbsDocumentImpl beanLinkTarget);

    /**
     * @return
     */
    Enumeration<String> getParameterNames();

    /**
     * @return
     */
    Enumeration<String> getParameterNamesFromRequestOrTokenMap();

    /**
     * Liefert eine Liste mit allen Key-Value(s) Request-Parameter Paaren
     *
     * @return
     */
    List<String> getParameterPairList();

    /**
     * Liefert eine Liste mit allen Key-Value(s) Request- und TokenMap-Parameter Paaren
     *
     * @return
     */
    List<String> getParameterPairListFromRequestOrTokenMap();

    /**
     * Pr&uuml;ft, ob der Parameter mehrere Werte auf dem Request hat.
     *
     * @param parameterName
     *
     * @return
     */
    boolean isArrayParameter(@NonNull String parameterName);

    /**
     * @return
     */
    ActionMessages getStrutsActionMessages();

    /**
     * @param actionMessages
     */
    void setStrutsActionMessages(ActionMessages actionMessages);

    /**
     * @return
     */
    boolean hasStrutsActionMessages();

    /**
     * Liefert die aktuelle TokenMap Parameter-Map zur&uuml;ck.
     *
     * @return
     */
    Map<String, Object> getTokenMapParameters();

    /**
     * @return
     */
    boolean isCancelled();

    /**
     * @return
     */
    boolean isHttps();

}
