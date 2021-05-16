package de.ckraus.services.beans.executors.exchange;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

/**
 * Extends {@link ServiceExecutor} with Parameter {@code <O>}
 * @param <I> Request Entity Bean
 * @param <O> Response Entity Bean
 */
public interface ExchangeServiceExecutor<I, O> extends ServiceExecutor<I, O> {

    /**
     *
     * @return
     */
    HttpMethod getHttpMethod();

    /**
     *
     * @return
     */
    HttpStatus getHttpStatus();

}
