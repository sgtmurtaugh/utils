package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.time.LocalDateTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateTimeScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute(@NonNull String name) {
        return TypeMapperFactory.getLocalDateTimeMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDateTime getLocalDateTimeAttribute(@NonNull String name, LocalDateTime defaultValue) {
        return TypeMapperFactory.getLocalDateTimeMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasLocalDateTimeAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getLocalDateTimeMapper().mapObject(this.getAttribute(name), null);
            return (null != value);
        }
        return false;
    }

    /**
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasLocalDateTimeAttributeWithValue(@NonNull String name, LocalDateTime value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getLocalDateTimeMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
