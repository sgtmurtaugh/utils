package de.ckraus.services.clients.get;

import de.ckraus.services.clients.ServiceClientBase;
import org.springframework.http.ResponseEntity;

/**
 * @param <O>
 */
public abstract class GetForEntityServiceClientBase<O> extends ServiceClientBase<Void, ResponseEntity<O>>
        implements GetForEntityServiceClient<O> {

}
