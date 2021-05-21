package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.time.LocalTime;

public interface LocalTimeMapperServletRequest extends ServletRequest {

    default LocalTime getLocalTimeParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map((String) this.getAttribute( name ));
    }

    default LocalTime getLocalTimeParameter(String name, LocalTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default LocalTime getLocalTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default LocalTime getLocalTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
