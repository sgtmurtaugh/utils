package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.BigDecimalMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigDecimalMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, BigDecimalMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default BigDecimal getBigDecimalParameter(HttpServletRequest request, String name) {
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
    default BigDecimal getBigDecimalParameter(HttpServletRequest request, String name, BigDecimal defaultValue) {
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
    default BigDecimal getBigDecimalParameter(HttpServletRequest request, String name, boolean bTrim,
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
    default BigDecimal getBigDecimalParameter(HttpServletRequest request, String name, boolean bTrim,
                                              boolean bEmptyIsNull, BigDecimal defaultValue) {
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
    default boolean hasBigDecimalParameter(HttpServletRequest request, String name) {
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
    default boolean hasBigDecimalParameterWithValue(HttpServletRequest request, String name, BigDecimal value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getBigDecimalMapper()
                                                                      .map(request.getParameter(name), (BigDecimal) null))
                                      .isEquals();
        }
        return false;
    }

}
