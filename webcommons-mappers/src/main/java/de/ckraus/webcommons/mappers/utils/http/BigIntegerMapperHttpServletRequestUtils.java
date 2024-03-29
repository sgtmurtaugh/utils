package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.utils.BigIntegerMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface BigIntegerMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, BigIntegerMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default BigInteger getBigIntegerParameter(HttpServletRequest request, String name) {
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
    default BigInteger getBigIntegerParameter(HttpServletRequest request, String name, BigInteger defaultValue) {
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
    default BigInteger getBigIntegerParameter(HttpServletRequest request, String name, boolean bTrim,
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
    default BigInteger getBigIntegerParameter(HttpServletRequest request, String name, boolean bTrim,
                                              boolean bEmptyIsNull, BigInteger defaultValue) {
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
    default boolean hasBigIntegerParameter(HttpServletRequest request, String name) {
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
    default boolean hasBigIntegerParameterWithValue(HttpServletRequest request, String name, BigInteger value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value, TypeMapperFactory.getBigIntegerMapper()
                                                                      .map(request.getParameter(name), (BigInteger) null))
                                      .isEquals();
        }
        return false;
    }

}
