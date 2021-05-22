package de.ckraus.webcommons.mapper.servlet;

import javax.servlet.ServletRequest;

public interface TypeMapperServletRequest extends ServletRequest, BigDecimalMapperServletRequest,
        BigIntegerMapperServletRequest, BooleanMapperServletRequest, ByteMapperServletRequest,
        CharacterMapperServletRequest, DateMapperServletRequest, DoubleMapperServletRequest,
        FloatMapperServletRequest, GregorianCalendarMapperServletRequest, IntegerMapperServletRequest,
        LocalDateMapperServletRequest, LocalDateTimeMapperServletRequest, LocalTimeMapperServletRequest,
        LongMapperServletRequest, ShortMapperServletRequest, StringMapperServletRequest {


}
