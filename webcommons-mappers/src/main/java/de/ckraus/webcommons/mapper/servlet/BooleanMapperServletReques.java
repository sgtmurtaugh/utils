package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface BooleanMapperServletReques extends ServletRequest {

    default Boolean getBooleanParameter(String name) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map((String) this.getAttribute( name ));
    }

    default Boolean getBooleanParameter(String name, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default Boolean getBooleanParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default Boolean getBooleanParameter(String name, boolean bTrim, boolean bEmptyIsNull, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
