package de.ckraus.services.client.service;

import java.util.Map;

/**
 *
 * @param <I> Request Bean
 * @param <O> Response Bean
 */
public interface ServiceClientWithNamedArgsSupport<I, O> extends ServiceClient<I, O> {

    Map<String, Object> getNamedServiceArgs();
    void setNamedServiceArgs(Map<String, Object> namedServiceArgs);

}
