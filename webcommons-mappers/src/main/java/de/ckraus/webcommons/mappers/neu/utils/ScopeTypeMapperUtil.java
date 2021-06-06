package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.TypeMapper;
import de.ckraus.commons.mapper.TypeMapperFactory;
import lombok.NonNull;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * @param <M> typeMapper
 * @param <T> type
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeTypeMapperUtil<M extends TypeMapper<T>, T, S> {


    /* ### getter- / setter-Methods ############ */


    /**
     * TODO
     *
     * @return
     */
    M getMapper();

    /**
     * TODO
     *
     * @return
     */
    TypeMapperFactory getTypeMapperUtils();

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default T getAttribute(@NonNull S scope, @NonNull String name) {
        return this.getAttribute(scope, name, this.getMapper().getDefaultValue());
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default T getAttribute(@NonNull S scope, @NonNull String name, T defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default boolean hasAttribute(@NonNull S scope, @NonNull String name) {
        return (null != this.getMapper().mapObject(this.getAttribute(scope, name), null));
    }

    /**
     * @param scope
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasAttributeWithValue(@NonNull S scope, @NonNull String name, Object value) {
        return new EqualsBuilder().append(value, this.getMapper().mapObject(this.getAttribute(scope, name), null))
                                  .isEquals();
    }

}
