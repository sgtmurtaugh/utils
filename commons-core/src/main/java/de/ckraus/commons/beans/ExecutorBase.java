package de.ckraus.commons.beans;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
public abstract class ExecutorBase extends BeanBase implements Executor {

    private boolean executed;
    private boolean executedSuccessful;
    private Exception exception;

    @Override
    public ExecutorBase execute() {
        if ( !this.isExecuted() ) {
            // do prepare
            this.prepare();

            // is executable
            if ( this.isExecutable() ) {
                try {
                    // set executed flag
                    this.setExecuted( true );

                    // perform executor
                    this.perform();
                }
                catch ( Exception e ) {
                    //  handle exception
                    this.handleException( e );
                }
            }

            // evaluate result
            this.verify();
        }
        return this;
    }

    /**
     * Executor specific perfom method.
     */
    protected abstract ExecutorBase perform();

    @Override
    public void reset() {
        super.reset();

        this.setExecuted( false );
        this.setException( null );
        this.setExecutedSuccessful( false );
    }

    /**
     * Can be used to check all prerequirements for execution. Only if {@code true} is returned, the execution is
     * triggered.
     * @return
     */
    protected boolean isExecutable() {
        return ( this.isInitialized() && !this.isExecuted() );
    }

    /**
     * This method can be used to react on an error during the execution process.
     * @param e
     */
    protected void handleException( Exception e ) {
        if ( null != e ) {
            this.setException( e );
            this.setExecutedSuccessful( false );
        }
    }

    /**
     * Hook method to ensure objects pre requirements.
     */
    protected void prepare() {
        // nothing to do
    }

    /**
     * Hook method to evaluate the execution result.
     */
    protected void verify() {
        // nothing to do
    }

}
