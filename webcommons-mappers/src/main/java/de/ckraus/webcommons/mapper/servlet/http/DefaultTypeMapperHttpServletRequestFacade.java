package de.ckraus.webcommons.mapper.servlet.http;

import de.ckraus.webcommons.mapper.servlet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

@SuppressWarnings({ "unused", "javadoc" })
public class DefaultTypeMapperHttpServletRequestFacade extends HttpServletRequestWrapper implements
        BigDecimalMapperServletRequest, BigIntegerMapperServletRequest, BooleanMapperServletRequest,
        ByteMapperServletRequest, CharacterMapperServletRequest, DateMapperServletRequest, DoubleMapperServletRequest,
        FloatMapperServletRequest, GregorianCalendarMapperServletRequest, IntegerMapperServletRequest,
        LocalDateMapperServletRequest, LocalDateTimeMapperServletRequest, LocalTimeMapperServletRequest,
        LongMapperServletRequest, ShortMapperServletRequest, StringMapperServletRequest {

    /**
     * Constructor
     * @param httpServletRequest
     */
    public DefaultTypeMapperHttpServletRequestFacade( HttpServletRequest httpServletRequest ) {
       super( httpServletRequest );
    }

}
