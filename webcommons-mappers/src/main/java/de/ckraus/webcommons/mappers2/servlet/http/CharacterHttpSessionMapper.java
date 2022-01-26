package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class CharacterHttpSessionMapper extends HttpSessionMapperBase<Character> {

    /**
     * Constructor
     */
    CharacterHttpSessionMapper() {
        super(Character.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
     *
     * @return
     */
    public static CharacterHttpSessionMapper getInstance() {
        return HttpSessionTypeMapperUtils.getCharacterMapper();
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
