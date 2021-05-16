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
