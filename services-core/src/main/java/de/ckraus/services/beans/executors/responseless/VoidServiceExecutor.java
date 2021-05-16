package de.ckraus.services.beans.executors.responseless;

/**
 * Extends {@link ServiceExecutor} with Parameter {@link Void}
 */
public interface VoidServiceExecutor<I> extends ServiceExecutor<I, Void> {

    @Override
    default Class<Void> getResponseType() {
        return Void.class;
    }

}
