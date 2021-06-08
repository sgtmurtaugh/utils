package de.ckraus.webcommons.mappers.neu.types;


import de.ckraus.commons.mappers.TypeMapper;
import lombok.NonNull;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeStringMapper<S> extends ScopeTypeMapper<String, S> {

    @Override
    TypeMapper<String> getTypeMapper();

    /**
     * @param s scope
     * @param name attribute
     *
     * @return
     */
    default String mapAttribute(@NonNull S s, @NonNull String name) {
        return this.getTypeMapper().mapObject(this.getAttribute(s, name));
    }

    /**
     * @param s scope
     * @param name attribute
     * @param defaultValue default
     *
     * @return
     */
    default String mapAttribute(@NonNull S s, @NonNull String name, String defaultValue) {
        return this.getTypeMapper().mapObject(this.getAttribute(s, name));
    }

    /**
     * @param s scope
     * @param name attribute
     *
     * @return
     */
    boolean hasAttribute(@NonNull S s, @NonNull String name);

    /**
     * @param s scope
     * @param name attribute
     * @param value expected value
     *
     * @return
     */
    boolean hasAttributeWithValue(@NonNull S s, @NonNull String name, String value);

}
