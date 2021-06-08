package de.ckraus.webcommons.mappers.types;

import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.webcommons.mappers.ScopeMapper;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface StringScopeMapper extends ScopeMapper {

    /**
     * @param name
     *
     * @return
     */
    default String getStringAttribute(@NonNull String name) {
        return TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(name));
    }

    /**
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default String getStringAttribute(@NonNull String name, String defaultValue) {
        return TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(name), defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default String getStringAttribute(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return TypeMapperFactory.getStringMapper().map(this.getStringAttribute(name), bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default String getStringAttribute(@NonNull String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return TypeMapperFactory.getStringMapper()
                                .map(this.getStringAttribute(name, defaultValue), bTrim, bEmptyIsNull, defaultValue);
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasStringAttribute(@NonNull String name) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            var value = TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(name), null);
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
    default boolean hasStringAttributeWithValue(@NonNull String name, String value) {
        if (StringUtils.isNotEmpty(name) && null != this.getAttribute(name)) {
            return new EqualsBuilder().append(value,
                    TypeMapperFactory.getStringMapper().mapObject(this.getAttribute(name), null))
                                      .isEquals();
        }
        return false;
    }

}
