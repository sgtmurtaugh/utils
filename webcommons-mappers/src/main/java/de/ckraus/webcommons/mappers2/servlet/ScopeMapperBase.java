package de.ckraus.webcommons.mappers2.servlet;

import de.ckraus.commons.mappers2.TypeMapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

@SuppressWarnings("javadoc")
public abstract class ScopeMapperBase<S, T> implements ScopeMapper<S, T> {

    @Getter(AccessLevel.NONE)
    private final Class<T> clazzType;

    /**
     * Constructor
     *
     * @param clazzType
     */
    protected ScopeMapperBase(@NonNull Class<T> clazzType) {
        super();
        this.clazzType = clazzType;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    /**
     * @return
     */
    public Class<T> forType() {
        return this.clazzType;
    }

    /**
     * @return
     */
    public List<String> getAttributePairList() {
        List<String> lstAttributePairs = null;

        Enumeration<String> enumAttrNames = this.getAttributeNames();
        if (null != enumAttrNames) {
            while (enumAttrNames.hasMoreElements()) {
                String sAttrName = enumAttrNames.nextElement();

                if (StringUtils.isNotEmpty(sAttrName)) {
                    Object oAttrValue = this.getAttribute(sAttrName);

                    if (null == lstAttributePairs) {
                        lstAttributePairs = new ArrayList<>();
                    }

                    lstAttributePairs.add(StringUtils.join(sAttrName, " : ", oAttrValue));
                }
            }
        }
        return lstAttributePairs;
    }

    /**
     * @param attributeName
     *
     * @return
     */
    public boolean hasAttribute(@NonNull String attributeName) {
        return (null != this.getAttribute(attributeName));
    }

    /**
     * @param attributeName
     * @param expectedValue
     *
     * @return
     */
    public boolean hasAttributeValue(@NonNull String attributeName, Object expectedValue) {
        if (this.hasAttribute(attributeName)) {
            return new EqualsBuilder().append(this.getAttribute(attributeName), expectedValue).isEquals();
        }
        return false;
    }

    /**
     * @param attributeName
     *
     * @return
     */
    public T mapAttribute(@NonNull String attributeName) {
        return this.mapValue(this.getAttribute(attributeName));
    }

    /**
     * @param attributeName
     * @param defaultValue
     *
     * @return
     */
    public T mapAttribute(@NonNull String attributeName, T defaultValue) {
        return this.mapValue(this.getAttribute(attributeName), defaultValue);
    }

    /**
     * @param attributeName
     *
     * @return
     */
    public boolean hasTypedAttribute(@NonNull String attributeName) {
        Object value = this.getAttribute(attributeName);

        if (null != value) {
            T typedValue = this.mapValue(value, null);
            return (null != typedValue);
        }
        return false;
    }

    /**
     * @param attributeName
     * @param expectedValue
     *
     * @return
     */
    public boolean hasTypedAttributeValue(@NonNull String attributeName, T expectedValue) {
        T typedValue = this.mapAttribute(attributeName, null);

        return new EqualsBuilder().append(typedValue, expectedValue).isEquals();
    }

    /**
     * @param value
     *
     * @return
     */
    protected T mapValue(Object value) {
        return this.mapValue(value, this.getMapper().getDefaultValue());
    }

    /**
     * @param value
     * @param defaultValue
     *
     * @return
     */
    protected abstract T mapValue(Object value, T defaultValue);

    /**
     * @return
     */
    protected abstract TypeMapper<T> getMapper();

    /**
     * @param array
     *
     * @return
     */
    public <E> List<E> toList(E[] array) {
        List<E> lst = null;

        if (ArrayUtils.isNotEmpty(array)) {
            lst = Arrays.asList(array);
        }
        return lst;
    }

}
