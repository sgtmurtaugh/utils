package de.ckraus.commons.mappers.config;

import de.ckraus.commons.mappers.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("mapperConfig")
@ComponentScan("de.ckraus.commons.mappers")
@Getter
public class CommonsMappersConfig {

    @Autowired
    @Qualifier("bigDecimalMapper")
    private BigDecimalMapper bigDecimalMapper;

    @Autowired
    @Qualifier("bigIntegerMapper")
    private BigIntegerMapper bigIntegerMapper;

    @Autowired
    @Qualifier("booleanMapper")
    private BooleanMapper booleanMapper;

    @Autowired
    @Qualifier("byteMapper")
    private ByteMapper byteMapper;

    @Autowired
    @Qualifier("characterMapper")
    private CharacterMapper characterMapper;

    @Autowired
    @Qualifier("dateMapper")
    private DateMapper dateMapper;

    @Autowired
    @Qualifier("doubleMapper")
    private DoubleMapper doubleMapper;

    @Autowired
    @Qualifier("floatMapper")
    private FloatMapper floatMapper;

    @Autowired
    @Qualifier("gregorianCalendarMapper")
    private GregorianCalendarMapper gregorianCalendarMapper;

    @Autowired
    @Qualifier("integerMapper")
    private IntegerMapper integerMapper;

    @Autowired
    @Qualifier("localDateMapper")
    private LocalDateMapper localDateMapper;

    @Autowired
    @Qualifier("localDateTimeMapper")
    private LocalDateTimeMapper localDateTimeMapper;

    @Autowired
    @Qualifier("localTimeMapper")
    private LocalTimeMapper localTimeMapper;

    @Autowired
    @Qualifier("longMapper")
    private LongMapper longMapper;

    @Autowired
    @Qualifier("shortMapper")
    private ShortMapper shortMapper;

    @Autowired
    @Qualifier("stringMapper")
    private StringMapper stringMapper;

    @Autowired
    @Qualifier("typeMapperFactory")
    private TypeMapperFactory typeMapperFactory;

    @Autowired
    @Qualifier("defaultTypeMapperFactory")
    private DefaultTypeMapperFactory defaultTypeMapperFactory;

}
