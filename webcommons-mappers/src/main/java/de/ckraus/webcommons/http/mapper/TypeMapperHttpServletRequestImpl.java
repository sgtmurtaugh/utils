package de.ckraus.webcommons.http.mapper;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Enumeration;

@SuppressWarnings({ "unused", "javadoc", "WeakerAccess" })
public class TypeMapperHttpServletRequestImpl extends TypeMapperServletRequestImpl implements HttpServletRequest {

    /**
     * Constructor
     * @param httpServletRequest
     */
    public TypeMapperHttpServletRequestImpl( HttpServletRequest httpServletRequest) {
       super(httpServletRequest);
    }


    public HttpServletRequest getRequest() {
        return (HttpServletRequest) super.getRequest();
    }

    public String getAuthType() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getAuthType();
    }

    public Cookie[] getCookies() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getCookies();
    }

    public long getDateHeader(String s) {
        return this.getRequest() == null
                ? 0
                : this.getRequest().getDateHeader(s);
    }

    public String getHeader(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getHeader(s);
    }

    public Enumeration getHeaders(String s) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getHeaders(s);
    }

    public Enumeration getHeaderNames() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getHeaderNames();
    }

    public int getIntHeader(String s) {
        return this.getRequest() == null
                ? 0
                : this.getRequest().getIntHeader(s);
    }

    public String getMethod() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getMethod();
    }

    public String getPathInfo() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getPathInfo();
    }

    public String getPathTranslated() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getPathTranslated();
    }

    public String getContextPath() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getContextPath();
    }

    public String getQueryString() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getQueryString();
    }

    public String getRemoteUser() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRemoteUser();
    }

    public boolean isUserInRole(String s) {
        return this.getRequest() != null && this.getRequest().isUserInRole(s);
    }

    public Principal getUserPrincipal() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getUserPrincipal();
    }

    public String getRequestedSessionId() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRequestedSessionId();
    }

    public String getRequestURI() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRequestURI();
    }

    public StringBuffer getRequestURL() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getRequestURL();
    }

    public String getServletPath() {
        return this.getRequest() == null
                ? null
                : this.getRequest().getServletPath();
    }

    public HttpSession getSession(boolean createNew) {
        return this.getRequest() == null
                ? null
                : this.getRequest().getSession(createNew);
    }

    public HttpSession getSession() {
        return this.getSession(true);
    }

    public boolean isRequestedSessionIdValid() {
        return this.getRequest() != null && this.getRequest().isRequestedSessionIdValid();
    }

    public boolean isRequestedSessionIdFromCookie() {
        return this.getRequest() != null && this.getRequest().isRequestedSessionIdFromCookie();
    }

    public boolean isRequestedSessionIdFromURL() {
        return this.getRequest() != null && this.getRequest().isRequestedSessionIdFromURL();
    }

    /**
     * isRequestedSessionIdFromUrl
     * @deprecated
     * @return
     */
    @Deprecated
    public boolean isRequestedSessionIdFromUrl() {
        return this.getRequest() != null && this.getRequest().isRequestedSessionIdFromUrl();
    }

}
