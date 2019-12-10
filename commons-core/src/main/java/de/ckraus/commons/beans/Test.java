package de.ckraus.commons.beans;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Getter
@Setter( AccessLevel.PROTECTED)
public class Test implements Bean {

    private boolean initialized;
    private Properties configurationProperties;
    private ConcurrentMap<String, Map.Entry<Class<?>, ?>> params;

    @Override
    public boolean initialize( boolean bReinitialization ) {
        params = new ConcurrentHashMap<>();
        params.put( "A", Map.entry( String.class, "BAM" ) );
        params.put( "B", Map.entry( Integer.class, 5 ) );
        params.put( "C", Map.entry( List.class, Collections.emptyMap() ) );

        this.setParams( params );
        return true;
    }

    @SuppressWarnings( "unchecked" )
    public <T> T getParam(String key) {
        return ( T ) this.getParams().get( key ).getValue();
    }

    private void test() {
        this.<Integer>getParam("A");
        this.<String>getParam("A");
    }
}
