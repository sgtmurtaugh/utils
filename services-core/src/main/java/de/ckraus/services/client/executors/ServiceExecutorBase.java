package de.ckraus.services.client.executors;

import de.ckraus.services.ServiceUtils;
import de.ckraus.services.client.service.ServiceClient;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Map;

@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class ServiceExecutorBase<T extends ServiceClient<I, O>, I, O> implements ServiceExecutor<T, I, O> {

    private Map<String, Object> params;
    private boolean executed;
    private boolean failed;
    private HttpStatus httpStatus;
    private I requestObject;
    private O responseEntity;
//    private Class<O> responseType;
    private Map<Object, String> namedServiceArgs;
    private Object[] orderedServiceArgs;
    private Throwable throwable;
    private T serviceClient;

    protected abstract I initRequestObject();

    @Tolerate
    protected void setFailed( HttpStatus httpStatus ) {
        this.setFailed( ServiceUtils.isExecutedSuccessfully( httpStatus ) );
    }

    @Tolerate
    protected void setHttpStatus( O oResponseEntity ) {
        if (null == responseEntity) {
            this.setHttpStatus( HttpStatus.NO_CONTENT );
        }
        else
        if (responseEntity instanceof Void) {
            this.setHttpStatus( HttpStatus.OK );
        }
        else
        if (responseEntity instanceof ResponseEntity ) {
            this.setHttpStatus(
                    ((ResponseEntity) responseEntity).getStatusCode()
            );
        }
        else {
            this.setHttpStatus( HttpStatus.OK );
        }
    }

    /**
     *
     * @param mapContainerParams
     */
    protected void init( Map<String, Object> mapContainerParams ) {
        this.reset();

        this.setParams( mapContainerParams );
        this.setRequestObject( this.initRequestObject() );
    }

    /**
     *
     */
    public void reset() {
        this.setParams(null);
        this.setExecuted(false);
        this.setFailed(false);
        this.setHttpStatus((HttpStatus ) null);
        this.setRequestObject(null);
        this.setResponseEntity(null);
        this.setNamedServiceArgs(null);
        this.setOrderedServiceArgs(null);
        this.setThrowable(null);
    }

    /**
     *
     * @param mapContainerParams
     * @return
     */
    public T execute( Map<String, Object> mapContainerParams ) {
        this.init(mapContainerParams);

        T t = null;

        if ( this.isReallyPerformService() ) {

            // handle Execution individually
            this.performService();

            // handle Service Response
            t = handleServiceResponse();

            // at least (after handleServiceResponse) store ResponseEntity Bean to scope
            this.storeResponseEntityBean();
        }
        return t;
    }

    /**
     *
     */
    protected void performService() {
        O oResponseEntity = null;

        try {
            oResponseEntity = this.callService();

            // set HttpStatus
            this.setHttpStatus(oResponseEntity);
        } catch ( HttpServerErrorException hsee ) {
            // set HttpStatus
            this.setHttpStatus(hsee.getStatusCode());
            this.setThrowable(hsee);

        } catch ( RestClientException rce ) {
            // set HttpStatus
            this.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            this.setThrowable(rce);

        }
        finally {
            // set ResponseEntity Bean
            this.setResponseEntity(oResponseEntity);
        }

        // set Execution Flag
        this.setExecuted( true );

        // set Execution status by occured exception or returned HttpStatus
        if ( ( this.isExecuted() )
                && ( null != this.getThrowable() ) ) {

            this.setFailed( Boolean.TRUE );
        }
        else {
            this.setFailed( this.getHttpStatus() );
        }
    }

    /**
     * TODO
     * @return
     */
    protected abstract T handleServiceResponse();

    /**
     *
     */
    public void storeResponseEntityBean() {
        if ( !this.isFailed() ) {
            // TODO
        }
    }

}
