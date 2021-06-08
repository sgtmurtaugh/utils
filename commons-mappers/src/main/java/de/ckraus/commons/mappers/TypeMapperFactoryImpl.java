package de.ckraus.commons.mappers;

import de.ckraus.commons.mappers.config.CommonsMappersApplicationContextProvider;
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
        var bigDecimalMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getBigDecimalMapper();
        this.addTypeMapper(bigDecimalMapper);

        var bigInteger = CommonsMappersApplicationContextProvider.getMapperConfig().getBigIntegerMapper();
        this.addTypeMapper(bigInteger);

        var booleanMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getBooleanMapper();
        this.addTypeMapper(booleanMapper);

        var byteMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getByteMapper();
        this.addTypeMapper(byteMapper);

        var characterMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getCharacterMapper();
        this.addTypeMapper(characterMapper);

        var dateMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getDateMapper();
        this.addTypeMapper(dateMapper);

        var doubleMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getDoubleMapper();
        this.addTypeMapper(doubleMapper);

        var floatMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getFloatMapper();
        this.addTypeMapper(floatMapper);

        var gregorianCalendarMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getGregorianCalendarMapper();
        this.addTypeMapper(gregorianCalendarMapper);

        var integerMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getIntegerMapper();
        this.addTypeMapper(integerMapper);

        var localDateMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLocalDateMapper();
        this.addTypeMapper(localDateMapper);

        var localDateTimeMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLocalDateTimeMapper();
        this.addTypeMapper(localDateTimeMapper);

        var localTimeMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLocalTimeMapper();
        this.addTypeMapper(localTimeMapper);

        var longMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLongMapper();
        this.addTypeMapper(longMapper);

        var shortMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getShortMapper();
        this.addTypeMapper(shortMapper);

        var stringMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getStringMapper();
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
