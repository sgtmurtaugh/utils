package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeMapperBase;
import de.materna.cms.cae.forms.formfiller.TokenStoreFormFiller;
import de.materna.cms.cae.util.CMUtil;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletContext;
import java.util.Enumeration;

@SuppressWarnings("javadoc")
public abstract class ServletContextMapperBase<T> extends ScopeMapperBase<ServletContext, T>
        implements ServletContextMapper<T> {

    public static final String DEFAULT_TOKEN_SERVICE_BEAN = TokenStoreFormFiller.DEFAULT_TOKEN_SERVICE_BEAN;

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected ServletContextMapperBase(@NonNull Class<T> clazzType) {
        super(clazzType);
    }

    /**
     * @return
     */
    public ServletContext getScope() {
        return CMUtil.getRequest().getServletContext();
    }

    /**
     * @param attributeName
     *
     * @return
     */
    public Object getAttribute(@NonNull String attributeName) {
        ServletContext servletContext = this.getScope();
        if (null != servletContext) {
            return servletContext.getAttribute(attributeName);
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
        ServletContext servletContext = this.getScope();

        if (null != servletContext) {
            oReturn = servletContext.getAttribute(attributeName);
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
        ServletContext servletContext = this.getScope();

        if (null != servletContext && StringUtils.isNotEmpty(attributeName)) {
            if (null != attributeValue) {
                servletContext.setAttribute(attributeName, attributeValue);
            }
            else {
                servletContext.removeAttribute(attributeName);
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

}
