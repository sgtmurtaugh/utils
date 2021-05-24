package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.time.LocalDateTime;

public interface LocalDateTimeMapperServletRequest extends ServletRequest {

    default LocalDateTime getLocalDateTimeAttribute(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject(this.getAttribute(name));
    }

    default LocalDateTime getLocalDateTimeAttribute(String name, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default LocalDateTime getLocalDateTimeParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ));
    }

    default LocalDateTime getLocalDateTimeParameter(String name, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ), defaultValue);
    }

    default LocalDateTime getLocalDateTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default LocalDateTime getLocalDateTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
