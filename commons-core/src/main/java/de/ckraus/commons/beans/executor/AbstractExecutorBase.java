package de.ckraus.commons.beans.executor;

import de.ckraus.commons.beans.AbstractBeanBase;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * TODO
 * @param <O> - return type of this executor
 */
@Getter
@Setter( AccessLevel.PROTECTED )
public abstract class AbstractExecutorBase<O> extends AbstractBeanBase implements Executor<O> {

    private boolean executed;
    private boolean executedSuccessful;

    private Exception exception;

    private O outputBean;
    private Class<O> outputClass;

}
