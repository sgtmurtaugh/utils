package de.ckraus.services.clients;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.RequestEntity;

@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class ServiceClientBase<I, O> implements ServiceClient<I, O> {

    private ServiceClientResource serviceClientResource;

    private Class<I> requestEntityClass;
    private Class<O> responseEntityClass;

    private String name;

    private I requestObject;
    private RequestEntity<I> requestEntityBean;

}
