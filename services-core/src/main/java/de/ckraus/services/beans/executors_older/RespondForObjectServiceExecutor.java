package de.ckraus.services.beans.executors_older;

/**
 * @param <O>
 */
public interface RespondForObjectServiceExecutor<O> extends RespondServiceExecutor<O> {

    /**
     * getResponseEntityBean
     *
     * @return
     */
    O getResponseEntityBean();

    /**
     * getResponseEntityType
     *
     * @return
     */
    Class<O> getResponseEntityType();

}
