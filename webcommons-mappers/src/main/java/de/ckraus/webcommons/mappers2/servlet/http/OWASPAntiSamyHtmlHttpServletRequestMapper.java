package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.commons.mappers2.OWASPAntiSamyHtmlMapper;
import de.ckraus.commons.mappers2.TypeMapperUtils;
import lombok.NonNull;
import org.owasp.validator.html.Policy;

public class OWASPAntiSamyHtmlHttpServletRequestMapper extends StringHttpServletRequestMapper {

    /**
     * Constructor
     */
    OWASPAntiSamyHtmlHttpServletRequestMapper() {
        super();
    }

    /**
     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
     *
     * @return
     */
    public static OWASPAntiSamyHtmlHttpServletRequestMapper getInstance() {
        return HttpServletRequestTypeMapperUtils.getOWASPAntiSamyHtmlMapper();
    }

    @Override
    protected OWASPAntiSamyHtmlMapper getMapper() {
        return TypeMapperUtils.getOWASPAntiSamyHtmlMapper();
    }

    public String mapAttributeWithPolicy(@NonNull String sPolicyFile, @NonNull String attributeName) {
        return this.getMapper().mapWithPolicy(sPolicyFile, this.mapValue(this.getAttribute(attributeName)));
    }

    public String mapAttributeWithPolicy(@NonNull String sPolicyFile, @NonNull String attributeName,
                                         String defaultValue) {
        return this.getMapper()
                   .mapWithPolicy(sPolicyFile, this.mapValue(this.getAttribute(attributeName)), defaultValue);
    }

    public String mapParameterWithPolicy(@NonNull String sPolicyFile, @NonNull String parameterName) {
        return this.getMapper().mapWithPolicy(sPolicyFile, this.getParameter(parameterName));
    }

    public String mapParameterWithPolicy(@NonNull String sPolicyFile, @NonNull String parameterName,
                                         String defaultValue) {
        return this.getMapper().mapWithPolicy(sPolicyFile, this.getParameter(parameterName), defaultValue);
    }

    public String mapParameterWithPolicy(@NonNull String sPolicyFile, @NonNull String parameterName, boolean bTrim,
                                         boolean bEmptyIsNull) {
        return this.getMapper().mapWithPolicy(sPolicyFile, this.getParameter(parameterName), bTrim, bEmptyIsNull);
    }

    public String mapParameterWithPolicy(@NonNull String sPolicyFile, @NonNull String parameterName, boolean bTrim,
                                         boolean bEmptyIsNull, String defaultValue) {
        return this.getMapper()
                   .mapWithPolicy(sPolicyFile, this.getParameter(parameterName), bTrim, bEmptyIsNull, defaultValue);
    }

    public String mapAttributeWithPolicy(@NonNull Policy policy, @NonNull String attributeName) {
        return this.getMapper().mapWithPolicy(policy, this.mapValue(this.getAttribute(attributeName)));
    }

    public String mapAttributeWithPolicy(@NonNull Policy policy, @NonNull String attributeName, String defaultValue) {
        return this.getMapper().mapWithPolicy(policy, this.mapValue(this.getAttribute(attributeName)), defaultValue);
    }

