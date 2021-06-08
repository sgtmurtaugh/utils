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

    private BigDecimalMapper bigDecimalMapper;
    private BigIntegerMapper bigIntegerMapper;
    private BooleanMapper booleanMapper;
    private ByteMapper byteMapper;
    private CharacterMapper characterMapper;
    private DateMapper dateMapper;
    private DoubleMapper doubleMapper;
    private FloatMapper floatMapper;
    private GregorianCalendarMapper gregorianCalendarMapper;
    private IntegerMapper integerMapper;
    private LocalDateMapper localDateMapper;
    private LocalDateTimeMapper localDateTimeMapper;
    private LocalTimeMapper localTimeMapper;
    private LongMapper longMapper;
    private ShortMapper shortMapper;
    private StringMapper stringMapper;

    private TypeMapperFactory typeMapperFactory;

    @Autowired
    @Qualifier("typeMapperFactory")
    protected void setTypeMapperFactory(TypeMapperFactory typeMapperFactory) {
        this.typeMapperFactory = typeMapperFactory;
    }

    @Autowired
    @Qualifier("bigDecimalMapper")
    protected void setBigDecimalMapper(BigDecimalMapper bigDecimalMapper) {
        this.bigDecimalMapper = bigDecimalMapper;
    }

    @Autowired
    @Qualifier("bigIntegerMapper")
    protected void setBigIntegerMapper(BigIntegerMapper bigIntegerMapper) {
        this.bigIntegerMapper = bigIntegerMapper;
    }

    @Autowired
    @Qualifier("booleanMapper")
    protected void setBooleanMapper(BooleanMapper booleanMapper) {
        this.booleanMapper = booleanMapper;
    }

    @Autowired
    @Qualifier("byteMapper")
    protected void setByteMapper(ByteMapper byteMapper) {
        this.byteMapper = byteMapper;
    }

    @Autowired
    @Qualifier("characterMapper")
    protected void setCharacterMapper(CharacterMapper characterMapper) {
        this.characterMapper = characterMapper;
    }

    @Autowired
    @Qualifier("dateMapper")
    protected void setDateMapper(DateMapper dateMapper) {
        this.dateMapper = dateMapper;
    }

    @Autowired
    @Qualifier("doubleMapper")
    protected void setDoubleMapper(DoubleMapper doubleMapper) {
        this.doubleMapper = doubleMapper;
    }

    @Autowired
    @Qualifier("floatMapper")
    protected void setFloatMapper(FloatMapper floatMapper) {
        this.floatMapper = floatMapper;
    }

    @Autowired
    @Qualifier("gregorianCalendarMapper")
    protected void setGregorianCalendarMapper(GregorianCalendarMapper gregorianCalendarMapper) {
        this.gregorianCalendarMapper = gregorianCalendarMapper;
    }

    @Autowired
    @Qualifier("integerMapper")
    protected void setIntegerMapper(IntegerMapper integerMapper) {
        this.integerMapper = integerMapper;
    }

    @Autowired
    @Qualifier("localDateMapper")
    protected void setLocalDateMapper(LocalDateMapper localDateMapper) {
        this.localDateMapper = localDateMapper;
    }

    @Autowired
    @Qualifier("localDateTimeMapper")
    protected void setLocalDateTimeMapper(LocalDateTimeMapper localDateTimeMapper) {
        this.localDateTimeMapper = localDateTimeMapper;
    }

    @Autowired
    @Qualifier("localTimeMapper")
    protected void setLocalTimeMapper(LocalTimeMapper localTimeMapper) {
        this.localTimeMapper = localTimeMapper;
    }

    @Autowired
    @Qualifier("longMapper")
    protected void setLongMapper(LongMapper longMapper) {
        this.longMapper = longMapper;
    }

    @Autowired
    @Qualifier("shortMapper")
    protected void setShortMapper(ShortMapper shortMapper) {
        this.shortMapper = shortMapper;
    }

    @Autowired
    @Qualifier("stringMapper")
    protected void setStringMapper(StringMapper stringMapper) {
        this.stringMapper = stringMapper;
    }

}
