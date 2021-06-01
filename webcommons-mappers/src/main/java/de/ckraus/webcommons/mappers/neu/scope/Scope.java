package de.ckraus.webcommons.mappers.neu.scope;

public interface Scope<E> {

    /**
     *
     * @param e scope
     * @param name
     * @return
     */
    Object getAttribute(E e, String name);

}
