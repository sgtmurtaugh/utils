package de.ckraus.commons.mapper;

import de.ckraus.commons.logging.Logger;
import de.ckraus.commons.logging.slf4j.Slf4JLogger;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "WeakerAccess", "javadoc" })
public abstract class TypeMapperBase<T> implements TypeMapper<T> {

    protected final Logger<?> log = new Slf4JLogger(TypeMapperBase.class);

    public static final boolean DEFAULT_EMPTY_STRING_NULL = Boolean.TRUE;
    public static final boolean DEFAULT_TRIM_STRING = Boolean.TRUE;

    @Getter(AccessLevel.NONE)
    private final Class<T> clazzType;
    private final T defaultValue;

    private final boolean emptyStringNull;
    private final boolean trimString;

    /**
     *
     * @return
     */
    public Class<T> forType() {
        return this.clazzType;
    }

    /**
     * Constructor
     */
    protected TypeMapperBase(@NonNull Class<T> clazzType) {
        this(clazzType, null);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    protected TypeMapperBase(@NonNull Class<T> clazzType, T defaultValue) {
        this(clazzType, defaultValue, DEFAULT_TRIM_STRING, DEFAULT_EMPTY_STRING_NULL);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bTrimStrings
     * @param bEmptyStringNull
     */
    protected TypeMapperBase(@NonNull Class<T> clazzType, T defaultValue, boolean bTrimStrings, boolean bEmptyStringNull) {
        super();

        //this.forType =
        this.clazzType = clazzType;
        this.defaultValue = defaultValue;
        this.trimString = bTrimStrings;
        this.emptyStringNull = bEmptyStringNull;
    }

}
