package de.ckraus.commons.beans;

public interface Performer extends ResetableBean {

    /**
     * Initiates the execution of this bean with preparation.
     * @return
     */
    Performer perform();

    /**
     * Getter for perform flag
     * @return
     */
    boolean isPerformed();

}
