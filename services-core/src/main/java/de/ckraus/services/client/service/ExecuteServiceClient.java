package de.ckraus.services.client.service;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;

/**
 * Extends {@link ServiceClient}
 * @param <O> Response Entity Bean
 */
public interface ExecuteServiceClient<O> extends ServiceClient<Void, O> {

    /**
     *
     * @return
     */
    HttpMethod getHttpMethod();

    /**
     *
     * @return
     */
    RequestCallback getRequestCallback();

    /**
     *
     * @return
     */
    ResponseExtractor<O> getResponseExtractor();

}
