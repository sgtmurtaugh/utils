package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class LocalTimeMapperImpl extends TemporalTypeMapperBase<LocalTime> implements LocalTimeMapper {

    private final static String CLASS = LocalTimeMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(StringMapper.class);


    /**
     * Constructor
     */
    public LocalTimeMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalTimeMapperImpl( LocalTime defaultValue ) {
        super( defaultValue );
    }

}
