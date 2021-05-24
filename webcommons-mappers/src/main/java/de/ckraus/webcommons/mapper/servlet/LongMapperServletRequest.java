package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface LongMapperServletRequest extends ServletRequest {

    default Long getLongAttribute(String name) {
        return TypeMapperUtils.getDefaults().getLongMapper().mapObject(this.getAttribute(name));
    }

    default Long getLongAttribute(String name, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default Long getLongParameter(String name) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter( name ));
    }

    default Long getLongParameter(String name, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter( name ), defaultValue);
    }

    default Long getLongParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Long getLongParameter(String name, boolean bTrim, boolean bEmptyIsNull, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
