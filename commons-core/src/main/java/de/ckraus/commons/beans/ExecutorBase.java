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

}
