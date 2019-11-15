package de.ckraus.services.client.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @param <I>
 */
@Getter
@Setter( AccessLevel.PROTECTED)
public abstract class PutServiceClientBase<I> extends VoidServiceClientBase<I> implements VoidServiceClient<I> {

}
