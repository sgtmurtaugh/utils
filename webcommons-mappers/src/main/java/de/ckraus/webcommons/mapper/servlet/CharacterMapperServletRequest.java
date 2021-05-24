package de.ckraus.webcommons.mapper.servlet;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;

import javax.servlet.ServletRequest;

public interface CharacterMapperServletRequest extends ServletRequest {

    default Character getCharacterAttribute(String name) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().mapObject(this.getAttribute(name));
    }

    default Character getCharacterAttribute(String name, Character defaultValue) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    default Character getCharacterParameter(String name) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter( name ));
    }

    default Character getCharacterParameter(String name, Character defaultValue) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter( name ), defaultValue);
    }

    default Character getCharacterParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull);
    }

    default Character getCharacterParameter(String name, boolean bTrim, boolean bEmptyIsNull, Character defaultValue) {
        return TypeMapperUtils.getDefaults().getCharacterMapper().map(this.getParameter( name ), bTrim, bEmptyIsNull, defaultValue);
    }

}
