package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface FloatMapperServletRequest extends ServletRequest {

    default Float getFloatAttribute(String name) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getAttribute(name));
    }

    default Float getFloatAttribute(String name, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getAttribute(name), defaultValue);
    }

    default Float getFloatParameter(String name) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter( name ));
    }

    default Float getFloatParameter(String name, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter( name ), defaultValue);
    }

    default Float getFloatParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Float getFloatParameter(String name, boolean bTrim, boolean bEmptyIsNull, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
