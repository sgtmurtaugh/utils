package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface StringMapperSessionUtils {

    /**
     * @param session
     * @param name
     * @return
     */
    default String getStringAttribute( HttpSession session, String name ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getStringMapper().mapObject( session.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param defaultValue
     * @return
     */
    default String getStringAttribute( HttpSession session, String name, String defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .mapObject( session.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default String getStringAttribute( HttpSession session, String name, boolean bTrim, boolean bEmptyIsNull ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .map( this.getStringAttribute( session, name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getStringMapper().getDefaultValue();
    }

    /**
     * @param session
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default String getStringAttribute( HttpSession session, String name, boolean bTrim, boolean bEmptyIsNull,
            String defaultValue ) {
        if ( null != session ) {
            return TypeMapperUtils.getDefaults().getStringMapper()
                                  .map( this.getStringAttribute( session, name, defaultValue ), bTrim, bEmptyIsNull,
                                        defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param session
     * @param key
     * @return
     */
    default boolean hasStringAttribute( HttpSession session, String key ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getStringMapper()
                                       .mapObject( session.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param session
     * @param key
     * @param value
     * @return
     */
    default boolean hasStringAttributeWithValue( HttpSession session, String key, String value ) {
        if ( null != session && StringUtils.isNotEmpty( key ) && null != session.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getStringMapper()
                                                                     .mapObject( session.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

}
