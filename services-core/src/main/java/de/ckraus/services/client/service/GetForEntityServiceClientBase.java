package de.ckraus.services.client.service;

import org.springframework.http.ResponseEntity;

/**
 *
 * @param <O>
 */
public abstract class GetForEntityServiceClientBase<O> extends ServiceClientBase<Void, ResponseEntity<O>>
        implements GetForEntityServiceClient<O> {

}
