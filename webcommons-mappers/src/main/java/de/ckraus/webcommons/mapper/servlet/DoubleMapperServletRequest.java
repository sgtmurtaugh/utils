package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface DoubleMapperServletRequest extends ServletRequest {

    default Double getDoubleParameter(String name) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map((String) this.getAttribute( name ));
    }

    default Double getDoubleParameter(String name, Double defaultValue) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default Double getDoubleParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default Double getDoubleParameter(String name, boolean bTrim, boolean bEmptyIsNull, Double defaultValue) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
