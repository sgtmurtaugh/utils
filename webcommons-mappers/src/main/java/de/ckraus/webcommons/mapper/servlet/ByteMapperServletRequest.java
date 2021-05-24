package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface ByteMapperServletRequest extends ServletRequest {

    default Byte getByteAttribute(String name) {
        return TypeMapperUtils.getDefaults().getByteMapper().mapObject(this.getAttribute(name));
    }

    default Byte getByteAttribute(String name, Byte defaultValue) {
        return TypeMapperUtils.getDefaults().getByteMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default Byte getByteParameter(String name) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter( name ));
    }

    default Byte getByteParameter(String name, Byte defaultValue) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter( name ), defaultValue);
    }

    default Byte getByteParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Byte getByteParameter(String name, boolean bTrim, boolean bEmptyIsNull, Byte defaultValue) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
