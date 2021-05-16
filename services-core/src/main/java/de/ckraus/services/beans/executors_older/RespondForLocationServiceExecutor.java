package de.ckraus.services.beans.executors_older;

import java.net.URI;

/**
 *
 */
public interface RespondForLocationServiceExecutor extends RespondServiceExecutor<URI> {

    /**
     * getRequestEntityBean
     * @return
     */
    Object getRequest();

}
