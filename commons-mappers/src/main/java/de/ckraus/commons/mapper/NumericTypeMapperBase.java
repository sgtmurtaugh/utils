package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "WeakerAccess", "javadoc", "unused" } )
public abstract class NumericTypeMapperBase<E extends Number> extends TypeMapperBase<E>
        implements NumericTypeMapper<E> {

    private final static String CLASS = NumericTypeMapperBase.class.getSimpleName();


    /**
     * Constructor
     */
    public NumericTypeMapperBase() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public NumericTypeMapperBase( E defaultValue ) {
        super( defaultValue );
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    public NumericTypeMapperBase( E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull ) {
        super( defaultValue, bTrimStrings, bEmptyStringNull );
    }

}
