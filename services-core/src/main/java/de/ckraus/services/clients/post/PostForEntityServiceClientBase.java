package de.ckraus.services.clients.post;

import de.ckraus.services.clients.ServiceClientBase;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

/**
 * @param <O>
 */
@Getter
@Setter(AccessLevel.PROTECTED)
public abstract class PostForEntityServiceClientBase<O> extends ServiceClientBase<Object, ResponseEntity<O>>
        implements PostForEntityServiceClient<O> {

}
