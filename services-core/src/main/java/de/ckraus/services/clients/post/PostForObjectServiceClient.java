package de.ckraus.services.clients.post;

import de.ckraus.services.clients.ServiceClient;

/**
 * Extends {@link ServiceClient}
 * @param <O> Response Bean
 */
public interface PostForObjectServiceClient<O> extends ServiceClient<Object, O> {

}
