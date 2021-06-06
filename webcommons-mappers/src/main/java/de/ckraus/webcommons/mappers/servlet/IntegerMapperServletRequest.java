package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.IntegerScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface IntegerMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, IntegerScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default Integer getIntegerParameter(@NonNull String name) {
        return TypeMapperFactory.getIntegerMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Integer getIntegerParameter(@NonNull String name, Integer defaultValue) {
        return TypeMapperFactory.getIntegerMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default Integer getIntegerParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperFactory.getIntegerMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default Integer getIntegerParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull,
                                        Integer defaultValue) {
        return TypeMapperFactory.getIntegerMapper()
                                .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
