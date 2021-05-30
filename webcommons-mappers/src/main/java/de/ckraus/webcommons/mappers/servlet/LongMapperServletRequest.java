package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.LongScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LongMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, LongScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default Long getLongParameter(@NonNull String name) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Long getLongParameter(@NonNull String name, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default Long getLongParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getLongMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default Long getLongParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull, Long defaultValue) {
        return TypeMapperUtils.getDefaults().getLongMapper()
                              .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
