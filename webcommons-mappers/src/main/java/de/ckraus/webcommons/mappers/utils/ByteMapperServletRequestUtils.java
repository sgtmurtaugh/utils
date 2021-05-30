package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ByteMapperServletRequestUtils extends ServletRequestUtils, ByteMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Byte getByteParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getByteMapper().map(request.getParameter(name));
        }
        return TypeMapperUtils.getDefaults().getByteMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Byte getByteParameter(ServletRequest request, String name, Byte defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getByteMapper().map(request.getParameter(name), defaultValue);
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
    default Byte getByteParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getByteMapper().map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperUtils.getDefaults().getByteMapper().getDefaultValue();
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
    default Byte getByteParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                  Byte defaultValue) {
        if (null != request) {
            return TypeMapperUtils.getDefaults().getByteMapper()
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
    default boolean hasByteParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperUtils.getDefaults().getByteMapper().map(request.getParameter(name), (Byte) null);
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
    default boolean hasByteParameterWithValue(ServletRequest request, String name, Byte value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getByteMapper().map(request.getParameter(name), (Byte) null))
                                      .isEquals();
        }
        return false;
    }

}
