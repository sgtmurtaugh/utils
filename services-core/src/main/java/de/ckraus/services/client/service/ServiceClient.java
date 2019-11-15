package de.ckraus.services.client.service;

import de.ckraus.services.client.ServiceClientResource;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * @param <I> Request Bean
 * @param <O> Response Bean
 */
public interface ServiceClient<I, O> {

    ServiceClientResource getServiceClientResource();

    Class<I> getRequestEntityClass();

    Class<O> getResponseEntityClass();

    String getName();

    default URI getURI() {
        return UriComponentsBuilder.fromUri( this.getServiceClientResource().getURI() )
                .pathSegment( this.getName() )
                .build().toUri();
    }

    default String getUrl() {
        return this.getURI().toString();
    }

    //    I getRequestObject();
    //    RequestEntity<I> getRequestEntityBean();

}
