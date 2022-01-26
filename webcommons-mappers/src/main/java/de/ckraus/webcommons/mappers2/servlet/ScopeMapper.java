package de.ckraus.webcommons.mappers2.servlet;

import lombok.NonNull;
import org.springframework.beans.factory.InitializingBean;

import java.util.Enumeration;
import java.util.List;

@SuppressWarnings("javadoc")
public interface ScopeMapper<S, T> extends InitializingBean {

    /**
     * @return
     */
    S getScope();

    /**
     * forType
     *
     * @return
     */
    Class<T> forType();

    /**
     * @param attributeName
     *
     * @return
     */
    Object getAttribute(@NonNull String attributeName);

    /**
     * @param attributeName
     * @param defaultValue
     *
     * @return
     */
    Object getAttribute(@NonNull String attributeName, Object defaultValue);

    /**
     * @param attributeName
     */
    void removeAttribute(@NonNull String attributeName);

    /**
     * @param attributeName
     * @param attributeValue
     *
     * @return
     */
    void setAttribute(@NonNull String attributeName, Object attributeValue);

    /**
     * @param attributeName
     *
     * @return
     */
    boolean hasAttribute(@NonNull String attributeName);

    /**
     * @param attributeName
     * @param expectedValue
     *
     * @return
     */
    boolean hasAttributeValue(@NonNull String attributeName, Object expectedValue);

    /**
     * @param attributeName
     *
     * @return
     */
    T mapAttribute(@NonNull String attributeName);

    /**
     * @param attributeName
     * @param defaultValue
     *
     * @return
     */
    T mapAttribute(@NonNull String attributeName, T defaultValue);

    /**
     * @param attributeName
     *
     * @return
     */
    boolean hasTypedAttribute(@NonNull String attributeName);

    /**
     * @param attributeName
     * @param expectedValue
     *
     * @return
     */
    boolean hasTypedAttributeValue(@NonNull String attributeName, T expectedValue);

    /**
     * Liefert alle Attributnamen
     *
     * @return
     */
    Enumeration<String> getAttributeNames();

    /**
     * @return
     */
    List<String> getAttributePairList();

    /**
     * Wandelt den Array in eine Liste des Typs
     *
     * @param array
     * @param <E>
     *
     * @return
     */
    <E> List<E> toList(E[] array);

}
