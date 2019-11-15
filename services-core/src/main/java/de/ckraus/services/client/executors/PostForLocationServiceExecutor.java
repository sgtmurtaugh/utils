package de.ckraus.services.client.executors;

import de.ckraus.services.client.service.ServiceClient;

import java.net.URI;

/**
 * Extends {@link ServiceExecutor} with Parameter {@link URI}
 */
public interface PostForLocationServiceExecutor extends ServiceExecutor<ServiceClient<Object, URI>, Object, URI> {

}
