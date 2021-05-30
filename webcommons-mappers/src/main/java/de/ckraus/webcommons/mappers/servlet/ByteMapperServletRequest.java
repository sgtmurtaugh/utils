package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.ByteScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ByteMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, ByteScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default Byte getByteParameter(@NonNull String name) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Byte getByteParameter(@NonNull String name, Byte defaultValue) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default Byte getByteParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getByteMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default Byte getByteParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull, Byte defaultValue) {
        return TypeMapperUtils.getDefaults().getByteMapper()
                              .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
