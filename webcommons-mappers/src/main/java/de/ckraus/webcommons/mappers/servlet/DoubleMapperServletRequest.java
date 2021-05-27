package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.DoubleScopeMapper;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface DoubleMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, DoubleScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default Double getDoubleParameter(String name) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default Double getDoubleParameter(String name, Double defaultValue) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Double getDoubleParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Double getDoubleParameter(String name, boolean bTrim, boolean bEmptyIsNull, Double defaultValue) {
        return TypeMapperUtils.getDefaults().getDoubleMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
