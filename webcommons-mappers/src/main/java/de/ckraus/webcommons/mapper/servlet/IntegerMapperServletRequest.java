package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface IntegerMapperServletRequest extends ServletRequest {

    default Integer getIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map((String) this.getAttribute( name ));
    }

    default Integer getIntegerParameter(String name, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
