package de.ckraus.services.clients.responseless;

import de.ckraus.services.clients.ServiceClient;

/**
 * Extends {@link ServiceClient} with Parameter {@link Void}
 */
public interface VoidServiceClient<I> extends ServiceClient<I, Void> {

    @Override
    default Class<Void> getResponseType() {
        return Void.class;
    }

}
