package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.GregorianCalendar;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class GregorianCalendarMapperImpl extends CalendarMapperBase<GregorianCalendar>
        implements GregorianCalendarMapper {

    private final static String CLASS = GregorianCalendarMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(IntegerMapper.class);


    /**
     * Constructor
     */
    public GregorianCalendarMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public GregorianCalendarMapperImpl( GregorianCalendar defaultValue ) {
        super( defaultValue );
    }

}