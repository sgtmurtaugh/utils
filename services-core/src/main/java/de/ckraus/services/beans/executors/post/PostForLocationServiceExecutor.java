package de.ckraus.services.beans.executors.post;

import de.ckraus.services.clients.ServiceClient;

import java.net.URI;

/**
 * Extends {@link ServiceExecutor} with Parameter {@link URI}
 */
public interface PostForLocationServiceExecutor extends ServiceExecutor<ServiceClient<Object, URI>, Object, URI> {

}
