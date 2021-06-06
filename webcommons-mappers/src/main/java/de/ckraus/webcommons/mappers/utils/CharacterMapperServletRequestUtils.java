package de.ckraus.webcommons.mappers.utils;

import de.ckraus.commons.mapper.TypeMapperFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface CharacterMapperServletRequestUtils
        extends ServletRequestUtils, CharacterMapperScopeUtils<ServletRequest> {

    /**
     * @param request
     * @param name
     *
     * @return
     */
    default Character getCharacterParameter(ServletRequest request, String name) {
        if (null != request) {
            return TypeMapperFactory.getCharacterMapper().map(request.getParameter(name));
        }
        return TypeMapperFactory.getCharacterMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Character getCharacterParameter(ServletRequest request, String name, Character defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getCharacterMapper().map(request.getParameter(name), defaultValue);
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
    default Character getCharacterParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull) {
        if (null != request) {
            return TypeMapperFactory.getCharacterMapper()
                                    .map(request.getParameter(name), bTrim, bEmptyIsNull);
        }
        return TypeMapperFactory.getCharacterMapper().getDefaultValue();
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
    default Character getCharacterParameter(ServletRequest request, String name, boolean bTrim, boolean bEmptyIsNull,
                                            Character defaultValue) {
        if (null != request) {
            return TypeMapperFactory.getCharacterMapper()
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
    default boolean hasCharacterParameter(ServletRequest request, String name) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            var value = TypeMapperFactory.getCharacterMapper().map(request.getParameter(name), null);
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
    default boolean hasCharacterParameterWithValue(ServletRequest request, String name, Character value) {
        if (null != request && StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(request.getParameter(name))) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getCharacterMapper().map(request.getParameter(name), null))
                                      .isEquals();
        }
        return false;
    }

}
