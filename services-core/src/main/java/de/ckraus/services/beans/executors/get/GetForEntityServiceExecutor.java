package de.ckraus.services.beans.executors.get;

import org.springframework.http.ResponseEntity;

/**
 * Extends {@link ServiceExecutor} with Parameter {@link ResponseEntity<O>}
 *
 * @param <O> Response Bean
 */
public interface GetForEntityServiceExecutor<O> extends ServiceExecutor<Void, ResponseEntity<O>> {

}
