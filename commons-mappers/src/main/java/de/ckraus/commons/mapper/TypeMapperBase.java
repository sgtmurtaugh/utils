package de.ckraus.commons.mapper;

import de.ckraus.commons.logging.Logger;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "WeakerAccess", "javadoc" } )
public abstract class TypeMapperBase<E> implements TypeMapper<E> {

    private final static String CLASS = TypeMapperBase.class.getSimpleName();
    protected static Logger log = LoggerFactory.getLogger( TypeMapperBase.class );

    private final E defaultValue;

    private final boolean emptyStringNull;
    private final boolean trimStrings;


    /**
     * Constructor
     */
    public TypeMapperBase() {
        this( null );
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public TypeMapperBase( E defaultValue ) {
        super();

        this.defaultValue = defaultValue;
        this.trimStrings = TypeMapper.super.isTrimStrings();
        this.emptyStringNull = TypeMapper.super.isEmptyStringNull();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    public TypeMapperBase( E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull ) {
        super();

        this.defaultValue = defaultValue;
        this.trimStrings = bTrimStrings;
        this.emptyStringNull = bEmptyStringNull;
    }

}
