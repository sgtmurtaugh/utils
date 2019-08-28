package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class LocalDateMapperImpl extends TemporalTypeMapperBase<LocalDate> implements LocalDateMapper {

    private final static String CLASS = LocalDateMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(StringMapper.class);


    /**
     * Constructor
     */
    public LocalDateMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalDateMapperImpl( LocalDate defaultValue ) {
        super( defaultValue );
    }

}
