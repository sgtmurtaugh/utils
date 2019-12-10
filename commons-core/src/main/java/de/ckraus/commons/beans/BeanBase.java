package de.ckraus.commons.beans;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentMap;

@Getter
@Setter( AccessLevel.PROTECTED )
public abstract class BeanBase implements Bean {

    private boolean initialized;
    private Properties configurationProperties;
    private ConcurrentMap<String, Map.Entry<Class<?>, ?>> params;

    @Override
    public boolean initialize( boolean bReinitialization ) {
        if ( bReinitialization ) {
            this.reset();
        }

        if ( !this.isInitialized() ) {
            this.setInitialized( true );
        }

        return bReinitialization;
    }

    public void reset() {
        this.setInitialized(false);
    }

}
