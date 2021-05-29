package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.IntegerScopeMapper;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface IntegerMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, IntegerScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default Integer getIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default Integer getIntegerParameter(String name, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Integer getIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, Integer defaultValue) {
        return TypeMapperUtils.getDefaults().getIntegerMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}