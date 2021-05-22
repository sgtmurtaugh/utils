package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;
import java.math.BigInteger;

public interface BigIntegerMapperServletRequest extends ServletRequest {

    default BigInteger getBigIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ));
    }

    default BigInteger getBigIntegerParameter(String name, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ), defaultValue);
    }

    default BigInteger getBigIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default BigInteger getBigIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
