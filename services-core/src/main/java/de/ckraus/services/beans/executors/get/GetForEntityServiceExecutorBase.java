package de.ckraus.services.beans.executors.get;

import org.springframework.http.ResponseEntity;

/**
 *
 * @param <O>
 */
public abstract class GetForEntityServiceExecutorBase<O> extends ServiceExecutorBase<Void, ResponseEntity<O>>
        implements GetForEntityServiceExecutor<O> {

}
