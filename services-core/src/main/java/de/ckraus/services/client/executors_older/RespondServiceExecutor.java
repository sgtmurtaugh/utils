package de.ckraus.services.client.executors_older;

import java.util.Map;

/**
 *
 */
public interface RespondServiceExecutor<O> extends ServiceExecutorBase {

    /**
     * callService
     * @return
     */
    O callService();

    /**
     * execute
     * @param mapContainerParams
     * @return
     */
    O execute( Map<String, Object> mapContainerParams );

}
