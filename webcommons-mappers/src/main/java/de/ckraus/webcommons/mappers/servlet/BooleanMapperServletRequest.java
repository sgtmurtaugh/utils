package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.BooleanScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BooleanMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, BooleanScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default Boolean getBooleanParameter(@NonNull String name) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Boolean getBooleanParameter(@NonNull String name, Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default Boolean getBooleanParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBooleanMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default Boolean getBooleanParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull,
                                        Boolean defaultValue) {
        return TypeMapperUtils.getDefaults().getBooleanMapper()
                              .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
