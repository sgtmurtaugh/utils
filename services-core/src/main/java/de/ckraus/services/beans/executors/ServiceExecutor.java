package de.ckraus.services.beans.executors;

import de.ckraus.commons.beans.executor.Executor;
import de.ckraus.services.clients.ServiceClient;
import org.springframework.http.HttpStatus;

import java.util.Map;

/**
 *
 * @param <T> ServiceClient
 * @param <I> Request Bean
 * @param <O> Response Bean
 */
public interface ServiceExecutor<T extends ServiceClient<I, O>, I, O> extends Executor<O> {


    /**
     *
     * @return
     */
    O callService();

    /**
     *
     * @param mapContainerParams
     * @return
     */
    T execute( Map<String, Object> mapContainerParams );


    /**
     *
     * @return
     */
    HttpStatus getHttpStatus();

    /**
     *
     * @return
     */
    I getRequestObject();

    /**
     *
     * @return
     */
    O getResponseEntity();

    /**
     *
     * @return
     */
    Map<Object, String> getNamedServiceArgs();

    /**
     *
     * @return
     */
    Object[] getOrderedServiceArgs();

    /**
     *
     * @return
     */
    Throwable getThrowable();

    /**
     *
     * @return
     */
    boolean isExecuted();

    /**
     *
     * @return
     */
    boolean isFailed();

    /**
     *
     * @return
     */
    default boolean isReallyPerformService() {
        return (!this.isExecuted());
    }

}
