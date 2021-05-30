package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.time.LocalTime;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalTimeScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default LocalTime getLocalTimeAttribute(@NonNull String name) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default LocalTime getLocalTimeAttribute(@NonNull String name, LocalTime defaultValue) {
        return TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasLocalTimeAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasLocalTimeAttributeWithValue(@NonNull String name, LocalTime value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getLocalTimeMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
