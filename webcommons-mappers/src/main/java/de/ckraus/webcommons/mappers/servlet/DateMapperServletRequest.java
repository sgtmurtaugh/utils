package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.DateScopeMapper;
import lombok.NonNull;

import javax.servlet.ServletRequest;
import java.util.Date;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DateMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, DateScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     *
     * @return
     */
    default Date getDateParameter(@NonNull String name) {
        return TypeMapperFactory.getDateMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Date getDateParameter(@NonNull String name, Date defaultValue) {
        return TypeMapperFactory.getDateMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default Date getDateParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperFactory.getDateMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default Date getDateParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull, Date defaultValue) {
        return TypeMapperFactory.getDateMapper()
                                .map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
