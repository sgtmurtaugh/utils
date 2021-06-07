package de.ckraus.commons.mapper;

import de.ckraus.commons.mapper.config.ApplicationContextProvider;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component("typeMapperFactory")
@Getter
@SuppressWarnings({"javadoc", "unused"})
public class TypeMapperFactoryImpl implements TypeMapperFactory {

    private final ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> registeredTypeMappers =
            new ConcurrentHashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        var bigDecimalMapper = ApplicationContextProvider.getMapperConfig().getBigDecimalMapper();
        this.addTypeMapper(bigDecimalMapper);

        var bigInteger = ApplicationContextProvider.getMapperConfig().getBigIntegerMapper();
        this.addTypeMapper(bigInteger);

        var booleanMapper = ApplicationContextProvider.getMapperConfig().getBooleanMapper();
        this.addTypeMapper(booleanMapper);

        var byteMapper = ApplicationContextProvider.getMapperConfig().getByteMapper();
        this.addTypeMapper(byteMapper);

        var characterMapper = ApplicationContextProvider.getMapperConfig().getCharacterMapper();
        this.addTypeMapper(characterMapper);

        var dateMapper = ApplicationContextProvider.getMapperConfig().getDateMapper();
        this.addTypeMapper(dateMapper);

        var doubleMapper = ApplicationContextProvider.getMapperConfig().getDoubleMapper();
        this.addTypeMapper(doubleMapper);

        var floatMapper = ApplicationContextProvider.getMapperConfig().getFloatMapper();
        this.addTypeMapper(floatMapper);

        var gregorianCalendarMapper = ApplicationContextProvider.getMapperConfig().getGregorianCalendarMapper();
        this.addTypeMapper(gregorianCalendarMapper);

        var integerMapper = ApplicationContextProvider.getMapperConfig().getIntegerMapper();
        this.addTypeMapper(integerMapper);

        var localDateMapper = ApplicationContextProvider.getMapperConfig().getLocalDateMapper();
        this.addTypeMapper(localDateMapper);

        var localDateTimeMapper = ApplicationContextProvider.getMapperConfig().getLocalDateTimeMapper();
        this.addTypeMapper(localDateTimeMapper);

        var localTimeMapper = ApplicationContextProvider.getMapperConfig().getLocalTimeMapper();
        this.addTypeMapper(localTimeMapper);

        var longMapper = ApplicationContextProvider.getMapperConfig().getLongMapper();
        this.addTypeMapper(longMapper);

        var shortMapper = ApplicationContextProvider.getMapperConfig().getShortMapper();
        this.addTypeMapper(shortMapper);

        var stringMapper = ApplicationContextProvider.getMapperConfig().getStringMapper();
        this.addTypeMapper(stringMapper);
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
