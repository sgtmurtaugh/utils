package de.ckraus.webcommons.mappers.neu.types;


import de.ckraus.commons.mapper.TypeMapper;
import lombok.NonNull;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeTypeMapper<E, S> {

    TypeMapper<E> getTypeMapper();

    /**
     * @param s scope
     * @param name attribute
     *
     * @return
     */
    E getAttribute(@NonNull S s, @NonNull String name);

    /**
     * @param s scope
     * @param name attribute
     *
     * @return
     */
    E mapAttribute(@NonNull S s, @NonNull String name);

    /**
     * @param s scope
     * @param name attribute
     * @param defaultValue default
     *
     * @return
     */
    E mapAttribute(@NonNull S s, @NonNull String name, E defaultValue);

    /**
     * @param s scope
     * @param name attribute
     *
     * @return
     */
    boolean hasAttribute(@NonNull String s, @NonNull String name);

    /**
     * @param s scope
     * @param name attribute
     * @param value expected value
     *
     * @return
     */
    boolean hasAttributeWithValue(@NonNull S s, @NonNull String name, E value);

}
