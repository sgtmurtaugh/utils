package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.util.GregorianCalendar;

public interface GregorianCalendarMapperServletRequest extends ServletRequest {

    default GregorianCalendar getGregorianCalendarParameter(String name) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map((String) this.getAttribute( name ));
    }

    default GregorianCalendar getGregorianCalendarParameter(String name, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default GregorianCalendar getGregorianCalendarParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default GregorianCalendar getGregorianCalendarParameter(String name, boolean bTrim, boolean bEmptyIsNull, GregorianCalendar defaultValue) {
        return TypeMapperUtils.getDefaults().getGregorianCalendarMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
