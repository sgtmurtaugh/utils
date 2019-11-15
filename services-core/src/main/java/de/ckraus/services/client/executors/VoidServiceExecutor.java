package de.ckraus.services.client.executors;

/**
 * Extends {@link ServiceExecutor} with Parameter {@link Void}
 */
public interface VoidServiceExecutor<I> extends ServiceExecutor<I, Void> {

    @Override
    default Class<Void> getResponseType() {
        return Void.class;
    }

}