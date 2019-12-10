package de.ckraus.commons.beans;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.keyvalue.AbstractMapEntry;
import org.apache.commons.lang3.StringUtils;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * TODO
 */
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

    /**
     * TODO
     * @param sKey
     * @param <T>
     * @return
     */
    public <T> T getParam( String sKey ) {
        T param = null;

        if ( MapUtils.isNotEmpty( this.getParams() ) ) {
            param = this.getParam( sKey );
        }

        return param;
    }

    /**
     *
     * @param sKey
     * @param oValue
     * @return
     */
    public BeanBase addParam( String sKey, Object oValue ) {
        if ( StringUtils.isNotEmpty( sKey ) ) {
            if ( null == oValue ) {
                if ( MapUtils.isNotEmpty( this.getParams() ) ) {
                    this.getParams().remove( sKey );
                }
            }
            else {
                if ( MapUtils.isEmpty( this.getParams() ) ) {
                    this.setParams( new ConcurrentHashMap<>() );
                }
                this.getParams().put(
                        sKey,
                        Map.entry( oValue.getClass(), oValue )
                );
            }
        }
        return this;
    }

    /**
     *
     * @param mapParams
     * @return
     */
    public BeanBase addParams( Map<String, Map.Entry<Class<?>, ?>> mapParams ) {
        if ( MapUtils.isNotEmpty( this.getParams() ) ) {
            this.getParams().putAll( mapParams );
        }
        return this;
    }

    @Override
    public void reset() {
        this.setInitialized(false);
    }

}
