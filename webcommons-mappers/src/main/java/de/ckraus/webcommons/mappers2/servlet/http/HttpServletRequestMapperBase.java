package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeMapperBase;
import de.materna.cms.acegi.DatabaseUser;
import de.materna.cms.cae.contentbeans.AbsDocumentImpl;
import de.materna.cms.cae.database.HibernateHelper;
import de.materna.cms.cae.database.users.BkcmsProfile;
import de.materna.cms.cae.database.users.BkcmsTomcatUser;
import de.materna.cms.cae.forms.FileUploadWrapper;
import de.materna.cms.cae.forms.FormConstants;
import de.materna.cms.cae.forms.action.ActionMessages;
import de.materna.cms.cae.forms.action.PasswordForgottenMailAction;
import de.materna.cms.cae.tokenGeneration.RandomTokenService;
import de.materna.cms.cae.util.CMUtil;
import de.materna.cms.cae.util.ELConstants;
import de.materna.cms.customers.kbscore.cae.constants.KBSCoreMessageConstants;
import de.materna.cms.customers.kbscore.cae.constants.KBSCoreRequestConstants;
import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
import lombok.NonNull;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.security.Principal;
import java.util.*;

@SuppressWarnings("javadoc")
public abstract class HttpServletRequestMapperBase<T> extends ScopeMapperBase<HttpServletRequest, T>
        implements HttpServletRequestMapper<T> {

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected HttpServletRequestMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * @return
     */
    @Override
    public HttpServletRequest getScope() {
        return CMUtil.getRequest();
    }

    /**
     * Deligiert mit defaultValue {@code null} an {@link #getAttribute(String, Object)}
     *
     * @param attributeName
     *
     * @return
     */
    @Override
    public Object getAttribute(@NonNull String attributeName) {
        return this.getAttribute(attributeName, null);
    }

    /**
     * @param attributeName
     * @param defaultValue
     *
     * @return
     */
    @Override
    public Object getAttribute(@NonNull String attributeName, Object defaultValue) {
        Object oReturn = defaultValue;
        HttpServletRequest httpServletRequest = this.getScope();

        if (null != httpServletRequest) {
            oReturn = httpServletRequest.getAttribute(attributeName);
        }

        if (null == oReturn) {
            oReturn = defaultValue;
        }
        return oReturn;
    }

    /**
     * Deligiert an {@link #setAttribute(String, Object)} mit dem vorhandenem Attributnamen und dem Wert {@code null}.
     *
     * @param attributeName
     *
     * @return
     */
    @Override
    public void removeAttribute(@NonNull String attributeName) {
        this.setAttribute(attributeName, null);
    }

    /**
     * Speichert das angegebene Attribut unter dem Key auf dem Scope. Ist das Objekt {@code null}, wird das Attribut
     * ggf. auch vom Scope entfernt.
     *
     * @param attributeName
     * @param attributeValue
     *
     * @return
     */
    @Override
    public void setAttribute(@NonNull String attributeName, Object attributeValue) {
        HttpServletRequest httpServletRequest = this.getScope();

        if (null != httpServletRequest && StringUtils.isNotEmpty(attributeName)) {
            if (null != attributeValue) {
                httpServletRequest.setAttribute(attributeName, attributeValue);
            }
            else {
                httpServletRequest.removeAttribute(attributeName);
            }
        }
    }

    /**
     * Sucht auf dem Request nach dem angeforderten Parameter
     *
     * @param parameterName
     *
     * @return
     */
    @Override
    public String getPlainParameter(@NonNull String parameterName) {
        HttpServletRequest httpServletRequest = this.getScope();
        if (null != httpServletRequest) {
            return httpServletRequest.getParameter(parameterName);
        }
        return null;
    }

    /**
     * Sucht auf dem Request nach dem angeforderten Parameter. Der &uuml;bergebene Name wird aber vorher noch an {@link
     * #getParameterName(String)} deligiert um ggf. auch den mandantenspezifischen CMS-Prefix mit zu
     * ber&uuml;cksichtigen.
     *
     * @param parameterName
     *
     * @return
     */
    @Override
    public String getParameter(@NonNull String parameterName) {
        HttpServletRequest httpServletRequest = this.getScope();
        if (null != httpServletRequest) {
            return httpServletRequest.getParameter(this.getParameterName(parameterName));
        }
        return null;
    }

    /**
     * getParameterFromRequestOrTokenMap
     *
     * @param parameterName - The Parameter Key
     *
     * @return
     */
    @Override
    public String getParameterFromRequestOrTokenMap(String parameterName) {
        String[] asParameters = this.getParametersFromRequestOrTokenMap(parameterName);

        if (ArrayUtils.isNotEmpty(asParameters)) {
            return asParameters[0];
        }
        return null;
    }

    /**
     * Sucht die Werte des angegebenen Parameters auf dem Request.
     *
     * @param parameterName - The Parameter Key
     *
     * @return
     */
    @Override
    public String[] getParameters(String parameterName) {
        String[] asParameters = null;
        HttpServletRequest httpServletRequest = this.getScope();

        if (null != httpServletRequest) {
            asParameters = this.getTrimmedParameters(
                    httpServletRequest.getParameterValues(this.getParameterName(parameterName)));
        }
        return asParameters;
    }

    /**
     * Sucht die Werte des angegebenen Parameters auf dem Request und ggf. auch in der TokenMap.
     *
     * @param parameterName - The Parameter Key
     *
     * @return
     */
    @Override
    public String[] getParametersFromRequestOrTokenMap(String parameterName) {
        return this.getTrimmedParameters(CMUtil.getParameterValuesFromRequestOrTokenMap(parameterName));
    }

    /**
     * Sucht die Werte des angegebenen Parameters auf dem Request und ggf. auch in der TokenMap.
     *
     * @param asParameters
     *
     * @return
     */
    protected String[] getTrimmedParameters(String[] asParameters) {
        if (ArrayUtils.isNotEmpty(asParameters)) {
            for (int i = 0; i < asParameters.length; i++) {
                asParameters[i] = asParameters[i].trim();
            }
        }
        return asParameters;
    }

    /**
     * Ermittelt die Parameterwerte mittels {@link #getParameters(String)} und liefert die Ergebnisse als Liste
     * zur&uuml;ck.
     *
     * @param parameterName - The Parameter Key
     */
    @Override
    public List<String> getParameterList(String parameterName) {
        List<String> lParameterValues = null;

        String[] asParameterValues = this.getParameters(parameterName);

        if (ArrayUtils.isNotEmpty(asParameterValues)) {
            lParameterValues = Arrays.asList(asParameterValues);
        }
        return lParameterValues;
    }

    /**
     * Ermittelt die Parameterwerte mittels {@link #getParametersFromRequestOrTokenMap(String)} und liefert die
     * Ergebnisse als Liste zur&uuml;ck.
     *
     * @param parameterName - The Parameter Key
     */
    @Override
    public List<String> getParameterListFromRequestOrTokenMap(String parameterName) {
        List<String> lParameterValues = null;

        String[] asParameterValues = this.getParametersFromRequestOrTokenMap(parameterName);

        if (ArrayUtils.isNotEmpty(asParameterValues)) {
            lParameterValues = Arrays.asList(asParameterValues);
        }
        return lParameterValues;
    }

    /**
     * @param parameterName
     *
     * @return
     */
    @Override
    public boolean hasParameter(@NonNull String parameterName) {
        return (null != this.getParameterFromRequestOrTokenMap(parameterName));
    }


    /**
     * @param parameterName
     *
     * @return
     */
    @Override
    public boolean hasParameter(@NonNull String parameterName, boolean emptyIsNull) {

        if (null == this.getParameterFromRequestOrTokenMap(parameterName)) {
            return false;
        }
        else if (emptyIsNull && StringUtils.isBlank(this.getParameterFromRequestOrTokenMap(parameterName))) {
            return false;
        }
        else {
            return true;
        }

    }


    /**
     * @param parameterName
     * @param expectedValue
     *
     * @return
     */
    @Override
    public boolean hasParameterValue(@NonNull String parameterName, Object expectedValue) {
        return new EqualsBuilder().append(this.getParameterFromRequestOrTokenMap(parameterName), expectedValue)
                                  .isEquals();
    }

    /**
     * @param parameterName
     *
     * @return
     */
    @Override
    public T mapParameter(@NonNull String parameterName) {
        return this.mapParameter(parameterName, this.getMapper().getDefaultValue());
    }

    /**
     * @param parameterName
     * @param defaultValue
     *
     * @return
     */
    @Override
    public T mapParameter(@NonNull String parameterName, T defaultValue) {
        return this.mapParameter(parameterName, this.getMapper().isTrimString(), this.getMapper().isEmptyStringNull(),
                defaultValue);
    }

    /**
     * @param parameterName
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    @Override
    public T mapParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull) {
        return this.mapParameter(parameterName, bTrim, bEmptyIsNull, this.getMapper().getDefaultValue());
    }

    /**
     * @param parameterName
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    @Override
    public T mapParameter(@NonNull String parameterName, boolean bTrim, boolean bEmptyIsNull, T defaultValue) {
        return this.mapValue(this.getParameterFromRequestOrTokenMap(parameterName), defaultValue);
    }

    /**
     * @param parameterName
     *
     * @return
     */
    @Override
    public boolean hasTypedParameter(@NonNull String parameterName) {
        String value = this.getParameterFromRequestOrTokenMap(parameterName);

        if (null != value) {
            T typedValue = this.mapValue(value, null);
            return (null != typedValue);
        }
        return false;
    }

    /**
     * @param parameterName
     * @param expectedValue
     *
     * @return
     */
    @Override
    public boolean hasTypedParameterValue(@NonNull String parameterName, T expectedValue) {
        T typedValue = this.mapParameter(parameterName, null);

        return new EqualsBuilder().append(typedValue, expectedValue).isEquals();
    }

    /**
     * @param value
     *
     * @return
     */
    protected T mapValue(String value) {
        return this.mapValue(value, this.getMapper().getDefaultValue());
    }

    /**
     * @param value
     *
     * @return
     */
    protected T mapValue(String value, T defaultValue) {
        return this.mapValue(value, this.getMapper().isTrimString(), this.getMapper().isEmptyStringNull(),
                defaultValue);
    }

    /**
     * @param value
     *
     * @return
     */
    protected T mapValue(String value, boolean bTrim, boolean bEmptyIsNull) {
        return this.mapValue(value, bTrim, bEmptyIsNull, this.getMapper().getDefaultValue());
    }

    /**
     * @param value
     *
     * @return
     */
    protected abstract T mapValue(String value, boolean bTrim, boolean bEmptyIsNull, T defaultValue);

    /**
     * Ermittelt das aktuelle {@link Principal} Objekt.
     *
     * @return
     */
    @Override
    public Principal getUserPrincipal() {
        return this.getScope().getUserPrincipal();
    }


    /**
     * Ermittelt das aktuelle {@link BkcmsTomcatUser} Objekt.
     *
     * @return
     */
    public BkcmsTomcatUser getBkcmsTomcatUser() {
        BkcmsTomcatUser bkcmsTomcatUser = null;

        // 1. BkcmsTomcatUser liegt vllt auf dem Request
        // 1.1 PasswordForgotten Prozess
        Object oUser = this.getAttribute(PasswordForgottenMailAction.ATTR_USER);
        if (oUser instanceof BkcmsTomcatUser) {
            bkcmsTomcatUser = (BkcmsTomcatUser) oUser;
        }

        // 1.2 BKCMS_TOMCAT_USER Konstante
        oUser = this.getAttribute(KBSCoreRequestConstants.CURRENT_BKCMS_TOMCAT_USER);
        if (oUser instanceof BkcmsTomcatUser) {
            bkcmsTomcatUser = (BkcmsTomcatUser) oUser;
        }

        // 2. BkcmsTomcatUser kann vllt ueber den SecurityContext ermittelt werden
        if (null == bkcmsTomcatUser) {
            Object principal = CMUtil.getCurrentPrincipal();
            DatabaseUser coreMediaUser = null;

            if (principal instanceof DatabaseUser) {
                coreMediaUser = (DatabaseUser) principal;
            }

            if (null != coreMediaUser) {
                bkcmsTomcatUser = (BkcmsTomcatUser) HibernateHelper.findObject(BkcmsTomcatUser.class.getName(),
                        BkcmsTomcatUser.PROPERTY_FULL_USER_NAME, coreMediaUser.getUsername());
            }
        }

        // 3. BkcmsTomcatUser ueber den Tomcat Principal ermitteln
        if (null == bkcmsTomcatUser) {
            bkcmsTomcatUser = BkcmsTomcatUser.getCurrentUser(this.getScope());
        }

        // Wenn ein BkcmsTomcatUser ermittelt werden konnte, diesen auf dem Request speichern
        if (null != bkcmsTomcatUser) {
            this.setAttribute(KBSCoreRequestConstants.CURRENT_BKCMS_TOMCAT_USER, bkcmsTomcatUser);
        }

        return bkcmsTomcatUser;
    }

    /**
     * Ermittelt das aktuelle {@link BkcmsProfile} Objekt.
     *
     * @return
     */
    public BkcmsProfile getBkcmsProfile() {
        BkcmsProfile bkcmsProfile = null;

        // 1. BkcmsProfile liegt vllt auf dem Request - BKCMS_PROFILE Konstante
        Object oProfile = this.getAttribute(KBSCoreRequestConstants.CURRENT_BKCMS_PROFILE);
        if (oProfile instanceof BkcmsProfile) {
            bkcmsProfile = (BkcmsProfile) oProfile;
        }

        // 2. BkcmsProfile ueber TomcatUser ermitteln
        if (null == bkcmsProfile) {
            BkcmsTomcatUser bkcmsTomcatUser = this.getBkcmsTomcatUser();

            if (null != bkcmsTomcatUser) {
                bkcmsProfile = bkcmsTomcatUser.getProfile();
            }
        }

        // Wenn ein BkcmsProfile ermittelt werden konnte, dieses auf dem Request speichern
        if (null != bkcmsProfile) {
            this.setAttribute(KBSCoreRequestConstants.CURRENT_BKCMS_PROFILE, bkcmsProfile);
        }

        return bkcmsProfile;
    }

    /**
     * Pr&uum;ft, ob der geforderte Parameter ein String Array ist.
     *
     * @param parameterName
     *
     * @return
     */
    @Override
    public boolean isArrayParameter(@NonNull String parameterName) {
        String[] asParameter = this.getParametersFromRequestOrTokenMap(parameterName);

        return (ArrayUtils.isNotEmpty(asParameter) && (asParameter.length > 1));
    }

    /**
     * Deligiert unter Verwendung von {@link CMUtil#getCurrentForm()} an {@link #getParameterName(String)}
     *
     * @param parameterName
     *
     * @return
     */
    @Override
    public String getParameterName(@NonNull String parameterName) {
        return getParameterName(parameterName, CMUtil.getCurrentForm());
    }

    /**
     * Ermittelt mit Hilfe der Methode {@link CMUtil#getRequestParameterName(String, AbsDocumentImpl)} den tats&auml;
     * chlichen Parameternamen (ggf. inkl. mandantenspezifischen CMS-Prefix)
     *
     * @param parameterName
     *
     * @return
     */
    @Override
    public String getParameterName(@NonNull String parameterName, AbsDocumentImpl beanLinkTarget) {
        return CMUtil.getRequestParameterName(parameterName, beanLinkTarget);
    }

    /**
     * Liefert alle Attributnamen
     *
     * @return
     */
    @Override
    public Enumeration<String> getAttributeNames() {
        return this.getScope().getAttributeNames();
    }

    /**
     * Liefert alle Parameternamen
     *
     * @return
     */
    @Override
    public Enumeration<String> getParameterNames() {
        return this.getScope().getParameterNames();
    }

    /**
     * Liefert alle Parameternamen vom Request und ggf. der TokenMap
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public Enumeration<String> getParameterNamesFromRequestOrTokenMap() {
        return CMUtil.getParameterNamesFromRequestOrTokenMap();
    }

    /**
     * Deligiert mit {@code null} an {@link #getTypedParameterList(String, List)}
     *
     * @param parameterName
     *
     * @return
     */
    public List<T> getTypedParameterList(String parameterName) {
        return this.getTypedParameterList(parameterName, null);
    }

    /**
     * <p>Sucht auf dem Request nach Parameterwerten und mapped diese in eine List des Mapper Typs. Nicht 'mappbare'
     * Typen werden ignoriert.
     *
     * @param parameterName
     * @param lstDefault
     *
     * @return
     */
    public List<T> getTypedParameterList(String parameterName, List<T> lstDefault) {
        String[] asParameterValues = this.getParameters(parameterName);
        List<T> lstReturnParams = null;

        if (ArrayUtils.isNotEmpty(asParameterValues)) {
            TypeMapper<T> mapper = TypeMapperUtils.getMapperForType(this.forType());
            if (null != mapper) {
                for (String sParameterValue : asParameterValues) {

                    if (mapper.isMappable(sParameterValue)) {
                        T typedValue = mapper.map(sParameterValue);

                        if (null != typedValue) {
                            if (null == lstReturnParams) {
                                lstReturnParams = new ArrayList<>();
                            }
                            lstReturnParams.add(typedValue);
                        }
                    }
                }
            }
        }

        // ggf default Rueckgabewert verwenden
        if (null == lstReturnParams) {
            lstReturnParams = lstDefault;
        }
        return lstReturnParams;
    }

    /**
     * @return
     */
    @Override
    public List<String> getParameterPairList() {
        List<String> lstParametersOutput = null;

        Enumeration<String> enumParamNames = this.getParameterNames();
        if (null != enumParamNames) {
            while (enumParamNames.hasMoreElements()) {
                String sParamName = enumParamNames.nextElement();

                if (StringUtils.isNotEmpty(sParamName)) {
                    String[] asParamValues = this.getParameters(sParamName);

                    if (null == lstParametersOutput) {
                        lstParametersOutput = new ArrayList<>();
                    }

                    lstParametersOutput.add(StringUtils.join(sParamName, ": ", ArrayUtils.toString(asParamValues)));
                }
            }
        }
        return lstParametersOutput;
    }

    /**
     * @return
     */
    @Override
    public List<String> getParameterPairListFromRequestOrTokenMap() {
        List<String> lstParametersOutput = null;

        Enumeration<String> enumParamNames = this.getParameterNamesFromRequestOrTokenMap();
        if (null != enumParamNames) {
            while (enumParamNames.hasMoreElements()) {
                String sParamName = enumParamNames.nextElement();

                if (StringUtils.isNotEmpty(sParamName)) {
                    String[] asParamValues = this.getParametersFromRequestOrTokenMap(sParamName);

                    if (null == lstParametersOutput) {
                        lstParametersOutput = new ArrayList<>();
                    }

                    lstParametersOutput.add(StringUtils.join(sParamName, ": ", ArrayUtils.toString(asParamValues)));
                }
            }
        }
        return lstParametersOutput;
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
    public List<String> getMarvinsParameterPairList() {
        List<String> list = new ArrayList<>();

        for (Enumeration<?> enumParameterName = CMUtil.getParameterNamesFromRequestOrTokenMap();
             enumParameterName.hasMoreElements(); ) {
            String sParameterKey = (String) enumParameterName.nextElement();
            String sParameterValue = this.getParameterFromRequestOrTokenMap(sParameterKey);

            list.add(sParameterKey + ": " + sParameterValue);
        }
        return list;
    }

    /**
     * <p>Sucht in der angegebenen Reihenfolge nach den Request Attributen <code>MessageConstants
     * .GLOBAL_MESSAGES_KEY</code> oder <code>FormConstants.ERROR_KEY</code>. Konnte eines der beiden gefunden werden,
     * dann wird dieses zur&uuml;ckgeliefert, andernfalls null.
     *
     * @return
     */
    @Override
    public ActionMessages getStrutsActionMessages() {
        Object oActionMessages = null;
        ActionMessages actionMessages = null;

        if (this.hasAttribute(KBSCoreMessageConstants.GLOBAL_MESSAGES_KEY)) {
            oActionMessages = this.getAttribute(KBSCoreMessageConstants.GLOBAL_MESSAGES_KEY);
        }
        else if (this.hasAttribute(FormConstants.ERROR_KEY)) {
            oActionMessages = this.getAttribute(FormConstants.ERROR_KEY);
        }

        if (null == oActionMessages) {
            actionMessages = new ActionMessages();

            this.setStrutsActionMessages(actionMessages);
        }
        else if (oActionMessages instanceof ActionMessages) {
            actionMessages = (ActionMessages) oActionMessages;
        }
        else {
            // nuescht
        }

        return actionMessages;
    }

    /**
     * <p>Speichert die &uuml;bergebenen ActionMessages als Request-Attribute unter dem Struts Parameternamen
     * <code>MessageConstants.GLOBAL_MESSAGES_KEY</code></p>
     *
     * @param actionMessages
     */
    @Override
    public void setStrutsActionMessages(ActionMessages actionMessages) {
        this.setAttribute(KBSCoreMessageConstants.GLOBAL_MESSAGES_KEY, actionMessages);
    }

    /**
     * <p>Pr&uuml;ft, ob auf dem Request eines der Global Struts Attribute <code>FormConstants.ERROR_KEY</code> oder
     * <code>MessageConstants.GLOBAL_MESSAGES_KEY</code> als Attribute existiert.
     *
     * @return
     */
    @Override
    public boolean hasStrutsActionMessages() {
        boolean bHasStrutsActionMessages = false;

        // Pruefen, ob das Attribut FormConstants.ERROR_KEY vorhanden ist
        if (this.hasAttribute(FormConstants.ERROR_KEY)) {
            Object o = this.getAttribute(FormConstants.ERROR_KEY);

            if (o instanceof ActionMessages) {
                ActionMessages actionErrors = (ActionMessages) o;

                if (!actionErrors.isEmpty()) {
                    bHasStrutsActionMessages = true;
                }
            }
        }
        // Pruefen, ob das Attribut MessageConstants.GLOBAL_MESSAGES_KEY vorhanden ist
        else if (this.hasAttribute(KBSCoreMessageConstants.GLOBAL_MESSAGES_KEY)) {
            Object o = this.getAttribute(FormConstants.ERROR_KEY);

            if (o instanceof ActionMessages) {
                ActionMessages actionMessages = (ActionMessages) o;

                if (!actionMessages.isEmpty()) {
                    bHasStrutsActionMessages = true;
                }
            }
        }
        else {
            // nuescht
        }

        return bHasStrutsActionMessages;
    }

    /**
     * Liefert die aktuelle TokenMap Parameter-Map zur&uuml;ck.
     * <p>
     * Ermittelt mittels {@link HttpSessionTypeMapperUtils#getTokenService()} den TokenService und sucht dann nach einer
     * Parameter-Map zu dem aktuell auf dem Request befindlichen {@link KBSCoreRequestConstants#PARAMETER_TOKEN}
     * Parameter.
     * <p>
     * Kann kein Token gefunden werden, muss gepr&uuml;ft werden, ob wir uns gerade auf der ersten Seite eines Wizards
     * befinden ({@link KBSCoreRequestConstants#PARAMETER_FIRST_PAGE}), denn liegt die aktuelle TokenMap noch auf dem
     * Request ({@link KBSCoreRequestConstants#ATTRIBUTE_TOKEN_MAP}).
     *
     * @return
     */
    @Override
    public Map<String, Object> getTokenMapParameters() {
        Map<String, Object> mapTokenMapParameter = null;
        RandomTokenService tokenService = HttpSessionTypeMapperUtils.getTokenService();

        if (null != tokenService) {
            String sToken = StringHttpServletRequestMapper.getInstance()
                                                          .mapParameter(KBSCoreRequestConstants.PARAMETER_TOKEN, null);

            if (null == sToken) {
                if (BooleanHttpServletRequestMapper.getInstance()
                                                   .mapParameter(KBSCoreRequestConstants.PARAMETER_FIRST_PAGE)) {
                    mapTokenMapParameter =
                            (Map<String, Object>) this.getAttribute(KBSCoreRequestConstants.ATTRIBUTE_TOKEN_MAP);
                }
            }
            else {
                mapTokenMapParameter = (Map<String, Object>) tokenService.getTokenData(sToken);
            }
        }

        if (null == mapTokenMapParameter) {
            mapTokenMapParameter = new HashMap<>();
        }

        return mapTokenMapParameter;
    }

    /**
     * <p>Pr&uuml;ft, ob das Request-Attribute <code>{@link FormConstants#CANCEL_PROPERTY}</code> existiert.</p>
     *
     * @return
     */
    @Override
    public boolean isCancelled() {
        return this.hasAttribute(FormConstants.CANCEL_PROPERTY);
    }

    /**
     * <p>Pr&uuml;ft, ob entweder der Request-Parameter {@link KBSCoreRequestConstants#PARAM_HTTPS} oder das
     * Request-Attribute {@link ELConstants#MAPENTRY_IS_HTTPS} vorhanden sind.</p>
     *
     * @return
     */
    @Override
    public boolean isHttps() {
        boolean bIsHttps;

        if (this.hasParameter(KBSCoreRequestConstants.PARAM_HTTPS)) {
            bIsHttps = BooleanHttpServletRequestMapper.getInstance()
                                                      .mapParameter(KBSCoreRequestConstants.PARAM_HTTPS, false);
        }
        else if (this.hasAttribute(ELConstants.MAPENTRY_IS_HTTPS)) {
            bIsHttps = BooleanHttpServletRequestMapper.getInstance().mapAttribute(ELConstants.MAPENTRY_IS_HTTPS, false);
        }
        else {
            bIsHttps = false;
        }
        return bIsHttps;
    }

    /**
     * <p>Sucht auf dem Request oder ggf. in der TokenMap nach einem File Objekt.</p>
     *
     * @param parameterName
     *
     * @return
     */
    public File getFileFromRequestOrTokenMap(String parameterName) {
        File file = null;

        if (StringUtils.isNotEmpty(parameterName)) {
            // Pruefe zuerst, ob zu dem Parameternamen ein MultipartFile Objekt auf dem Request existiert
            file = new FileUploadWrapper(this.getMultipartFile(parameterName)).getFile();

            if (null == file) {
                // wenn nicht, dann pruefen, ob ggf. ein MultipartFile Objekt in der TokenMap vorhanden ist
                Map<String, Object> mTokenParams = this.getTokenMapParameters();
                if (MapUtils.isNotEmpty(mTokenParams)) {
                    for (Map.Entry<String, Object> entry : mTokenParams.entrySet()) {
                        if (entry.getValue() instanceof FileUploadWrapper) {
                            if (entry.getKey().equals(parameterName)) {
                                file = ((FileUploadWrapper) entry.getValue()).getFile();
                                break;
                            }
                        }
                    }
                }
            }
        }

        // TODO: 18.02.2020 Das eigentliche Problem liegt tiefer in den Materna Sourcen, weil leere Uploads in die
        //  TokenMap geschrieben werden. Das Ticket wird vorerst ueber diesen Workaround geloest
        if (null != file && file.length() <= 0) {
            file = null;
        }
        return file;
    }

    /**
     * Ermittelt alle Files vom Request bzw. der TokenMap
     *
     * @return
     */
    public List<File> getFilesFromRequestOrTokenMap() {
        List<File> lstFiles = null;

        if (this.getScope() instanceof MultipartHttpServletRequest) {
            Map<String, MultipartFile> mRequestParams = ((MultipartHttpServletRequest) this.getScope()).getFileMap();
            if (MapUtils.isNotEmpty(mRequestParams)) {
                for (Map.Entry<String, MultipartFile> entry : mRequestParams.entrySet()) {
                    if (entry.getValue().getSize() > 0) {
                        if (null == lstFiles) {
                            lstFiles = new ArrayList<>();
                        }

                        try {
                            File file = new File(entry.getValue().getOriginalFilename());
                            entry.getValue().transferTo(file);
                            lstFiles.add(file);
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        if (null == lstFiles) {
            Map<String, Object> mTokenParams = this.getTokenMapParameters();
            if (MapUtils.isNotEmpty(mTokenParams)) {
                lstFiles = new ArrayList<>();
                for (Map.Entry<String, Object> entry : mTokenParams.entrySet()) {
                    if (entry.getValue() instanceof FileUploadWrapper) {
                        lstFiles.add(((FileUploadWrapper) entry.getValue()).getFile());
                    }
                }
            }
        }
        return lstFiles;
    }

    /**
     * Sucht auf dem Request nach einem {@link MultipartFile} Objekt um dieses ggf. in einem {@link FileUploadWrapper}
     * Objekt zu kapseln. Kann dieses nicht gefunden werden, dann wird ggf. in der TokenMap nach einem bereits
     * vorhandenen {@link FileUploadWrapper} Objekt gesucht.
     *
     * @return
     */
    public FileUploadWrapper getFileUploadWrapperFromRequestOrTokenMap(String parameterName) {
        FileUploadWrapper fileUploadWrapper = null;
        MultipartFile multipartFile = this.getMultipartFile(parameterName);

        if (null == multipartFile) {
            Object oFileUploadWrapper = this.getTokenMapParameters().get(parameterName);

            if (oFileUploadWrapper instanceof FileUploadWrapper) {
                fileUploadWrapper = (FileUploadWrapper) oFileUploadWrapper;
            }
        }
        else {
            fileUploadWrapper = new FileUploadWrapper(multipartFile);
        }
        return fileUploadWrapper;
    }

    /**
     * <p>Wenn der Request eine {@link MultipartHttpServletRequest} Instanz ist, dann wird nach einem
     * {@link MultipartFile} Objekt gesucht.</p>
     *
     * @return
     */
    public MultipartFile getMultipartFile(String parameterName) {
        MultipartFile multipartFile = null;

        if (this.getScope() instanceof MultipartHttpServletRequest) {
            multipartFile = ((MultipartHttpServletRequest) this.getScope()).getFile(parameterName);
        }
        return multipartFile;
    }

}
