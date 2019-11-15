package de.ckraus.services.client.service;

import org.springframework.http.ResponseEntity;

/**
 * Extends {@link ServiceClient} with Parameter {@link ResponseEntity<O>}
 * @param <O> Response Bean
 */
public interface GetForEntityServiceClient<O> extends ServiceClient<Void, ResponseEntity<O>> {

}
