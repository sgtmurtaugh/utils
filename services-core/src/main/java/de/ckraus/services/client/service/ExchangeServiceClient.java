package de.ckraus.services.client.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

/**
 * Extends {@link ServiceClient} with Parameter {@code <O>}
 * @param <I> Request Entity Bean
 * @param <O> Response Entity Bean
 */
public interface ExchangeServiceClient<I, O> extends ServiceClient<I, O> {

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
