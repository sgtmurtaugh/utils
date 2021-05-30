package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default LocalDate getLocalDateAttribute(@NonNull String name) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalDate getLocalDateAttribute(@NonNull String name, LocalDate defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasLocalDateAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasLocalDateAttributeWithValue(@NonNull String name, LocalDate value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
