package de.ckraus.commons.mapper;

import de.ckraus.commons.logging.Logger;
import de.ckraus.commons.logging.slf4j.Slf4JLogger;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc" })
public abstract class TypeMapperBase<E> implements TypeMapper<E> {

    protected final Logger<?> log = new Slf4JLogger(TypeMapperBase.class);

    private final E defaultValue;

    private final boolean emptyStringNull;
    private final boolean trimStrings;


    /**
     * Constructor
     */
    protected TypeMapperBase() {
        this(null);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    protected TypeMapperBase(E defaultValue) {
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
    protected TypeMapperBase(E defaultValue, boolean bTrimStrings, boolean bEmptyStringNull) {
        super();

        this.defaultValue = defaultValue;
        this.trimStrings = bTrimStrings;
        this.emptyStringNull = bEmptyStringNull;
    }

}
