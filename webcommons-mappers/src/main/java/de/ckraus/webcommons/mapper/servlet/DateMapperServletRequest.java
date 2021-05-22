package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.util.Date;

public interface DateMapperServletRequest extends ServletRequest {

    default Date getDateParameter(String name) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ));
    }

    default Date getDateParameter(String name, Date defaultValue) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ), defaultValue);
    }

    default Date getDateParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Date getDateParameter(String name, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return TypeMapperUtils.getDefaults().getDateMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
