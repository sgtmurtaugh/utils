package de.ckraus.commons.beans;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * TODO
 * @param <O> - return type of this executor
 */
@Getter
@Setter( AccessLevel.PROTECTED )
public abstract class ExecutorBase<O> extends BeanBase implements Executor<O> {

    private boolean executed;
    private boolean executedSuccessful;

    private Exception exception;

    private O outputBean;
    private Class<O> outputClass;

    @Override
    public ExecutorBase<O> execute() {
        if ( !this.isExecuted() ) {
            // do prepare
            this.prepare();

            // is executable
            if ( this.isExecutable() ) {
                try {
                    // perform executor
                    this.setOutputBean( this.perform() );
                }
                catch ( Exception e ) {
                    //  handle exception
                    this.handleException( e );
                }
                finally {
                    // set executed flag
                    this.setExecuted( true );

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
    protected abstract O perform();

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
     * @return boolean flag which indicates whether all pre requirements are fulfilled or not
     */
    protected boolean isExecutable() {
        return ( this.isInitialized() && !this.isExecuted() );
    }

    /**
     * This method can be used to react on an error during the execution process.
     * @param e - occured exception
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
        if ( this.isExecuted() ) {
            boolean bSuccess = false;

            // void output
            if ( null == this.getOutputBean()
                    && Void.class.isAssignableFrom( this.getOutputClass() ) ) {

                bSuccess = true;
            }
            else
            // available output
            if ( null != this.getOutputBean()
                    && ! ( Void.class.isAssignableFrom( this.getOutputClass() ) ) ) {

                bSuccess = true;
            }

            this.setExecutedSuccessful( bSuccess );
        }
    }

}
