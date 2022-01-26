package de.ckraus.commons.mappers;

import lombok.NonNull;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by ckraus on 07.08.15.
 */
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public interface TypeMapperFactory<E> extends InitializingBean {


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
    <T extends TypeMapper<E>, E> T getMapperForType(@NonNull Class<E> clazz);

    /**
     * getRegisteredTypeMappers
     *
     * @return
     */
    E getRegisteredTypeMappers();

    /**
     * addRegisteredTypeMapper
     *
     * @param clazzTypeMapper
     */
    <T extends TypeMapper<?>> T addTypeMapper(@NonNull Class<T> clazzTypeMapper);

    /**
     * addRegisteredTypeMapper
     *
     * @param typeMapper
     */
    TypeMapper<?> addTypeMapper(@NonNull TypeMapper<?> typeMapper);

    /**
     * getTypeMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    <T extends TypeMapper> T getTypeMapper(@NonNull Class<T> clazzTypeMapper);

}
