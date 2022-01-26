package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component("typeMapperFactory")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class TypeMapperFactoryImpl implements TypeMapperFactory {

    private ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> registeredMappers = new ConcurrentHashMap<>();

    @Setter(AccessLevel.PUBLIC)
    private List<TypeMapper<?>> initialMappers = null;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (CollectionUtils.isNotEmpty(this.getInitialMappers())) {
            for (TypeMapper<?> typeMapper : this.getInitialMappers()) {
                this.addMapper(typeMapper);
            }
        }
    }

    /* ### Base-Methods ############ */

    /**
     * getTypeMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazzTypeMapper) {
        T typeMapper;

        if (this.getRegisteredMappers().containsKey(clazzTypeMapper)) {
            typeMapper = (T) this.getRegisteredMappers().get(clazzTypeMapper);
        }
        else {
            typeMapper = this.addMapper(clazzTypeMapper);
        }
        return clazzTypeMapper.cast(typeMapper);
    }

    /**
     * getMapperForType
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends TypeMapper<E>, E> T getMapperForType(@NonNull Class<E> clazz) {
        for (TypeMapper<?> typeMapper : this.getRegisteredMappers().values()) {
            if (typeMapper.forType().isAssignableFrom(clazz)) {
                return (T) typeMapper;
            }
        }
        return null;
    }

    /**
     * addMapper
     *
     * @param clazzTypeMapper
     */
    public <T extends TypeMapper<?>> T addMapper(@NonNull Class<T> clazzTypeMapper) {
        T typeMapper = null;

        if (!this.getRegisteredMappers().containsKey(clazzTypeMapper)) {
            try {
                typeMapper = clazzTypeMapper.getDeclaredConstructor().newInstance();
                this.addMapper(typeMapper);
            }
            catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return typeMapper;
    }

    /**
     * addMapper
     *
     * @param typeMapper
     */
    public TypeMapper<?> addMapper(@NonNull TypeMapper<?> typeMapper) {
        if (!this.getRegisteredMappers().containsKey(typeMapper.getClass())) {
            this.getRegisteredMappers().put(typeMapper.getClass(), typeMapper);
        }
        return typeMapper;
    }

    /* ### getter- / setter-Methods ############ */



    /* ### additional Methods ############ */

    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public BigDecimalMapperImpl getBigDecimalMapper() {
        return this.getMapper(BigDecimalMapperImpl.class);
    }

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public BigIntegerMapperImpl getBigIntegerMapper() {
        return this.getMapper(BigIntegerMapperImpl.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public BooleanMapperImpl getBooleanMapper() {
        return this.getMapper(BooleanMapperImpl.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public ByteMapperImpl getByteMapper() {
        return this.getMapper(ByteMapperImpl.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public CharacterMapperImpl getCharacterMapper() {
        return this.getMapper(CharacterMapperImpl.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public DateMapperImpl getDateMapper() {
        return this.getMapper(DateMapperImpl.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public DoubleMapperImpl getDoubleMapper() {
        return this.getMapper(DoubleMapperImpl.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public FloatMapperImpl getFloatMapper() {
        return this.getMapper(FloatMapperImpl.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public GregorianCalendarMapperImpl getGregorianCalendarMapper() {
        return this.getMapper(GregorianCalendarMapperImpl.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public IntegerMapperImpl getIntegerMapper() {
        return this.getMapper(IntegerMapperImpl.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    public LocalDateMapperImpl getLocalDateMapper() {
        return this.getMapper(LocalDateMapperImpl.class);
    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    public LocalDateTimeMapperImpl getLocalDateTimeMapper() {
        return this.getMapper(LocalDateTimeMapperImpl.class);
    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    public LocalTimeMapperImpl getLocalTimeMapper() {
        return this.getMapper(LocalTimeMapperImpl.class);
    }

    /**
     * getLongMapper
     *
     * @return
     */
    public LongMapperImpl getLongMapper() {
        return this.getMapper(LongMapperImpl.class);
    }

    /**
     * getOWASPAntiSamyHtmlMapper
     *
     * @return
     */
    public OWASPAntiSamyHtmlMapperImpl getOWASPAntiSamyHtmlMapper() {
        return this.getMapper(OWASPAntiSamyHtmlMapperImpl.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public ShortMapperImpl getShortMapper() {
        return this.getMapper(ShortMapperImpl.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public StringMapperImpl getStringMapper() {
        return this.getMapper(StringMapperImpl.class);
    }

}
