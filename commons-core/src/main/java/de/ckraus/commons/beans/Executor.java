package de.ckraus.commons.beans;

public interface Executor extends Bean {

    /**
     * Initiates the execution of this bean.
     * @return
     */
    Executor execute();

    /**
     * Can be used to reset all bean values. Initiates a reinitialization.
     */
    default void reset() {
        initialize( true );
    }

    /**
     * Getter for execution flag
     * @return
     */
    boolean isExecuted();

    /**
     * Getter for successful execution flag
     * @return
     */
    boolean isExecutedSuccessful();

    /**
     * Checks the return value of {@link #getException()}. If not null, a {@code true} is returned.
     * @return
     */
    default boolean isExceptionOccurred() {
        return ( this.isExecuted() && null != this.getException() );
    }

    /**
     * Getter for the Exception prop.
     * @return
     */
    Exception getException();

}
