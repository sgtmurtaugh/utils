package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.TypeMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;

public class CharacterHttpServletRequestMapper extends HttpServletRequestMapperBase<Character> {

    /**
     * Constructor
     */
    CharacterHttpServletRequestMapper() {
        super(Character.class);
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static CharacterHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getCharacterMapper();
    }

    @Override
    protected TypeMapper<Character> getMapper() {
        return TypeMapperUtils.getCharacterMapper();
    }

    @Override
    protected Character mapValue(Object value, Character defaultValue) {
        return this.getMapper().mapObject(value, defaultValue);
    }

    @Override
    protected Character mapValue(String value, boolean bTrim, boolean bEmptyIsNull, Character defaultValue) {
        return this.getMapper().map(value, bTrim, bEmptyIsNull, defaultValue);
    }

}
