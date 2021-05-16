package de.ckraus.services.clients.post;

import de.ckraus.services.clients.ServiceClient;
import org.springframework.http.ResponseEntity;

/**
 * Extends {@link ServiceClient} with Parameter {@link ResponseEntity<O>}
 * @param <O> Response Bean
 */
public interface PostForEntityServiceClient<O> extends ServiceClient<Object, ResponseEntity<O>> {

}
