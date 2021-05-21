package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.time.LocalDate;

public interface LocalDateMapperServletRequest extends ServletRequest {

    default LocalDate getLocalDateParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map((String) this.getAttribute( name ));
    }

    default LocalDate getLocalDateParameter(String name, LocalDate defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default LocalDate getLocalDateParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default LocalDate getLocalDateParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalDate defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
