package de.ckraus.services.clients.get;

import de.ckraus.services.clients.ServiceClient;

/**
 * Extends {@link ServiceClient}
 * @param <O> Response Bean
 */
public interface GetForObjectServiceClient<O> extends ServiceClient<Void, O> {

}
