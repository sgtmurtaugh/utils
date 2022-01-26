package de.ckraus.commons.mappers2;

import org.owasp.validator.html.Policy;

@SuppressWarnings({ "javadoc" })
public interface OWASPAntiSamyHtmlMapper extends StringMapper {

    /**
     * Liefert den default CacheKey zur&uuml;ck.
     *
     * @return
     */
    String getDefaultAntiSamyCacheKey();

    /**
     * Liefert den default PolicyFile zur&uuml;ck.
     *
     * @return
     */
    String getDefaultAntiSamyPolicyFile();

    /**
     * Delegates to {@link #mapWithPolicy(String, String, String)} with usage of {@link #getDefaultValue()}
     *
     * @param policyFile - AntiSamy policy file
     * @param s - string to map
     *
     * @return mapped string
     */
    String mapWithPolicy(String policyFile, String s);

    /**
     * Delegates to {@link #mapWithPolicy(String, String, boolean, boolean, String)} with usage of {@link
     * #isTrimString()} and {@link #isEmptyStringNull()}
     *
     * @param policyFile - AntiSamy policy file
     * @param s - string to map
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithPolicy(String policyFile, String s, String defaultValue);

    /**
     * mapWithPolicy
     *
     * @param policyFile - AntiSamy policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     *
     * @return mapped string
     */
    String mapWithPolicy(String policyFile, String s, boolean bTrim, boolean bEmptyIsNull);

    /**
     * mapWithPolicy
     *
     * @param policyFile - AntiSamy policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithPolicy(String policyFile, String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue);

    /**
     * Delegates to {@link #mapWithPolicy(Policy, String, String)} with usage of {@link #getDefaultValue()}
     *
     * @param policy - AntiSamy policy file
     * @param s - string to map
     *
     * @return mapped string
     */
    String mapWithPolicy(Policy policy, String s);

    /**
     * Delegates to {@link #mapWithPolicy(Policy, String, boolean, boolean, String)} with usage of {@link
     * #isTrimString()} and {@link #isEmptyStringNull()}
     *
     * @param policy - AntiSamy policy file
     * @param s - string to map
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithPolicy(Policy policy, String s, String defaultValue);

    /**
     * mapWithPolicy
     *
     * @param policy - AntiSamy policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     *
     * @return mapped string
     */
    String mapWithPolicy(Policy policy, String s, boolean bTrim, boolean bEmptyIsNull);

    /**
     * mapWithPolicy
     *
     * @param policy - AntiSamy policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithPolicy(Policy policy, String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue);

    /**
     * Delegates to {@link #mapWithCachedAntiSamy(String, String)} with usage of {@link #getDefaultAntiSamyCacheKey()}
     *
     * @param s - string to map
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamy(String s);

    /**
     * Delegates to {@link #mapWithCachedAntiSamy(String, String, String)} with usage of {@link #getDefaultValue()}
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param s - string to map
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamy(String cacheKey, String s);

    /**
     * Delegates to {@link #mapWithCachedAntiSamy(String, String, boolean, boolean, String)} with usage of {@link
     * #isTrimString()} and {@link #isEmptyStringNull()}
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param s - string to map
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamy(String cacheKey, String s, String defaultValue);

    /**
     * mapWithCachedAntiSamy
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamy(String cacheKey, String s, boolean bTrim, boolean bEmptyIsNull);

    /**
     * mapWithCachedAntiSamy
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamy(String cacheKey, String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue);

    /**
     * Delegates to {@link #mapWithCachedAntiSamyAndPolicy(String, Policy policy, String, String)} with usage of {@link
     * #getDefaultValue()}
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policy - Policy file
     * @param s - string to map
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s);

    /**
     * Delegates to {@link #mapWithCachedAntiSamyAndPolicy(String, Policy policy, String, boolean, boolean, String)}
     * with usage of {@link #isTrimString()} and {@link #isEmptyStringNull()}
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policy - Policy file
     * @param s - string to map
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s, String defaultValue);

    /**
     * mapWithCachedAntiSamyAndPolicy
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policy - Policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s, boolean bTrim,
                                          boolean bEmptyIsNull);

    /**
     * mapWithCachedAntiSamyAndPolicy
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policy - Policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s, boolean bTrim, boolean bEmptyIsNull,
                                          String defaultValue);


    /**
     * Delegates to {@link #mapWithCachedAntiSamyAndPolicy(String, String, String, String)} with usage of {@link
     * #getDefaultValue()}
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policyFile - Policy file
     * @param s - string to map
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s);

    /**
     * Delegates to {@link #mapWithCachedAntiSamyAndPolicy(String, String, String, boolean, boolean, String)} with usage
     * of {@link #isTrimString()} and {@link #isEmptyStringNull()}
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policyFile - Policy file
     * @param s - string to map
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s, String defaultValue);

    /**
     * mapWithCachedAntiSamyAndPolicy
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policyFile - Policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s, boolean bTrim,
                                          boolean bEmptyIsNull);

    /**
     * mapWithCachedAntiSamyAndPolicy
     *
     * @param cacheKey - AntiSamy Cache Key
     * @param policyFile - Policy file
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s, boolean bTrim,
                                          boolean bEmptyIsNull, String defaultValue);

}
