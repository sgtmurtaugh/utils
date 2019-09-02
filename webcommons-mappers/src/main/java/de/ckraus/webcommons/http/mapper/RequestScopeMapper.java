package de.ckraus.webcommons.http.mapper;

import de.ckraus.commons.mapper.TypeMapperUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletRequest;

@SuppressWarnings({ "javadoc", "unused", "WeakerAccess" })
public interface RequestScopeMapper extends ScopeMapper {

    ServletRequest getRequest();

    /**
     * hasParameter
     * @param key
     * @return
     */
    default boolean hasParameter(String key) {
        return this.hasParameter(key, TypeMapperUtils.getDefaults().getStringMapper().isTrimStrings(),
                TypeMapperUtils.getDefaults().getStringMapper().isEmptyStringNull());
    }

    /**
     * hasParameter
     * @param key
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default boolean hasParameter(String key, boolean bTrim, boolean bEmptyIsNull) {
        String sParameterValue = this.getParameter(key, bTrim, bEmptyIsNull,
                TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue());

        boolean bHasParameter = StringUtils.isNoneEmpty( sParameterValue );

        return bHasParameter;
    }

    boolean hasParameterWithValue( String value );

    String getParameterPrefix();
    String getParameterSuffix();
    String getParameterName(String parameterName);
    boolean isUseParameterPrefix();
    boolean isUseParameterSuffix();

    /**
     * getParameter
     * @param key
     * @return
     */
    default String getParameter(String key) {
        return this.getParameter(key, TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue());
    }

    /**
     * getParameter
     * @param key
     * @param defaultValue
     * @return
     */
    default String getParameter(String key, String defaultValue) {
        return this.getParameter(key, TypeMapperUtils.getDefaults().getStringMapper().isTrimStrings(),
                TypeMapperUtils.getDefaults().getStringMapper().isEmptyStringNull(), defaultValue);
    }

    /**
     * getParameter
     * @param key
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default String getParameter(String key, boolean bTrim, boolean bEmptyIsNull) {
        return this.getParameter(key, bTrim, bEmptyIsNull,
                TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue());
    }

    /**
     * getParameter
     * @param key
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getParameter(String key, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        String sParameterValue = defaultValue;

        if (StringUtils.isNoneEmpty( key )) {
            String sParameterName = this.getParameterName( key );

            String sParameter = this.getRequest().getParameter( sParameterName );

            sParameterValue = TypeMapperUtils.getDefaults().getStringMapper().map(
                    sParameter, bTrim, bEmptyIsNull, defaultValue );
        }
        return sParameterValue;
    }

    /**
     * getParameterNames
     * @param key
     * @return
     */
    default String[] getParameterNames(String key) {
        return this.getParameterNames(key, ArrayUtils.EMPTY_STRING_ARRAY);
    }

    /**
     * getParameterNames
     * @param key
     * @param defaultValues
     * @return
     */
    default String[] getParameterNames(String key, String[] defaultValues) {
        return this.getParameterNames(key, TypeMapperUtils.getDefaults().getStringMapper().isTrimStrings(),
                TypeMapperUtils.getDefaults().getStringMapper().isEmptyStringNull(), defaultValues);
    }

    /**
     * getParameterNames
     * @param key
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default String[] getParameterNames(String key, boolean bTrim, boolean bEmptyIsNull) {
        return this.getParameterNames(key, bTrim, bEmptyIsNull, new String[0]);
    }

    /**
     * getParameterNames
     * @param key
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValues
     * @return
     */
    default String[] getParameterNames(String key, boolean bTrim, boolean bEmptyIsNull, String[] defaultValues) {
        String[] asParameterValues = defaultValues;

        if (StringUtils.isNoneEmpty( key )) {
            String sParameterName = this.getParameterName( key );

            asParameterValues = this.getRequest().getParameterValues( sParameterName );

            asParameterValues = TypeMapperUtils.getDefaults().getStringMapper().map(
                    asParameterValues, bTrim, bEmptyIsNull, defaultValues );
        }
        return asParameterValues;
    }

}
