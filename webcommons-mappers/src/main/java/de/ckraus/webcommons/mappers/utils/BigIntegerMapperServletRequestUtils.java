package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mappers.TypeMapperFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;
import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigIntegerMapperServletRequestUtils
        extends ServletRequestUtils, BigIntegerMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default BigInteger getBigIntegerParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getBigIntegerMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getBigIntegerMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default BigInteger getBigIntegerParameter(ServletRequest request, String name, BigInteger defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getBigIntegerMapper().map(request.getParameter(name), defaultValue);
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
    default BigInteger getBigIntegerParameter(ServletRequest request, String name, boolean bTrim,
                                              boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getBigIntegerMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getBigIntegerMapper().getDefaultValue();
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
    default BigInteger getBigIntegerParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                              BigInteger defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getBigIntegerMapper()
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
    default boolean hasBigIntegerParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getBigIntegerMapper()
                                         .map(request.getParameter(name), (BigInteger) null);
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
    default boolean hasBigIntegerParameterWithValue(ServletRequest request, String name, BigInteger value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getBigIntegerMapper()
                                                                      .map(request.getParameter(name), (BigInteger) null))
                                      .isEquals();
        }
        return false;
    }

}
