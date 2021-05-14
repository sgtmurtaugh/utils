package de.ckraus.commons.beans;

public interface Performer extends Bean {

    /**
     * Initiates the execution of this bean with preparation.
     * @return
     */
    Performer perform();

    /**
     * Can be used to reset all bean values. Initiates a reinitialization.
     */
    default void reset() {
        initialize( true );
    }

    /**
     * Getter for perform flag
     * @return
     */
    boolean isPerformed();

}
