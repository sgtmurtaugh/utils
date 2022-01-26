package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class ByteHttpSessionMapper extends HttpSessionMapperBase<Byte> {

    /**
     * Constructor
     */
    ByteHttpSessionMapper() {
        super(Byte.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static ByteHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getByteMapper();
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
