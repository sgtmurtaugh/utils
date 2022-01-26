package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class GregorianCalendarMapperImplTest {

    private final GregorianCalendarMapper mapper = new GregorianCalendarMapperImpl();

}
