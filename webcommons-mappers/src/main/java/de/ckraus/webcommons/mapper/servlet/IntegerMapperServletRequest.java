package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface IntegerMapperServletRequest extends ServletRequest {

    default Integer getIntegerAttribute(String name) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().mapObject(this.getAttribute(name));
    }

    default Integer getIntegerAttribute(String name, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default Integer getIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ));
    }

    default Integer getIntegerParameter(String name, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ), defaultValue);
    }

    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
