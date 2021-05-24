package de.ckraus.webcommons.mapper.servlet;

import javax.servlet.ServletRequestWrapper;

@SuppressWarnings({ "unused", "javadoc", "WeakerAccess" })
public class TypeMapperServletRequestFacade extends ServletRequestWrapper implements TypeMapperServletRequest {

    /**
     * Constructor
     * @param typeMapperServletRequest
     */
    public TypeMapperServletRequestFacade(TypeMapperServletRequest typeMapperServletRequest) {
        super(typeMapperServletRequest);
    }

    /**
     * <p>TODO
     * @return
     */
    public TypeMapperServletRequest getRequest() {
        return (TypeMapperServletRequest) super.getRequest();
    }

}
