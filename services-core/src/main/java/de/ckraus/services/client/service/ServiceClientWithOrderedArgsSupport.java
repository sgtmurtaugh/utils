package de.ckraus.services.client.service;

/**
 *
 * @param <I> Request Bean
 * @param <O> Response Bean
 */
public interface ServiceClientWithOrderedArgsSupport<I, O> extends ServiceClient<I, O> {

    Object[] getOrderedServiceArgs();
    void setOrderedServiceArgs(Object... orderedServiceArgs);

}
