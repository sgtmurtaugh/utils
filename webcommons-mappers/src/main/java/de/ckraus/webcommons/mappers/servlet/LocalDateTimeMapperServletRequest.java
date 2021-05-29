package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.LocalDateTimeScopeMapper;

import javax.servlet.ServletRequest;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface LocalDateTimeMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, LocalDateTimeScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(String name, boolean bTrim, boolean bEmptyIsNull, LocalDateTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateTimeMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}