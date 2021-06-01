package de.ckraus.commons.mapper.utils;

import de.ckraus.commons.logging.slf4j.Slf4JLogger;
import de.ckraus.commons.mapper.*;
import lombok.Getter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by ckraus on 07.08.15.
 */
@Getter
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public class TypeMapperUtilsImpl implements TypeMapperUtils {

    private static final String CLASS = TypeMapperUtilsImpl.class.getSimpleName();
    protected Slf4JLogger log = new Slf4JLogger(TypeMapperUtilsImpl.class);

    private final ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> registeredTypeMappers =
            new ConcurrentHashMap<>();

    /**
     * Constructor
     */
    public TypeMapperUtilsImpl() {
        super();
    }


    /* ### getter- / setter-Methods ############ */


    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public BigDecimalMapper getBigDecimalMapper() {
        return this.getMapper(BigDecimalMapperImpl.class);
    }


    /* ### additional Methods ############ */

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public BigIntegerMapper getBigIntegerMapper() {
        return this.getMapper(BigIntegerMapperImpl.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public BooleanMapper getBooleanMapper() {
        return this.getMapper(BooleanMapperImpl.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public ByteMapper getByteMapper() {
        return this.getMapper(ByteMapperImpl.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public CharacterMapper getCharacterMapper() {
        return this.getMapper(CharacterMapperImpl.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public DateMapper getDateMapper() {
        return this.getMapper(DateMapperImpl.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public DoubleMapper getDoubleMapper() {
        return this.getMapper(DoubleMapperImpl.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public FloatMapper getFloatMapper() {
        return this.getMapper(FloatMapperImpl.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public GregorianCalendarMapper getGregorianCalendarMapper() {
        return this.getMapper(GregorianCalendarMapperImpl.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public IntegerMapper getIntegerMapper() {
        return this.getMapper(IntegerMapperImpl.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    public LocalDateMapper getLocalDateMapper() {
        return this.getMapper(LocalDateMapperImpl.class);
    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    public LocalDateTimeMapper getLocalDateTimeMapper() {
        return this.getMapper(LocalDateTimeMapperImpl.class);
    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    public LocalTimeMapper getLocalTimeMapper() {
        return this.getMapper(LocalTimeMapperImpl.class);
    }

    /**
     * getLongMapper
     *
     * @return
     */
    public LongMapper getLongMapper() {
        return this.getMapper(LongMapperImpl.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public ShortMapper getShortMapper() {
        return this.getMapper(ShortMapperImpl.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public StringMapper getStringMapper() {
        return this.getMapper(StringMapperImpl.class);
    }

}
