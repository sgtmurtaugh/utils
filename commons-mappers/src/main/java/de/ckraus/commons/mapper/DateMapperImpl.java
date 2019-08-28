package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class DateMapperImpl extends TypeMapperBase<Date> implements DateMapper {

    private final static String CLASS = DateMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(IntegerMapper.class);


    /**
     * Constructor
     */
    public DateMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public DateMapperImpl( Date defaultValue ) {
        super( defaultValue );
    }

}
