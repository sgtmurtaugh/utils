package de.ckraus.commons.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused", "WeakerAccess" } )
public class CharacterUtilitiesImpl extends UtilitiesBase<Character> implements CharacterUtilities {

    private final static String CLASS = CharacterUtilitiesImpl.class.getSimpleName();


    /**
     * Constructor
     */
    public CharacterUtilitiesImpl() {
        super();
    }


}
