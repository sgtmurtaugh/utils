package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.LocalTimeScopeMapper;

import javax.servlet.ServletRequest;
import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface LocalTimeMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, LocalTimeScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default LocalTime getLocalTimeParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeParameter(String name, LocalTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default LocalTime getLocalTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default LocalTime getLocalTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
