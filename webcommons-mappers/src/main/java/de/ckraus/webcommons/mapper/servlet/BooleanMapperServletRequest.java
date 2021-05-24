package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface BooleanMapperServletRequest extends ServletRequest {

    default Boolean getBooleanAttribute(String name) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().mapObject(this.getAttribute(name));
    }

    default Boolean getBooleanAttribute(String name, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default Boolean getBooleanParameter(String name) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter( name ));
    }

    default Boolean getBooleanParameter(String name, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter( name ), defaultValue);
    }

    default Boolean getBooleanParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Boolean getBooleanParameter(String name, boolean bTrim, boolean bEmptyIsNull, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
