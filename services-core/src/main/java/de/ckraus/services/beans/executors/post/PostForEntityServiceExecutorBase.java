package de.ckraus.services.beans.executors.post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

/**
 *
 * @param <O>
 */
@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class PostForEntityServiceExecutorBase<O> extends ServiceExecutorBase<Object,
        ResponseEntity<O>> implements PostForEntityServiceExecutor<O> {

}
