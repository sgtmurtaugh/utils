package de.ckraus.webcommons.mappers.servlet;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;

/**
 *
 */
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "unused", "javadoc" })
public class DefaultTypeMapperServletRequestFacade extends ServletRequestWrapper
        implements BigDecimalMapperServletRequest, BigIntegerMapperServletRequest, BooleanMapperServletRequest,
        ByteMapperServletRequest, CharacterMapperServletRequest, DateMapperServletRequest, DoubleMapperServletRequest,
        FloatMapperServletRequest, GregorianCalendarMapperServletRequest, IntegerMapperServletRequest,
        LocalDateMapperServletRequest, LocalDateTimeMapperServletRequest, LocalTimeMapperServletRequest,
        LongMapperServletRequest, ShortMapperServletRequest, StringMapperServletRequest {

    private String parameterPrefix;
    private String parameterSuffix;

    /**
     * Constructor
     *
     * @param servletRequest
     */
    public DefaultTypeMapperServletRequestFacade(@NonNull ServletRequest servletRequest) {
        this(servletRequest, null, null);
    }

    /**
     * Constructor
     *
     * @param servletRequest
     * @param parameterPrefix
     * @param parameterSuffix
     */
    public DefaultTypeMapperServletRequestFacade(@NonNull ServletRequest servletRequest, String parameterPrefix,
                                                 String parameterSuffix) {
        super(servletRequest);
        this.setParameterPrefix(parameterPrefix);
        this.setParameterSuffix(parameterSuffix);
    }

}
