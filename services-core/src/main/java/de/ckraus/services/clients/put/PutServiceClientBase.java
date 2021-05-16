package de.ckraus.services.clients.put;

import de.ckraus.services.clients.responseless.VoidServiceClient;
import de.ckraus.services.clients.responseless.VoidServiceClientBase;
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
