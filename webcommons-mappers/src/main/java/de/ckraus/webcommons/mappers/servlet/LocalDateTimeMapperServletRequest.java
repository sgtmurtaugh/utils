package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.LocalDateTimeScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateTimeMapperServletRequest
        extends ServletRequest, ServletRequestScopeMapper, LocalDateTimeScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(@NonNull String name) {
        return TypeMapperFactory.getLocalDateTimeMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(@NonNull String name, LocalDateTime defaultValue) {
        return TypeMapperFactory.getLocalDateTimeMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperFactory.getLocalDateTimeMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull,
                                                    LocalDateTime defaultValue) {
        return TypeMapperFactory.getLocalDateTimeMapper()
                                .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
