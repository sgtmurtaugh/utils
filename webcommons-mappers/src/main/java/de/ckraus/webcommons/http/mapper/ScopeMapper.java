package de.ckraus.webcommons.http.mapper;

public interface ScopeMapper {

    boolean hasAttribute(String key);
    boolean hasAttributeWithValue(Object value);

}
