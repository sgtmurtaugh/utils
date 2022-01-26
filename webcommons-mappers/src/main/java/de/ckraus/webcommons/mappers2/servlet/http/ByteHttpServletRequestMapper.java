package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class ByteHttpServletRequestMapper extends HttpServletRequestMapperBase<Byte> {

    /**
     * Constructor
     */
    ByteHttpServletRequestMapper() {
        super(Byte.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static ByteHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getByteMapper();
    }

    @Override
    protected TypeMapper<Byte> getMapper() {
        return TypeMapperUtils.getByteMapper();
    }

    @Override
    protected Byte mapValue(Object value, Byte defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Byte mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Byte defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
