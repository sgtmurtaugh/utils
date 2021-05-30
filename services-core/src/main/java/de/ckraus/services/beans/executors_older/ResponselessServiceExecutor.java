package de.ckraus.services.beans.executors_older;

import java.util.Map;

/**
 *
 */
public interface ResponselessServiceExecutor extends ServiceExecutorBase {

    /**
     * callService
     *
     * @return
     */
    void callService();

    /**
     * execute
     *
     * @param mapContainerParams
     *
     * @return
     */
    void execute(Map<String, ?> mapContainerParams);

}
