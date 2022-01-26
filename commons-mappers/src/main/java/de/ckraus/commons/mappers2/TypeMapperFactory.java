package de.ckraus.commons.mappers2;

import lombok.NonNull;
import org.springframework.beans.factory.InitializingBean;

import java.util.concurrent.ConcurrentMap;

@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public interface TypeMapperFactory extends InitializingBean {


    /* ### Base-Methods ############ */


    /**
     * getMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazzTypeMapper);

    /**
     * getMapperForType
     *
     * @return
     */
    <T extends TypeMapper<E>, E> T getMapperForType(@NonNull Class<E> clazz);

    /**
     * getRegisteredMappers
     *
     * @return
     */
    ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> getRegisteredMappers();

    /**
     * addTypeMapper
     *
     * @param clazzTypeMapper
     */
    <T extends TypeMapper<?>> T addMapper(@NonNull Class<T> clazzTypeMapper);

    /**
     * addTypeMapper
     *
     * @param typeMapper
     */
    TypeMapper<?> addMapper(@NonNull TypeMapper<?> typeMapper);


    /* ### getter- / setter-Methods ############ */


}
