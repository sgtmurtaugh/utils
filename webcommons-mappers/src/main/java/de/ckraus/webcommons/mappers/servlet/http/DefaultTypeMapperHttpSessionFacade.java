package de.ckraus.webcommons.mappers.servlet.http;

import lombok.NonNull;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

@SuppressWarnings({ "unused", "javadoc" })
public class DefaultTypeMapperHttpSessionFacade
        implements BigDecimalMapperHttpSession, BigIntegerMapperHttpSession, BooleanMapperHttpSession,
        ByteMapperHttpSession, CharacterMapperHttpSession, DateMapperHttpSession, DoubleMapperHttpSession,
        FloatMapperHttpSession, GregorianCalendarMapperHttpSession, IntegerMapperHttpSession,
        LocalDateMapperHttpSession, LocalDateTimeMapperHttpSession, LocalTimeMapperHttpSession, LongMapperHttpSession,
        ShortMapperHttpSession, StringMapperHttpSession {

    private final HttpSession httpSession;

    /**
     * Constructor
     *
     * @param httpSession
     */
    public DefaultTypeMapperHttpSessionFacade(@NonNull HttpSession httpSession) {
        super();
        this.httpSession = httpSession;
    }

    /**
     * getHttpSession
     *
     * @return
     */
    public HttpSession getHttpSession() {
        return httpSession;
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

    public int getMaxInactiveInterval() {
        return this.getHttpSession().getMaxInactiveInterval();
    }

    public void setMaxInactiveInterval(int interval) {
        this.getHttpSession().setMaxInactiveInterval(interval);
    }

    @Deprecated
    public HttpSessionContext getSessionContext() {
        return this.getHttpSession().getSessionContext();
    }

    public Object getAttribute(String key) {
        return this.getHttpSession().getAttribute(key);
    }

    @Deprecated
    public Object getValue(String key) {
        return this.getHttpSession().getValue(key);
    }

    public Enumeration<?> getAttributeNames() {
        return this.getHttpSession().getAttributeNames();
    }

    @Deprecated
    public String[] getValueNames() {
        return this.getHttpSession().getValueNames();
    }

    public void setAttribute(String key, Object value) {
        this.getHttpSession().setAttribute(key, value);
    }

    @Deprecated
    public void putValue(String key, Object value) {
        this.getHttpSession().putValue(key, value);
    }

    public void removeAttribute(String key) {
        this.getHttpSession().removeAttribute(key);
    }

    @Deprecated
    public void removeValue(String key) {
        this.getHttpSession().removeValue(key);
    }

    public void invalidate() {
        this.getHttpSession().invalidate();
    }

    public boolean isNew() {
        return this.getHttpSession().isNew();
    }
}
