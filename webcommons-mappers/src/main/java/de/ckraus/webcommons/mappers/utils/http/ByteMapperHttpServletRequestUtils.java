package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.utils.ByteMapperScopeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ByteMapperHttpServletRequestUtils
        extends HttpServletRequestUtils, ByteMapperScopeUtils<HttpServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Byte getByteParameter(HttpServletRequest request, String name) {
        if (null != request) {
            return TypeMapperUtils.getByteMapper().map(request.getParameter(name));
        }
        return TypeMapperUtils.getByteMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Byte getByteParameter(HttpServletRequest request, String name, Byte defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getByteMapper().map(request.getParameter(name), defaultValue);
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
    default Byte getByteParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperUtils.getByteMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperUtils.getByteMapper().getDefaultValue();
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
    default Byte getByteParameter(HttpServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                  Byte defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getByteMapper()
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
    default boolean hasByteParameter(HttpServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperUtils.getByteMapper().map(request.getParameter(name), (Byte) null);
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
    default boolean hasByteParameterWithValue(HttpServletRequest request, String name, Byte value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getByteMapper().map(request.getParameter(name), (Byte) null))
                                      .isEquals();
        }
        return false;
    }

}
