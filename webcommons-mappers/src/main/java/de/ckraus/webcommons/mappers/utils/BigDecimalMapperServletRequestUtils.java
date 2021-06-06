package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.TypeMapperFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigDecimalMapperServletRequestUtils
        extends ServletRequestUtils, BigDecimalMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    static BigDecimal getBigDecimalParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getBigDecimalMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default BigDecimal getBigDecimalParameter(ServletRequest request, String name, BigDecimal defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getBigDecimalMapper().map(request.getParameter(name), defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default BigDecimal getBigDecimalParameter(ServletRequest request, String name, boolean bTrim,
                                              boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getBigDecimalMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default BigDecimal getBigDecimalParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                              BigDecimal defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getBigDecimalMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default boolean hasBigDecimalParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getBigDecimalMapper()
                                         .map(request.getParameter(name), (BigDecimal) null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param request
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasBigDecimalParameterWithValue(ServletRequest request, String name, BigDecimal value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getBigDecimalMapper()
                                                                      .map(request.getParameter(name), (BigDecimal) null))
                                      .isEquals();
        }
        return false;
    }

}
