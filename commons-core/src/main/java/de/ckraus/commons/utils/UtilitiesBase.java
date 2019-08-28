package de.ckraus.commons.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused", "WeakerAccess" } )
public abstract class UtilitiesBase<E> implements Utilities<E> {

    private final static String CLASS = UtilitiesBase.class.getSimpleName();
    protected static Logger log = LoggerFactory.getLogger( UtilitiesBase.class );


    /**
     * Constructor
     */
    public UtilitiesBase() {
        super();
    }

}
