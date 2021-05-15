package de.ckraus.services.client.executors;

import de.ckraus.commons.beans.Executor;
import de.ckraus.services.client.service.ServiceClient;
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
     * @return
     */
    default Executor<O> execute() {
        return this.execute( null );
    }

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
    Map<String, Object> getParameters();

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
//    Class<O> getResponseType();

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
