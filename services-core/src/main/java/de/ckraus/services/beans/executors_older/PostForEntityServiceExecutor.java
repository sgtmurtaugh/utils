package de.ckraus.services.beans.executors_older;

/**
 * @param <O> ResponseEntity Type
 */
public interface PostForEntityServiceExecutor<O> extends RespondForEntityServiceExecutor<O> {

    /**
     * getRequest
     *
     * @return
     */
    Object getRequest();

}
