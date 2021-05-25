package de.ckraus.webcommons.mapper.servlet.http.utils;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public interface BigDecimalMapperRequestUtils {

    /**
     * @param request
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalAttribute( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper().mapObject( request.getAttribute( name ) );
        }
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalAttribute( HttpServletRequest request, String name, BigDecimal defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                  .mapObject( request.getAttribute( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @return
     */
    default BigDecimal getBigDecimalParameter( HttpServletRequest request, String name ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper().map( request.getParameter( name ) );
        }
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalParameter( HttpServletRequest request, String name, BigDecimal defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                  .map( request.getParameter( name ), defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @return
     */
    default BigDecimal getBigDecimalParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull );
        }
        return TypeMapperUtils.getDefaults().getBigDecimalMapper().getDefaultValue();
    }

    /**
     * @param request
     * @param name
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     * @return
     */
    default BigDecimal getBigDecimalParameter( HttpServletRequest request, String name, boolean bTrim,
            boolean bEmptyIsNull, BigDecimal defaultValue ) {
        if ( null != request ) {
            return TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                  .map( request.getParameter( name ), bTrim, bEmptyIsNull, defaultValue );
        }
        return defaultValue;
    }

    /**
     * @param request
     * @param key
     * @return
     */
    default boolean hasBigDecimalAttribute( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            var value = TypeMapperUtils.getDefaults().getBigDecimalMapper()
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
    default boolean hasBigDecimalAttributeWithValue( HttpServletRequest request, String key, BigDecimal value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) && null != request.getAttribute( key ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigDecimalMapper()
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
    default boolean hasBigDecimalParameter( HttpServletRequest request, String key ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            var value = TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                       .map( request.getParameter( key ), ( BigDecimal ) null );
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
    default boolean hasBigDecimalParameterWithValue( HttpServletRequest request, String key, BigDecimal value ) {
        if ( null != request && StringUtils.isNotEmpty( key ) &&
             StringUtils.isNotEmpty( request.getParameter( key ) ) ) {
            return new EqualsBuilder().append( value, TypeMapperUtils.getDefaults().getBigDecimalMapper()
                                                                     .map( request.getParameter( key ),
                                                                           ( BigDecimal ) null ) ).isEquals();
        }
        return false;
    }

}
