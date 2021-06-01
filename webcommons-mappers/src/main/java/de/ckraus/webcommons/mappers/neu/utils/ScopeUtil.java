package de.ckraus.webcommons.mappers.neu.utils;

import lombok.NonNull;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeUtil<S> {

    /**
     * @param scope scope
     * @param name
     *
     * @return
     */
    Object getAttribute(@NonNull S scope, @NonNull String name);

    /**
     * @param scope scope
     * @param name attribute
     *
     * @return
     */
    default boolean hasAttribute(@NonNull S scope, @NonNull String name) {
        return (null != this.getAttribute(scope, name));
    }


    /**
     * @param scope scope
     * @param name attribute
     * @param value expected value
     *
     * @return
     */
    default boolean hasAttributeWithValue(@NonNull S scope, @NonNull String name, Object value) {
        if (this.hasAttribute(scope, name)) {
            return new EqualsBuilder().append(this.getAttribute(scope, name), value).isEquals();
        }
        return false;
    }

}
