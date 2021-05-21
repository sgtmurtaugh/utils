package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface LongMapperServletRequest extends ServletRequest {

    default Long getLongParameter(String name) {
        return TypeMapperUtils.getDefaults().getLongMapper().map((String) this.getAttribute( name ));
    }

    default Long getLongParameter(String name, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default Long getLongParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLongMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default Long getLongParameter(String name, boolean bTrim, boolean bEmptyIsNull, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
