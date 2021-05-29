package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.ShortScopeMapper;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface ShortMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, ShortScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default Short getShortParameter(String name) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default Short getShortParameter(String name, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Short getShortParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Short getShortParameter(String name, boolean bTrim, boolean bEmptyIsNull, Short defaultValue) {
        return TypeMapperUtils.getDefaults().getShortMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}