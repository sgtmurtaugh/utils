package de.ckraus.services.client.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;

/**
 *
 * @param <O>
 */
@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class ExecuteServiceClientBase<O> extends ServiceClientBase<Void, O> implements ExecuteServiceClient<O> {

    @Setter(AccessLevel.NONE)
    private final HttpMethod httpMethod;
    private RequestCallback requestCallback;
    private ResponseExtractor<O> responseExtractor;


    /**
     * Constructor
     * @param httpMethod
     */
    public ExecuteServiceClientBase( HttpMethod httpMethod ) {
        this.httpMethod = httpMethod;
    }

}
