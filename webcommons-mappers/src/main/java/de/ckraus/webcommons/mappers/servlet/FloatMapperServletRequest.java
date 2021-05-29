package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.FloatScopeMapper;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface FloatMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, FloatScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default Float getFloatParameter(String name) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default Float getFloatParameter(String name, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Float getFloatParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Float getFloatParameter(String name, boolean bTrim, boolean bEmptyIsNull, Float defaultValue) {
        return TypeMapperUtils.getDefaults().getFloatMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}