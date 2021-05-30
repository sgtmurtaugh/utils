package de.ckraus.webcommons.mappers.servlet.http;

import de.ckraus.webcommons.mappers.servlet.*;
import lombok.Getter;
import lombok.NonNull;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

@Getter
@SuppressWarnings({ "unused", "javadoc" })
public class DefaultTypeMapperHttpServletRequestFacade extends HttpServletRequestWrapper implements
        BigDecimalMapperServletRequest, BigIntegerMapperServletRequest, BooleanMapperServletRequest,
        ByteMapperServletRequest, CharacterMapperServletRequest, DateMapperServletRequest, DoubleMapperServletRequest,
        FloatMapperServletRequest, GregorianCalendarMapperServletRequest, IntegerMapperServletRequest,
        LocalDateMapperServletRequest, LocalDateTimeMapperServletRequest, LocalTimeMapperServletRequest,
        LongMapperServletRequest, ShortMapperServletRequest, StringMapperServletRequest {

    private String parameterPrefix;
    private String parameterSuffix;

    /**
     * Constructor
     * @param httpServletRequest
     */
    public DefaultTypeMapperHttpServletRequestFacade( @NonNull HttpServletRequest httpServletRequest ) {
       super( httpServletRequest );
    }

}
