package de.ckraus.services.beans.executors_older;

import org.springframework.http.ResponseEntity;

/**
 *
 * @param <O> ResponseEntity Type
 */
public interface RespondForEntityServiceExecutor<O> extends RespondServiceExecutor<ResponseEntity<O>> {

    /**
     * getResponseEntityBean
     * @return
     */
    O getResponseEntityBean();

    /**
     * getResponseEntityType
     * @return
     */
    Class<O> getResponseEntityType();

}
