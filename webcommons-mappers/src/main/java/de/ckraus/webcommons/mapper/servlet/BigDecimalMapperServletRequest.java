package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.math.BigDecimal;

public interface BigDecimalMapperServletRequest extends ServletRequest {

    default BigDecimal getBigDecimalParameter(String name) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map((String) this.getAttribute( name ));
    }

    default BigDecimal getBigDecimalParameter(String name, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map((String) this.getAttribute( name ), defaultValue);
    }

    default BigDecimal getBigDecimalParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull);
    }

    default BigDecimal getBigDecimalParameter(String name, boolean bTrim, boolean bEmptyIsNull, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map((String) this.getAttribute( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
