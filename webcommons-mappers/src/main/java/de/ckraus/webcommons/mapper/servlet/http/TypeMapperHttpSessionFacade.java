package de.ckraus.webcommons.mapper.servlet.http;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

@SuppressWarnings({ "unused", "javadoc", "WeakerAccess" })
public class TypeMapperHttpSessionFacade extends HttpSession implements TypeMapperHttpSession {

    private TypeMapperHttpSession typeMapperHttpSession;

    /**
     * Constructor
     * @param httpSession
     */
    public TypeMapperHttpSessionFacade( TypeMapperHttpSession typeMapperHttpSession ) {
        super();

        if ( null != typeMapperHttpSession ) {
            this.typeMapperHttpSession = typeMapperHttpSession;
        }
        else {
            throw new IllegalArgumentException( "session parameter must not be null!" );
        }
    }

    /**
     * getHttpSession
     * @return
     */
    public TypeMapperHttpSession getHttpSession() {
        return this.typeMapperHttpSession;
    }

    public long getCreationTime() {
        return this.getHttpSession().getCreationTime();
    }

    public String getId() {
        return this.getHttpSession().getId();
    }

    public long getLastAccessedTime() {
        return this.getHttpSession().getLastAccessedTime();
    }

    public ServletContext getServletContext() {
        return this.getHttpSession().getServletContext();
    }

    public void setMaxInactiveInterval(int interval) {
        this.getHttpSession().setMaxInactiveInterval( interval );
    }

    public int getMaxInactiveInterval() {
        return this.getHttpSession().getMaxInactiveInterval();
    }

    @Deprecated
    public HttpSessionContext getSessionContext() {
        return this.getHttpSession().getSessionContext();
    }

    public Object getAttribute(String key) {
        return this.getHttpSession().getAttribute( key );
    }

    @Deprecated
    public Object getValue(String key) {
        return this.getHttpSession().getValue( key );
    }

    public Enumeration getAttributeNames() {
        return this.getHttpSession().getAttributeNames();
    }

    @Deprecated
    public String[] getValueNames() {
        return this.getHttpSession().getValueNames();
    }

    public void setAttribute(String key, Object value ) {
        this.getHttpSession().setAttribute( key, value );
    }

    @Deprecated
    public void putValue(String key, Object value) {
        this.getHttpSession().putValue( key, value );
    }

    public void removeAttribute(String key) {
        this.getHttpSession().removeAttribute( key );
    }

    @Deprecated
    public void removeValue(String key) {
        this.getHttpSession().removeValue( key );
    }

    public void invalidate() {
        this.getHttpSession().invalidate();
    }

    public boolean isNew() {
        return this.getHttpSession().isNew();
    }
}
