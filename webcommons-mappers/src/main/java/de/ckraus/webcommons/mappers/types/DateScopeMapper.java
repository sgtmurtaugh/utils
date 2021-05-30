package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.Date;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface DateScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default Date getDateAttribute(@NonNull String name) {
        return TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Date getDateAttribute(@NonNull String name, Date defaultValue) {
        return TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasDateAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasDateAttributeWithValue(@NonNull String name, Date value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperUtils.getDefaults().getDateMapper().mapObject(this.getAttribute(name), null)).isEquals();
        }
        return false;
    }

}
