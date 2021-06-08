package de.ckraus.commons.mappers;

import lombok.NonNull;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by ckraus on 07.08.15.
 */
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public interface TypeMapperFactory extends InitializingBean {


    /* ### getter- / setter-Methods ############ */


    /**
     * getMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    default <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazzTypeMapper) {
        return clazzTypeMapper.cast(this.getTypeMapper(clazzTypeMapper));
    }

    /**
     * getMapperForType
     *
     * @return
     */
    default <T extends TypeMapper<E>, E> T getMapperForType(@NonNull Class<E> clazz) {
        for (TypeMapper<?> typeMapper : this.getRegisteredTypeMappers().values()) {
            if (typeMapper.forType().isAssignableFrom(clazz)) {
                return (T) typeMapper;
            }
        }
        return null;
    }

    /**
     * getRegisteredTypeMappers
     *
     * @return
     */
    ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> getRegisteredTypeMappers();

    /**
     * addRegisteredTypeMapper
     *
     * @param clazzTypeMapper
     */
    default <T extends TypeMapper<?>> T addTypeMapper(@NonNull Class<T> clazzTypeMapper) {
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
    default TypeMapper<?> addTypeMapper(@NonNull TypeMapper<?> typeMapper) {
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
    default <T extends TypeMapper> T getTypeMapper(@NonNull Class<T> clazzTypeMapper) {
        T typeMapper = null;

        if (this.getRegisteredTypeMappers().containsKey(clazzTypeMapper)) {
            typeMapper = (T) this.getRegisteredTypeMappers().get(clazzTypeMapper);
        }
        else {
            typeMapper = this.addTypeMapper(clazzTypeMapper);
        }
        return typeMapper;
    }

}
