package de.ckraus.webcommons.mappers;

import de.ckraus.commons.mapper.StringMapper;
import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.StringJoiner;

@SuppressWarnings({ "javadoc", "unused", "WeakerAccess" })
public interface ServletRequestScopeMapper extends ScopeMapper {

    /**
     * @return
     */
    private StringMapper getStringMapper() {
        return TypeMapperUtils.getStringMapper();
    }

    /**
     * @param name
     *
     * @return
     */
    default boolean hasParameter(@NonNull String name) {
        return (null != this.getParameter(name));
    }

    /**
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default boolean hasParameter(@NonNull String name, boolean bTrim, boolean bEmptyIsNull) {
        return (null != this.getParameter(name, bTrim, bEmptyIsNull, null));
    }

    /**
     * @param name
     * @param value
     *
     * @return
     */
    default boolean hasParameterWithValue(@NonNull String name, String value) {
        return new EqualsBuilder().append(this.getParameter(name), value).isEquals();
    }

    /**
     * @return
     */
    String getParameterPrefix();

    /**
     * @return
     */
    String getParameterSuffix();

    /**
     * <p>TODO</p>
     *
     * @param parameterName
     *
     * @return
     */
    default String getParameterName(@NonNull String parameterName) {
        if (StringUtils.isNotEmpty(parameterName)) {
            if (StringUtils.isEmpty(this.getParameterPrefix()) && StringUtils.isEmpty(this.getParameterSuffix())) {
                return parameterName;
            }
            else {
                var joiner = new StringJoiner("", (null != this.getParameterPrefix()
                                                           ? this.getParameterPrefix()
                                                           : ""), (null != this.getParameterSuffix()
                                                                           ? this.getParameterSuffix()
                                                                           : ""));
                joiner.add(parameterName);
                return joiner.toString();
            }
        }
        return null;
    }

    /**
     * TODO
     *
     * @param name
     *
     * @return
     */
    default String getParameter(String name) {
        return this.getStringMapper().map(this.getParameterName(name));
    }

    /**
     * TODO
     *
     * @param name
     * @param defaultValue
     *
     * @return
     */
    default String getParameter(String name, String defaultValue) {
        return this.getStringMapper().map(this.getParameterName(name), defaultValue);
    }

    /**
     * TODO
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     *
     * @return
     */
    default String getParameter(String name, boolean bTrim, boolean bEmptyIsNull) {
        return this.getStringMapper().map(this.getParameterName(name), bTrim, bEmptyIsNull);
    }

    /**
     * TODO
     *
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     *
     * @return
     */
    default String getParameter(String name, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.getStringMapper().map(this.getParameterName(name), bTrim, bEmptyIsNull, defaultValue);
    }

}
