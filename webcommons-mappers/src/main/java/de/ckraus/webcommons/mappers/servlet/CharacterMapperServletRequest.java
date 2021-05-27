package de.ckraus.webcommons.mappers.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ServletRequestScopeMapper;
import de.ckraus.webcommons.mappers.types.CharacterScopeMapper;

import javax.servlet.ServletRequest;

/**
 *
 */
@SuppressWarnings({"unused", "javadoc"})
public interface CharacterMapperServletRequest extends ServletRequest, ServletRequestScopeMapper, CharacterScopeMapper {

    @Override
    default String getParameter(String name) {
        return ServletRequestScopeMapper.super.getParameter(name);
    }

    /**
     * @param name
     * @return
     */
    default Character getCharacterParameter(String name) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter(name));
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default Character getCharacterParameter(String name, Character defaultValue) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default Character getCharacterParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default Character getCharacterParameter(String name, boolean bTrim, boolean bEmptyIsNull, Character defaultValue) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
