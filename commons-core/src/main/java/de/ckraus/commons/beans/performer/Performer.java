package de.ckraus.commons.beans.performer;

import de.ckraus.commons.beans.ResetableBean;

public interface Performer extends ResetableBean {

    /**
     * Initiates the execution of this bean with preparation.
     *
     * @return
     */
    Performer perform();

    /**
     * Getter for perform flag
     *
     * @return
     */
    boolean isPerformed();

}
