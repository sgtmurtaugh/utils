package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.StringMapper;
import lombok.NonNull;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeStringMapperUtil<S> extends ScopeTypeMapperUtil<StringMapper, String, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default String mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default String mapAttribute(@NonNull S scope, @NonNull String name, String defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

    /**
     * @param scope
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default String mapAttribute(@NonNull S scope, @NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return this.getMapper().map(this.mapAttribute(scope, name), bTrim, bEmptyIsNull);
    }

    /**
     * @param scope
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default String mapAttribute(@NonNull S scope, @NonNull String name, boolean bTrim, boolean bEmptyIsNull,
                                String defaultValue) {
        return this.getMapper().map(this.mapAttribute(scope, name), bTrim, bEmptyIsNull, defaultValue);
    }

}
