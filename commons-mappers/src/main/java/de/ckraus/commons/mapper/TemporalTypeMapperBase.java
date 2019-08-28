package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.temporal.Temporal;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "WeakerAccess", "javadoc", "unused" } )
public abstract class TemporalTypeMapperBase<E extends Temporal> extends TypeMapperBase<E>
        implements TemporalTypeMapper<E> {

    private final static String CLASS = TemporalTypeMapperBase.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(AbstractNumericTypeMapper.class);


    /**
     * Constructor
     */
    public TemporalTypeMapperBase() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public TemporalTypeMapperBase( E defaultValue ) {
        super( defaultValue );
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    public TemporalTypeMapperBase( E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull ) {
        super( defaultValue, bTrimStrings, bEmptyStringNull );
    }

}
