package de.ckraus.commons.mapper.utils;

import de.ckraus.commons.mapper.TypeMapper;
import lombok.NonNull;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by ckraus on 07.08.15.
 */
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public interface TypeMapperUtils {


    /* ### getter- / setter-Methods ############ */


    /**
     * get
     *
     * @return
     */
    default <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazzTypeMapper) {
        return clazzTypeMapper.cast(this.getTypeMapper(clazzTypeMapper));
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
     * @param typeMapper
     */
    private TypeMapper<?> addRegisteredTypeMapper(@NonNull TypeMapper<?> typeMapper) {
        this.getRegisteredTypeMappers().put(typeMapper.getClass(), typeMapper);
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
            try {
                typeMapper = (T) this.addRegisteredTypeMapper(clazzTypeMapper.getDeclaredConstructor().newInstance());
            }
            catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return typeMapper;
    }



    /* ### getter- / setter-Methods ############ */


    /**
     * get
     *
     * @return
     */
    default <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazzTypeMapper) {
        return clazzTypeMapper.cast(this.getTypeMapper(clazzTypeMapper));
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
     * @param typeMapper
     */
    private TypeMapper<?> addRegisteredTypeMapper(@NonNull TypeMapper<?> typeMapper) {
        this.getRegisteredTypeMappers().put(typeMapper.getClass(), typeMapper);
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
            try {
                typeMapper = (T) this.addRegisteredTypeMapper(clazzTypeMapper.getDeclaredConstructor().newInstance());
            }
            catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return typeMapper;
    }

}
