package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface ShortMapperServletRequest extends ServletRequest {

    default Short getShortAttribute(String name) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getAttribute(name));
    }

    default Short getShortAttribute(String name, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getAttribute(name), defaultValue);
    }

    default Short getShortParameter(String name) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ));
    }

    default Short getShortParameter(String name, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ), defaultValue);
    }

    default Short getShortParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Short getShortParameter(String name, boolean bTrim, boolean bEmptyIsNull, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
