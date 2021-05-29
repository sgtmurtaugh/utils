package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.BigIntegerScopeMapper;

import javax.servlet.ServletRequest;
import java.math.BigInteger;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface BigIntegerMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, BigIntegerScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default BigInteger getBigIntegerParameter(String name) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerParameter(String name, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default BigInteger getBigIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default BigInteger getBigIntegerParameter(String name, boolean bTrim, boolean bEmptyIsNull, BigInteger defaultValue) {
        return TypeMapperUtils.getDefaults().getBigIntegerMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}