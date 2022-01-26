package de.ckraus.webcommons.mappers2.servlet;

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

@Component("scopeTypeMapperFactory")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public abstract class ScopeTypeMapperFactoryBase<S> implements ScopeTypeMapperFactory<S> {

    private ConcurrentMap<Class<? extends ScopeMapper>, ScopeMapper<S, ?>> registeredMappers =
            new ConcurrentHashMap<>();

    @Setter(AccessLevel.PUBLIC)
    private List<ScopeMapper<S, ?>> initialMappers = null;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (CollectionUtils.isNotEmpty(this.getInitialMappers())) {
            for (ScopeMapper<S, ?> scopeMapper : this.getInitialMappers()) {
                this.addMapper(scopeMapper);
            }
        }
    }

    /* ### Base-Methods ############ */

    @Override
    public <T extends ScopeMapper<S, ?>> T getMapper(@NonNull Class<T> clazzMapper) {
        T scopeMapper;

        if (this.getRegisteredMappers().containsKey(clazzMapper)) {
            scopeMapper = (T) this.getRegisteredMappers().get(clazzMapper);
        }
        else {
            scopeMapper = this.addMapper(clazzMapper);
        }
        return clazzMapper.cast(scopeMapper);
    }

    /**
     * getMapperForType
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends ScopeMapper<S, E>, E> T getMapperForType(@NonNull Class<E> clazz) {
        for (ScopeMapper<S, ?> scopeMapper : this.getRegisteredMappers().values()) {
            if (scopeMapper.forType().isAssignableFrom(clazz)) {
                return (T) scopeMapper;
            }
        }
        return null;
    }


    /**
     * addMapper
     *
     * @param clazzTypeMapper
     */
    public <T extends ScopeMapper<S, ?>> T addMapper(@NonNull Class<T> clazzTypeMapper) {
        T scopeMapper = null;

        if (!this.getRegisteredMappers().containsKey(clazzTypeMapper)) {
            try {
                scopeMapper = clazzTypeMapper.getDeclaredConstructor().newInstance();
                this.addMapper(scopeMapper);
            }
            catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return scopeMapper;
    }

    /**
     * addMapper
     *
     * @param scopeMapper
     */
    public ScopeMapper<S, ?> addMapper(@NonNull ScopeMapper<S, ?> scopeMapper) {
        if (!this.getRegisteredMappers().containsKey(scopeMapper.getClass())) {
            this.getRegisteredMappers().put(scopeMapper.getClass(), scopeMapper);
        }
        return scopeMapper;
    }

    /* ### getter- / setter-Methods ############ */

}
