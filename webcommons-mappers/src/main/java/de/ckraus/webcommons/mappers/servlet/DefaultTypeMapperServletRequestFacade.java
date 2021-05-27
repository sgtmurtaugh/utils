package de.ckraus.webcommons.mappers.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;

/**
 *
 */
@SuppressWarnings( { "unused", "javadoc" } )
public class DefaultTypeMapperServletRequestFacade extends ServletRequestWrapper
        implements BigDecimalMapperServletRequest, BigIntegerMapperServletRequest, BooleanMapperServletRequest,
        ByteMapperServletRequest, CharacterMapperServletRequest, DateMapperServletRequest, DoubleMapperServletRequest,
        FloatMapperServletRequest, GregorianCalendarMapperServletRequest, IntegerMapperServletRequest,
        LocalDateMapperServletRequest, LocalDateTimeMapperServletRequest, LocalTimeMapperServletRequest,
        LongMapperServletRequest, ShortMapperServletRequest, StringMapperServletRequest {

    /**
     * Constructor
     *
     * @param servletRequest
     */
    public DefaultTypeMapperServletRequestFacade( ServletRequest servletRequest ) {
        super( servletRequest );
    }

}
