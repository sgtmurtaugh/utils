package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.BigDecimalScopeMapper;

import javax.servlet.ServletRequest;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface BigDecimalMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, BigDecimalScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalParameter(String name, boolean bTrim, boolean bEmptyIsNull, BigDecimal defaultValue) {
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
