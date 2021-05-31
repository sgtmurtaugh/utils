package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.LocalDateScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, LocalDateScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default LocalDate getLocalDateParameter(@NonNull String name) {
        return TypeMapperUtils.getLocalDateMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDate getLocalDateParameter(@NonNull String name, LocalDate defaultValue) {
        return TypeMapperUtils.getLocalDateMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default LocalDate getLocalDateParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getLocalDateMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default LocalDate getLocalDateParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull,
                                            LocalDate defaultValue) {
        return TypeMapperUtils.getLocalDateMapper()
                              .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
