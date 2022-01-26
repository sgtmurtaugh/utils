package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.util.GregorianCalendar;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class GregorianCalendarMapperTest {

    private final GregorianCalendarMapper mapper = () -> GregorianCalendar.class;

}
