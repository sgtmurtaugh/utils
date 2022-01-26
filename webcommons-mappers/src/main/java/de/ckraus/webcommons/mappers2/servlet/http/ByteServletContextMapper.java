package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class ByteServletContextMapper extends ServletContextMapperBase<Byte> {

    /**
     * Constructor
     */
    ByteServletContextMapper() {
        super(Byte.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static ByteServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getByteMapper();
    }

    @Override
    protected TypeMapper<Byte> getMapper() {
        return TypeMapperUtils.getByteMapper();
    }

    @Override
    protected Byte mapValue(Object value, Byte defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
