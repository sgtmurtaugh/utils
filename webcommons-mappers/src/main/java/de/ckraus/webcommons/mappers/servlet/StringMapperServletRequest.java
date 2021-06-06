package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.StringScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface StringMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, StringScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default String getStringParameter(@NonNull String name) {
        return TypeMapperFactory.getStringMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default String getStringParameter(@NonNull String name, String defaultValue) {
        return TypeMapperFactory.getStringMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default String getStringParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperFactory.getStringMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default String getStringParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperFactory.getStringMapper()
                                .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
