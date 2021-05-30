package de.ckraus.commons.beans.executor;

import de.ckraus.commons.beans.ResetableBean;

public interface Executor<O> extends ResetableBean {

    /**
     * Getter for the Exception Exception.
     *
     * @return
     */
    Exception getExecutionException();

    /**
     * Setter for the Exception Exception.
     *
     * @return
     */
    void setExecutionException(Exception exception);

    /**
     * Getter for the output bean.
     *
     * @return
     */
    O getOutputBean();

    /**
     * Setter for the output Bean
     *
     * @param outputBean
     */
    void setOutputBean(O outputBean);

    /**
     * Getter for the output bean class.
     *
     * @return
     */
    Class<O> getOutputClass();

    /**
     * Getter for execution flag
     *
     * @return
     */
    boolean isExecuted();

    /**
     * Setter for execution flag
     *
     * @param bExecuted - executed flag
     */
    void setExecuted(boolean bExecuted);

    /**
     * Getter for successful execution flag
     *
     * @return
     */
    boolean isExecutedSuccessful();

    /**
     * Setter for successful execution flag
     *
     * @param bExecutedSuccessful - sflag
     */
    void setExecutedSuccessful(boolean bExecutedSuccessful);

    /**
     * Initiates the execution of this bean with preparation.
     *
     * @return
     */
    default Executor<O> execute() {
        if (!this.isExecuted()) {
            // do prepare
            this.prepare();

            // is executable
            if (this.isExecutable()) {
                try {
                    // perform executor
                    this.setOutputBean(this.perform());
                }
                catch (Exception e) {
                    //  handle exception
                    this.handleException(e);
                }
                finally {
                    // set executed flag
                    this.setExecuted(true);

                    // evaluate result
                    this.verify();
                }
            }
        }
        return this;
    }


    /**
     * Executor specific perfom method.
     */
    O perform();

    @Override
    default void reset() {
        ResetableBean.super.reset();

        this.setExecuted(false);
        this.setExecutionException(null);
        this.setExecutedSuccessful(false);
    }

    /**
     * Can be used to check all prerequirements for execution. Only if {@code true} is returned, the execution is
     * triggered.
     *
     * @return boolean flag which indicates whether all pre requirements are fulfilled or not
     */
    default boolean isExecutable() {
        return (this.isInitialized() && !this.isExecuted());
    }

    /**
     * This method can be used to react on an error during the execution process.
     *
     * @param e - occured exception
     */
    default void handleException(Exception e) {
        if (null != e) {
            this.setExecutionException(e);
            this.setExecutedSuccessful(false);
        }
    }

    /**
     * Hook method to ensure objects pre requirements.
     */
    default void prepare() {
        // nothing to do
    }

    /**
     * Hook method to evaluate the execution result.
     */
    default void verify() {
        if (this.isExecuted()) {
            boolean bSuccess = false;

            // void output
            if (null == this.getOutputBean() && Void.class.isAssignableFrom(this.getOutputClass())) {

                bSuccess = true;
            }
            else
                // available output
                if (null != this.getOutputBean() && !(Void.class.isAssignableFrom(this.getOutputClass()))) {

                    bSuccess = true;
                }

            this.setExecutedSuccessful(bSuccess);
        }
    }


    /**
     * Checks the return value of {@link #getExecutionException()}. If not null, a {@code true} is returned.
     *
     * @return
     */
    default boolean isExceptionOccurred() {
        return (this.isExecuted() && null != this.getExecutionException());
    }

}
