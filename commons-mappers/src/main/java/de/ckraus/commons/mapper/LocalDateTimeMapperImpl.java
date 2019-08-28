package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class LocalDateTimeMapperImpl extends TemporalTypeMapperBase<LocalDateTime> implements LocalDateTimeMapper {

    private final static String CLASS = LocalDateTimeMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(StringMapper.class);


    /**
     * Constructor
     */
    public LocalDateTimeMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalDateTimeMapperImpl( LocalDateTime defaultValue ) {
        super( defaultValue );
    }

}