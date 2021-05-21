package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface StringMapperServletRequest extends ServletRequest {

    default String getStringParameter(String name) {
        return TypeMapperUtils.getDefaults().getStringMapper().map((String) this.getAttribute( name ));
    }

    default String getStringParameter(String name, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default String getStringParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getStringMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default String getStringParameter(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperUtils.getDefaults().getStringMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
