package de.ckraus.services.clients.get;

import de.ckraus.services.clients.ServiceClient;
import org.springframework.http.ResponseEntity;

/**
 * Extends {@link ServiceClient} with Parameter {@link ResponseEntity<O>}
 *
 * @param <O> Response Bean
 */
public interface GetForEntityServiceClient<O> extends ServiceClient<Void, ResponseEntity<O>> {

}
