package de.ckraus.services.beans.executors.execute;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;

/**
 * Extends {@link ServiceExecutor}
 *
 * @param <O> Response Entity Bean
 */
public interface ExecuteServiceExecutor<O> extends ServiceExecutor<Void, O> {

    /**
     * @return
     */
    HttpMethod getHttpMethod();

    /**
     * @return
     */
    RequestCallback getRequestCallback();

    /**
     * @return
     */
    ResponseExtractor<O> getResponseExtractor();

}
