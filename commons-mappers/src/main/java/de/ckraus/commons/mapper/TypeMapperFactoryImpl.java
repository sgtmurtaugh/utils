package de.ckraus.commons.mapper;

import de.ckraus.commons.mapper.conf.ApplicationContextProvider;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component("typeMapperFactory")
@Getter
public class TypeMapperFactoryImpl implements TypeMapperFactory {

    private final ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> registeredTypeMappers =
            new ConcurrentHashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        var bigDecimalMapper = ApplicationContextProvider.getApplicationContext().getBean(BigDecimalMapperImpl.class);
        this.addTypeMapper(bigDecimalMapper);

        var bigInteger = ApplicationContextProvider.getApplicationContext().getBean(BigIntegerMapperImpl.class);
        this.addTypeMapper(bigInteger);

        var booleanMapper = ApplicationContextProvider.getApplicationContext().getBean(BooleanMapperImpl.class);
        this.addTypeMapper(booleanMapper);

        var byteMapper = ApplicationContextProvider.getApplicationContext().getBean(ByteMapperImpl.class);
        this.addTypeMapper(byteMapper);

        var characterMapper = ApplicationContextProvider.getApplicationContext().getBean(CharacterMapperImpl.class);
        this.addTypeMapper(characterMapper);

        var dateMapper = ApplicationContextProvider.getApplicationContext().getBean(DateMapperImpl.class);
        this.addTypeMapper(dateMapper);

        var doubleMapper = ApplicationContextProvider.getApplicationContext().getBean(DoubleMapperImpl.class);
        this.addTypeMapper(doubleMapper);

        var floatMapper = ApplicationContextProvider.getApplicationContext().getBean(FloatMapperImpl.class);
        this.addTypeMapper(floatMapper);

        var gregorianCalendarMapper =
                ApplicationContextProvider.getApplicationContext().getBean(GregorianCalendarMapperImpl.class);
        this.addTypeMapper(gregorianCalendarMapper);

        var integerMapper = ApplicationContextProvider.getApplicationContext().getBean(IntegerMapperImpl.class);
        this.addTypeMapper(integerMapper);

        var localDateMapper = ApplicationContextProvider.getApplicationContext().getBean(LocalDateMapperImpl.class);
        this.addTypeMapper(localDateMapper);

        var localDateTimeMapper =
                ApplicationContextProvider.getApplicationContext().getBean(LocalDateTimeMapperImpl.class);
        this.addTypeMapper(localDateTimeMapper);

        var localTimeMapper = ApplicationContextProvider.getApplicationContext().getBean(LocalTimeMapperImpl.class);
        this.addTypeMapper(localTimeMapper);

        var longMapper = ApplicationContextProvider.getApplicationContext().getBean(LongMapperImpl.class);
        this.addTypeMapper(longMapper);

        var shortMapper = ApplicationContextProvider.getApplicationContext().getBean(ShortMapperImpl.class);
        this.addTypeMapper(shortMapper);

        var stringMapper = ApplicationContextProvider.getApplicationContext().getBean(StringMapperImpl.class);
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
