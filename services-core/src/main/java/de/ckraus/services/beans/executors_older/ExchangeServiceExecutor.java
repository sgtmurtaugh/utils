package de.ckraus.services.beans.executors_older;

/**
 * @param <I> RequestEntity Bean
 * @param <O> ResponseEntity Type
 */
public interface ExchangeServiceExecutor<I, O> extends RespondForEntityServiceExecutor<O> {

    /**
     * getRequestEntityBean
     *
     * @return
     */
    I getRequestEntityBean();

}
