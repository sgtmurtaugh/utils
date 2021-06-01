package de.ckraus.webcommons.mappers.neu.utils;

import de.ckraus.commons.mapper.DateMapper;
import lombok.NonNull;

import java.util.Date;

/**
 * @param <S> scope
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ScopeDateMapperUtil<S> extends ScopeTypeMapperUtil<DateMapper, Date, S> {

    /**
     * @param scope
     * @param name
     *
     * @return
     */
    default Date mapAttribute(@NonNull S scope, @NonNull String name) {
        return this.getMapper().mapObject(this.getAttribute(scope, name));
    }

    /**
     * @param scope
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Date mapAttribute(@NonNull S scope, @NonNull String name, Date defaultValue) {
        return this.getMapper().mapObject(this.getAttribute(scope, name), defaultValue);
    }

}
