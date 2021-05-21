package de.ckraus.webcommons.mapper.servlet.http;

import javax.servlet.http.HttpServletRequestWrapper;

@SuppressWarnings({ "unused", "javadoc", "WeakerAccess" })
public class TypeMapperHttpServletRequestFacade extends HttpServletRequestWrapper implements TypeMapperHttpServletRequest {

    /**
     * Constructor
     * @param httpServletRequest
     */
    public TypeMapperHttpServletRequestFacade( TypeMapperHttpServletRequest typeMapperHttpServletRequest ) {
       super( typeMapperHttpServletRequest );
    }

    /**
     * <p>TODO
     * @return
     */
    public TypeMapperHttpServletRequest getRequest() {
        return (TypeMapperHttpServletRequest) super.getRequest();
    }

}
