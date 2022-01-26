package de.ckraus.commons.mappers;

import lombok.Getter;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component("typeMapperFactory")
@Getter
@SuppressWarnings({ "javadoc", "unused" })
public class TypeMapperFactoryImpl
        implements TypeMapperFactory<ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>>> {

    private final ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> registeredTypeMappers =
            new ConcurrentHashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    /* ### getter- / setter-Methods ############ */


    /**
     * getMapperForType
     *
     * @return
     */
    public <T extends TypeMapper<E>, E> T getMapperForType(@NonNull Class<E> clazz) {
        for (TypeMapper<?> typeMapper : this.getRegisteredTypeMappers().values()) {
            if (typeMapper.forType().isAssignableFrom(clazz)) {
                return (T) typeMapper;
            }
        }
        return null;
    }

    /**
     * addRegisteredTypeMapper
     *
     * @param clazzTypeMapper
     */
    public <T extends TypeMapper<?>> T addTypeMapper(@NonNull Class<T> clazzTypeMapper) {
        T typeMapper = null;

        if (!this.getRegisteredTypeMappers().containsKey(clazzTypeMapper)) {
            try {
                typeMapper = clazzTypeMapper.getDeclaredConstructor().newInstance();
                this.addTypeMapper(typeMapper);
            }
            catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return typeMapper;
    }

    /**
     * addRegisteredTypeMapper
     *
     * @param typeMapper
     */
    public TypeMapper<?> addTypeMapper(@NonNull TypeMapper<?> typeMapper) {
        if (!this.getRegisteredTypeMappers().containsKey(typeMapper.getClass())) {
            this.getRegisteredTypeMappers().put(typeMapper.getClass(), typeMapper);
        }
        return typeMapper;
    }

    /**
     * getTypeMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends TypeMapper> T getTypeMapper(@NonNull Class<T> clazzTypeMapper) {
        T typeMapper;

        if (this.getRegisteredTypeMappers().containsKey(clazzTypeMapper)) {
            typeMapper = (T) this.getRegisteredTypeMappers().get(clazzTypeMapper);
        }
        else {
            typeMapper = this.addTypeMapper(clazzTypeMapper);
        }
        return typeMapper;
    }

}
