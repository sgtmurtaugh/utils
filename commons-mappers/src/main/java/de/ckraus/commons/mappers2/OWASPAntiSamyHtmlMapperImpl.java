package de.ckraus.commons.mappers2;

import de.materna.cms.customers.kbscore.cae.utils.OWASPAntiSamyUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.owasp.validator.html.CleanResults;
import org.owasp.validator.html.Policy;
import org.springframework.stereotype.Component;

@Component("stringMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class OWASPAntiSamyHtmlMapperImpl extends StringMapperImpl implements OWASPAntiSamyHtmlMapper {

    public static final String DEFAULT_ANTISAMY_CACHE_KEY = "defaultAntiSamy";
    public static final String DEFAULT_ANTISAMY_POLICY_FILE = OWASPAntiSamyUtils.ANTI_SAMY_POLICY_FILENAME__DEFAULT;

    /**
     * Constructor
     */
    OWASPAntiSamyHtmlMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    OWASPAntiSamyHtmlMapperImpl(String defaultValue) {
        super(defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static OWASPAntiSamyHtmlMapper getInstance() {
        return TypeMapperUtils.getOWASPAntiSamyHtmlMapper();
    }

    @Override
    public String getDefaultAntiSamyCacheKey() {
        return DEFAULT_ANTISAMY_CACHE_KEY;
    }

    @Override
    public String getDefaultAntiSamyPolicyFile() {
        return DEFAULT_ANTISAMY_POLICY_FILE;
    }

    @Override
    public String map(String s) {
        return this.mapWithPolicy(this.getDefaultAntiSamyPolicyFile(), s);
    }

    @Override
    public String map(String s, String defaultValue) {
        return this.mapWithPolicy(this.getDefaultAntiSamyPolicyFile(), s, defaultValue);
    }

    @Override
    public String map(String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.mapWithPolicy(this.getDefaultAntiSamyPolicyFile(), s, bTrim, bEmptyIsNull);
    }

    @Override
    public String map(String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.mapWithPolicy(this.getDefaultAntiSamyPolicyFile(), s, bTrim, bEmptyIsNull, defaultValue);
    }

    @Override
    public String mapWithPolicy(String policyFile, String s) {
        return this.getHtml(this.scanWithPolicy(policyFile, super.map(s)));
    }

    @Override
    public String mapWithPolicy(String policyFile, String s, String defaultValue) {
        return this.getHtml(this.scanWithPolicy(policyFile, super.map(s, defaultValue)));
    }

    @Override
    public String mapWithPolicy(String policyFile, String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.getHtml(this.scanWithPolicy(policyFile, super.map(s, bTrim, bEmptyIsNull)));
    }

    @Override
    public String mapWithPolicy(String policyFile, String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.getHtml(this.scanWithPolicy(policyFile, super.map(s, bTrim, bEmptyIsNull, defaultValue)));
    }

    @Override
    public String mapWithPolicy(Policy policy, String s) {
        return this.getHtml(this.scanWithPolicy(policy, super.map(s)));
    }

    @Override
    public String mapWithPolicy(Policy policy, String s, String defaultValue) {
        return this.getHtml(this.scanWithPolicy(policy, super.map(s, defaultValue)));
    }

    @Override
    public String mapWithPolicy(Policy policy, String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.getHtml(this.scanWithPolicy(policy, super.map(s, bTrim, bEmptyIsNull)));
    }


    @Override
    public String mapWithPolicy(Policy policy, String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.getHtml(this.scanWithPolicy(policy, super.map(s, bTrim, bEmptyIsNull, defaultValue)));
    }

    @Override
    public String mapWithCachedAntiSamy(String s) {
        return this.getHtml(this.scanWithCachedAntiSamy(this.getDefaultAntiSamyCacheKey(), super.map(s)));
    }

    @Override
    public String mapWithCachedAntiSamy(String cacheKey, String s) {
        return this.getHtml(this.scanWithCachedAntiSamy(cacheKey, super.map(s)));
    }

    @Override
    public String mapWithCachedAntiSamy(String cacheKey, String s, String defaultValue) {
        return this.getHtml(this.scanWithCachedAntiSamy(cacheKey, super.map(s, defaultValue)));
    }

    @Override
    public String mapWithCachedAntiSamy(String cacheKey, String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.getHtml(this.scanWithCachedAntiSamy(cacheKey, super.map(s, bTrim, bEmptyIsNull)));
    }

    @Override
    public String mapWithCachedAntiSamy(String cacheKey, String s, boolean bTrim, boolean bEmptyIsNull,
                                        String defaultValue) {
        return this.getHtml(this.scanWithCachedAntiSamy(cacheKey, super.map(s, bTrim, bEmptyIsNull, defaultValue)));
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s) {
        return this.mapWithCachedAntiSamyAndPolicy(cacheKey, policy, s, this.getDefaultValue());
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s, String defaultValue) {
        return this.mapWithCachedAntiSamyAndPolicy(cacheKey, policy, s, this.isTrimString(), this.isEmptyStringNull(),
                defaultValue);
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s, boolean bTrim,
                                                 boolean bEmptyIsNull) {
        return this.mapWithCachedAntiSamyAndPolicy(cacheKey, policy, s, bTrim, bEmptyIsNull, this.getDefaultValue());
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, Policy policy, String s, boolean bTrim,
                                                 boolean bEmptyIsNull, String defaultValue) {
        return this.getHtml(this.scanWithCachedAntiSamyAndPolicy(cacheKey, policy,
                super.map(s, bTrim, bEmptyIsNull, defaultValue)));
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s) {
        return this.mapWithCachedAntiSamyAndPolicy(cacheKey, policyFile, s, this.getDefaultValue());
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s, String defaultValue) {
        return this.mapWithCachedAntiSamyAndPolicy(cacheKey, policyFile, s, this.isTrimString(),
                this.isEmptyStringNull(), defaultValue);
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s, boolean bTrim,
                                                 boolean bEmptyIsNull) {
        return this.mapWithCachedAntiSamyAndPolicy(cacheKey, policyFile, s, bTrim, bEmptyIsNull,
                this.getDefaultValue());
    }

    @Override
    public String mapWithCachedAntiSamyAndPolicy(String cacheKey, String policyFile, String s, boolean bTrim,
                                                 boolean bEmptyIsNull, String defaultValue) {
        return this.getHtml(this.scanWithCachedAntiSamyAndPolicy(cacheKey, policyFile,
                super.map(s, bTrim, bEmptyIsNull, defaultValue)));
    }

    /**
     * Wenn CleanResults &uuml;bergeben wurden und diese keine Fehler enthalten, dann wird das HTML zur&uuml; ckgegeben,
     * anderfalls <code>null</code>.
     *
     * @param cleanResults
     *
     * @return
     */
    protected String getHtml(CleanResults cleanResults) {
        // TODO: Das Html nur zurueckgeben, wenn keine Error vorhanden sind?
        if (null != cleanResults && cleanResults.getNumberOfErrors() == 0) {
            return cleanResults.getCleanHTML();
        }
        return null;
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scan(String, String)} unter Verwendung von {@link
     * #getDefaultAntiSamyPolicyFile()}
     *
     * @param s
     *
     * @return
     */
    protected CleanResults scan(String s) {
        return OWASPAntiSamyUtils.getInstance().scan(this.getDefaultAntiSamyPolicyFile(), s);
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scan(String, String)}
     *
     * @param policyFile
     * @param s
     *
     * @return
     */
    protected CleanResults scanWithPolicy(String policyFile, String s) {
        return OWASPAntiSamyUtils.getInstance().scan(policyFile, s);
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scan(Policy, String)}
     *
     * @param policy
     * @param s
     *
     * @return
     */
    protected CleanResults scanWithPolicy(Policy policy, String s) {
        return OWASPAntiSamyUtils.getInstance().scan(policy, s);
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scanWithCachedAntiSamy(String, String, String)} unter Verwendung von
     * {@link #getDefaultAntiSamyCacheKey()} und {@link #getDefaultAntiSamyPolicyFile()}
     *
     * @param s
     *
     * @return
     */
    protected CleanResults scanWithCachedAntiSamy(String s) {
        return OWASPAntiSamyUtils.getInstance().scanWithCachedAntiSamy(this.getDefaultAntiSamyCacheKey(),
                this.getDefaultAntiSamyPolicyFile(), s);
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scanWithCachedAntiSamy(String, String, String)} unter Verwendung von
     * {@link #getDefaultAntiSamyPolicyFile()}
     *
     * @param sAntiSamyCacheKey
     * @param s
     *
     * @return
     */
    protected CleanResults scanWithCachedAntiSamy(String sAntiSamyCacheKey, String s) {
        return OWASPAntiSamyUtils.getInstance()
                                 .scanWithCachedAntiSamy(sAntiSamyCacheKey, this.getDefaultAntiSamyPolicyFile(), s);
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scanWithCachedAntiSamy(String, String, String)}
     *
     * @param sAntiSamyCacheKey
     * @param s
     *
     * @return
     */
    protected CleanResults scanWithCachedAntiSamyAndPolicy(String sAntiSamyCacheKey, String policyFile, String s) {
        return OWASPAntiSamyUtils.getInstance().scanWithCachedAntiSamy(sAntiSamyCacheKey, policyFile, s);
    }

    /**
     * Deligiert an {@link OWASPAntiSamyUtils#scanWithCachedAntiSamy(String, Policy, String)} unter Verwendung von
     * {@link #getDefaultAntiSamyPolicyFile()}
     *
     * @param sAntiSamyCacheKey
     * @param s
     *
     * @return
     */
    protected CleanResults scanWithCachedAntiSamyAndPolicy(String sAntiSamyCacheKey, Policy policy, String s) {
        return OWASPAntiSamyUtils.getInstance().scanWithCachedAntiSamy(sAntiSamyCacheKey, policy, s);
    }

}
