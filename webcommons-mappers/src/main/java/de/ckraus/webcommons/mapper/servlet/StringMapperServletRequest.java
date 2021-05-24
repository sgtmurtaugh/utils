package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface StringMapperServletRequest extends ServletRequest {

    default String getStringAttribute(String name) {
        return TypeMapperUtils.getDefaults().getStringMapper().mapObject(this.getAttribute(name));
    }

    default String getStringAttribute(String name, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default String getStringAttribute(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getStringAttribute(name), bTrim, bEmptyIsNull);
    }

    default String getStringAttribute(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getStringAttribute(name, defaultValue), bTrim, bEmptyIsNull, defaultValue);
    }

    default String getStringParameter(String name) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name));
    }

    default String getStringParameter(String name, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name), defaultValue);
    }

    default String getStringParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    default String getStringParameter(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
