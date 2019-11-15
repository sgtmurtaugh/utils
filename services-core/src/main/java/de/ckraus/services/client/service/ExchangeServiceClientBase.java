package de.ckraus.services.client.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpMethod;

/**
 *
 * @param <I>
 * @param <O>
 */
@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class ExchangeServiceClientBase<I, O> extends ServiceClientBase<I, O> implements ExchangeServiceClient<I, O> {

    @Setter(AccessLevel.NONE)
    private final HttpMethod httpMethod;

    /**
     * Constructor
     * @param httpMethod
     */
    public ExchangeServiceClientBase( HttpMethod httpMethod ) {
        this.httpMethod = httpMethod;
    }

}
