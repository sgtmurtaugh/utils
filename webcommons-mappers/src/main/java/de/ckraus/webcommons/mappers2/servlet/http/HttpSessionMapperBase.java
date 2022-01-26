package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeMapperBase;
import de.materna.cms.cae.forms.formfiller.TokenStoreFormFiller;
import de.materna.cms.cae.tokenGeneration.RandomTokenService;
import de.materna.cms.cae.util.CMUtil;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@SuppressWarnings("javadoc")
public abstract class HttpSessionMapperBase<T> extends ScopeMapperBase<HttpSession, T> implements HttpSessionMapper<T> {

    public static final String DEFAULT_TOKEN_SERVICE_BEAN = TokenStoreFormFiller.DEFAULT_TOKEN_SERVICE_BEAN;

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected HttpSessionMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * @return
     */
    public HttpSession getScope() {
        return CMUtil.getRequest().getSession();
    }

    /**
     * @param attributeName
     *
     * @return
     */
    public Object getAttribute(@NonNull String attributeName) {
        HttpSession httpSession = this.getScope();
        if (null != httpSession) {
            return httpSession.getAttribute(attributeName);
        }
        return null;
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
        HttpSession httpSession = this.getScope();

        if (null != httpSession) {
            oReturn = httpSession.getAttribute(attributeName);
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
    public void setAttribute(@NonNull String attributeName, Object attributeValue) {
        HttpSession httpSession = this.getScope();

        if (null != httpSession && StringUtils.isNotEmpty(attributeName)) {
            if (null != attributeValue) {
                httpSession.setAttribute(attributeName, attributeValue);
            }
            else {
                httpSession.removeAttribute(attributeName);
            }
        }
    }

    /**
     * Liefert alle Attributnamen
     *
     * @return
     */
    public Enumeration<String> getAttributeNames() {
        return this.getScope().getAttributeNames();
    }

    /**
     * Sucht auf dem Request nach dem {@link #DEFAULT_TOKEN_SERVICE_BEAN} Attribute und liefert ggf. den {@link
     * RandomTokenService} zur&uuml;ck.
     *
     * @return
     */
    public RandomTokenService getTokenService() {
        RandomTokenService tokenService = null;
        Object oTokenService = this.getAttribute(DEFAULT_TOKEN_SERVICE_BEAN);

        if ((oTokenService instanceof RandomTokenService)) {
            tokenService = (RandomTokenService) oTokenService;
        }

        return tokenService;
    }

}
