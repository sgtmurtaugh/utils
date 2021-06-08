package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.GregorianCalendar;

@Component("gregorianCalendarMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class GregorianCalendarMapperImpl extends CalendarMapperBase<GregorianCalendar>
        implements GregorianCalendarMapper {

    /**
     * Constructor
     */
    public GregorianCalendarMapperImpl() {
        super(GregorianCalendar.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public GregorianCalendarMapperImpl(GregorianCalendar defaultValue) {
        super(GregorianCalendar.class, defaultValue);
    }

}
