package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

/**
 *
 */
@SuppressWarnings({ "unused", "javadoc" })
public interface LocalDateMapperRequestUtils {

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default LocalDate getLocalDateAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalDateMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDate getLocalDateAttribute( HttpServletRequest request, String name, LocalDate defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * 
     * @param request
     * @param name
     * @return
     */
    default LocalDate getLocalDateParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getLocalDateMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default LocalDate getLocalDateParameter( HttpServletRequest request, String name, LocalDate defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper().map( request.getParameter( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * 
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default LocalDate getLocalDateParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getLocalDateMapper().getDefaultValue();
    }

    /**
     * 
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default LocalDate getLocalDateParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull, LocalDate defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getLocalDateMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasLocalDateAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateMapper()
                                       .mapObject( request.getAttribute( key ), null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param request
     * @param key
     * @param value
     * @return
     */
    default boolean hasLocalDateAttributeWithValue( HttpServletRequest request, String key, LocalDate value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateMapper()
                                                                     .mapObject( request.getAttribute( key ), null ) )
                                      .isEquals();
        }
        return false;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasLocalDateParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getLocalDateMapper()
                                       .map( request.getParameter( key ), ( LocalDate ) null );
            return ( null != value );
        }
        return false;
    }

    /**
     * @param request
     * @param key
     * @param value
     * @return
     */
    default boolean hasLocalDateParameterWithValue( HttpServletRequest request, String key, LocalDate value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getLocalDateMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( LocalDate ) null ) ).isEquals();
        }
        return false;
    }

}
