package de.ckraus.webcommons.mappers2.servlet;

import lombok.NonNull;
import org.springframework.beans.factory.InitializingBean;

import java.util.concurrent.ConcurrentMap;

@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public interface ScopeTypeMapperFactory<S> extends InitializingBean {


    /* ### getter- / setter-Methods ############ */


    /**
     * getMapper
     *
     * @param clazzTypeMapper
     *
     * @return
     */
    <T extends ScopeMapper<S, ?>> T getMapper(@NonNull Class<T> clazzTypeMapper);

    /**
     * getMapperForType
     *
     * @return
     */
    <T extends ScopeMapper<S, E>, E> T getMapperForType(@NonNull Class<E> clazz);

    /**
     * getRegisteredMappers
     *
     * @return
     */
    ConcurrentMap<Class<? extends ScopeMapper>, ScopeMapper<S, ?>> getRegisteredMappers();

    /**
     * addMapper
     *
     * @param clazzTypeMapper
     */
    <T extends ScopeMapper<S, ?>> T addMapper(@NonNull Class<T> clazzTypeMapper);

    /**
     * addMapper
     *
     * @param typeMapper
     */
    ScopeMapper<S, ?> addMapper(@NonNull ScopeMapper<S, ?> typeMapper);

}
