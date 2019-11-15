package de.ckraus.services.client.executors;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @param <I>
 */
@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class PutServiceExecutorBase<I> extends VoidServiceExecutorBase<I> implements VoidServiceExecutor<I> {

}
