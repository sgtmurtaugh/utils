package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mapper.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface ByteScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default Byte getByteAttribute(@NonNull String name) {
        return TypeMapperFactory.getByteMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default Byte getByteAttribute(@NonNull String name, Byte defaultValue) {
        return TypeMapperFactory.getByteMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasByteAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getByteMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasByteAttributeWithValue(@NonNull String name, Byte value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getByteMapper().mapObject(this.getAttribute(name), null)).isEquals();
        }
        return false;
    }

}
