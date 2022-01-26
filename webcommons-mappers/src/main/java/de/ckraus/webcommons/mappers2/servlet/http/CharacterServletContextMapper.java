package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class CharacterServletContextMapper extends ServletContextMapperBase<Character> {

    /**
     * Constructor
     */
    CharacterServletContextMapper() {
        super(Character.class);
    }

    /**
     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
     *
     * @return
     */
    public static CharacterServletContextMapper getInstance() {
        return ServletContextTypeMapperUtils.getCharacterMapper();
    }

    @Override
    protected TypeMapper<Character> getMapper() {
        return TypeMapperUtils.getCharacterMapper();
    }

    @Override
    protected Character mapValue(Object value, Character defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

}
