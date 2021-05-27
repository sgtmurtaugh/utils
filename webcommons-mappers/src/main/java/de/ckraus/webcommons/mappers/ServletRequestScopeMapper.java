package de.ckraus.webcommons.mappers;

import de.ckraus.commons.mapper.StringMapper;
import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import lombok.NonNull;
import org.apache.commons.lang3.builder.EqualsBuilder;

@SuppressWarnings({"javadoc", "unused", "WeakerAccess"})
public interface ServletRequestScopeMapper extends ScopeMapper {

    /**
     * @return
     */
    private StringMapper getStringMapper() {
        return TypeMapperUtils.getDefaults().getStringMapper();
    }

    /**
     * @param name
     * @return
     */
    default boolean hasParameter(String name) {
        return (null != this.getParameter(name));
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default boolean hasParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return (null != this.getParameter(name, bTrim, bEmptyIsNull, null));
    }

    /**
     * @param name
     * @param value
     * @return
     */
    default boolean hasParameterWithValue(@NonNull String name, String value) {
        return new EqualsBuilder().append(this.getParameter(name), value).isEquals();
    }

    String getParameterPrefix();

    String getParameterSuffix();

    String getParameterName(String parameterName);

    boolean isUseParameterPrefix();

    boolean isUseParameterSuffix();

    /**
     * @param name
     * @return
     */
    default String getParameter(String name) {
        return this.getStringMapper().map(name);
    }

    /**
     * @param name
     * @param defaultValue
     * @return
     */
    default String getParameter(String name, String defaultValue) {
        return this.getStringMapper().map(name, defaultValue);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default String getParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return this.getStringMapper().map(name, bTrim, bEmptyIsNull);
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getParameter(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.getStringMapper().map(name, bTrim, bEmptyIsNull, defaultValue);
    }

}
