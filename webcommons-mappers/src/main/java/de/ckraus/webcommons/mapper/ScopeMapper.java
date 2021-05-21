package de.ckraus.webcommons.mapper;

public interface ScopeMapper<E> {

    E getScope();
    void setScope( ScopeMapper scopeMapper );

    boolean hasAttribute(String key);
    boolean hasAttributeWithValue(Object value);

}
