package de.ckraus.services.beans.executors_older;

/**
 * @param <O> ResponseEntity Type
 */
public interface PatchForObjectServiceExecutor<O> extends RespondForObjectServiceExecutor<O> {

    /**
     * getRequest
     *
     * @return
     */
    Object getRequest();

}
