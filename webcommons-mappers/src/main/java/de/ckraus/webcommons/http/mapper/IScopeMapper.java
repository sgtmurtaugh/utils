package de.ckraus.webcommons.http.mapper;

public interface IScopeMapper {

    boolean hasAttribute(String key);
    boolean hasAttributeWithValue(Object value);

}
