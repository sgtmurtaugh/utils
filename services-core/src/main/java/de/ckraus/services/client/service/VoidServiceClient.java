package de.ckraus.services.client.service;

/**
 * Extends {@link ServiceClient} with Parameter {@link Void}
 */
public interface VoidServiceClient<I> extends ServiceClient<I, Void> {

    @Override
    default Class<Void> getResponseType() {
        return Void.class;
    }

}