    public String mapParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName) {
        return this.getMapper().mapWithPolicy(policy, this.getParameter(parameterName));
    }

    public String mapParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName, String defaultValue) {
        return this.getMapper().mapWithPolicy(policy, this.getParameter(parameterName), defaultValue);
    }

    public String mapParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName, boolean bTrim,
                                         boolean bEmptyIsNull) {
        return this.getMapper().mapWithPolicy(policy, this.getParameter(parameterName), bTrim, bEmptyIsNull);
    }

    public String mapParameterWithPolicy(@NonNull Policy policy, @NonNull String parameterName, boolean bTrim,
                                         boolean bEmptyIsNull, String defaultValue) {
        return this.getMapper()
                   .mapWithPolicy(policy, this.getParameter(parameterName), bTrim, bEmptyIsNull, defaultValue);
    }

    public String mapAttributeWithCachedAntiSamy(@NonNull String attributeName) {
        return this.getMapper().mapWithCachedAntiSamy(this.mapValue(this.getAttribute(attributeName)));
    }

    public String mapAttributeWithCachedAntiSamy(@NonNull String sCacheKey, @NonNull String attributeName) {
        return this.getMapper().mapWithCachedAntiSamy(sCacheKey, this.mapValue(this.getAttribute(attributeName)));
    }

    public String mapAttributeWithCachedAntiSamy(@NonNull String sCacheKey, @NonNull String attributeName,
                                                 String defaultValue) {
        return this.getMapper()
                   .mapWithCachedAntiSamy(sCacheKey, this.mapValue(this.getAttribute(attributeName)), defaultValue);
    }

    public String mapParameterWithCachedAntiSamy(@NonNull String parameterName) {
        return this.getMapper().mapWithCachedAntiSamy(this.getParameter(parameterName));
    }

    public String mapParameterWithCachedAntiSamy(@NonNull String sCacheKey, @NonNull String parameterName) {
        return this.getMapper().mapWithCachedAntiSamy(sCacheKey, this.getParameter(parameterName));
    }

    public String mapParameterWithCachedAntiSamy(@NonNull String sCacheKey, @NonNull String parameterName,
                                                 String defaultValue) {
        return this.getMapper().mapWithCachedAntiSamy(sCacheKey, this.getParameter(parameterName), defaultValue);
    }

    public String mapParameterWithCachedAntiSamy(@NonNull String sCacheKey, @NonNull String parameterName,
                                                 boolean bTrim, boolean bEmptyIsNull) {
        return this.getMapper().mapWithCachedAntiSamy(sCacheKey, this.getParameter(parameterName), bTrim, bEmptyIsNull);
    }

    public String mapParameterWithCachedAntiSamy(@NonNull String sCacheKey, @NonNull String parameterName,
                                                 boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        return this.getMapper().mapWithCachedAntiSamy(sCacheKey, this.getParameter(parameterName), bTrim, bEmptyIsNull,
                defaultValue);
    }

    public String mapAttributeWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull Policy policy,
                                                          @NonNull String attributeName) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, policy, this.mapValue(this.getAttribute(attributeName)));
    }

    public String mapAttributeWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull Policy policy,
                                                          @NonNull String attributeName, String defaultValue) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, policy, this.mapValue(this.getAttribute(attributeName)),
                           defaultValue);
    }

    public String mapAttributeWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull String sPolicyFile,
                                                          @NonNull String attributeName) {
        return this.getMapper().mapWithCachedAntiSamyAndPolicy(sCacheKey, sPolicyFile,
                this.mapValue(this.getAttribute(attributeName)));
    }

    public String mapAttributeWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull String sPolicyFile,
                                                          @NonNull String attributeName, String defaultValue) {
        return this.getMapper().mapWithCachedAntiSamyAndPolicy(sCacheKey, sPolicyFile,
                this.mapValue(this.getAttribute(attributeName)), defaultValue);
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull Policy policy,
                                                          @NonNull String parameterName) {
        return this.getMapper().mapWithCachedAntiSamyAndPolicy(sCacheKey, policy, this.getParameter(parameterName));
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull Policy policy,
                                                          @NonNull String parameterName, String defaultValue) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, policy, this.getParameter(parameterName), defaultValue);
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull Policy policy,
                                                          @NonNull String parameterName, boolean bTrim,
                                                          boolean bEmptyIsNull) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, policy, this.getParameter(parameterName), bTrim,
                           bEmptyIsNull);
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull Policy policy,
                                                          @NonNull String parameterName, boolean bTrim,
                                                          boolean bEmptyIsNull, String defaultValue) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, policy, this.getParameter(parameterName), bTrim,
                           bEmptyIsNull, defaultValue);
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull String sPolicyFile,
                                                          @NonNull String parameterName) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, sPolicyFile, this.getParameter(parameterName));
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull String sPolicyFile,
                                                          @NonNull String parameterName, String defaultValue) {
        return this.getMapper().mapWithCachedAntiSamyAndPolicy(sCacheKey, sPolicyFile, this.getParameter(parameterName),
                defaultValue);
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull String sPolicyFile,
                                                          @NonNull String parameterName, boolean bTrim,
                                                          boolean bEmptyIsNull) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, sPolicyFile, this.getParameter(parameterName), bTrim,
                           bEmptyIsNull);
    }

    public String mapParameterWithCachedAntiSamyAndPolicy(@NonNull String sCacheKey, @NonNull String sPolicyFile,
                                                          @NonNull String parameterName, boolean bTrim,
                                                          boolean bEmptyIsNull, String defaultValue) {
        return this.getMapper()
                   .mapWithCachedAntiSamyAndPolicy(sCacheKey, sPolicyFile, this.getParameter(parameterName), bTrim,
                           bEmptyIsNull, defaultValue);
    }

}
