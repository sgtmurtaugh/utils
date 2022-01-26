package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class DateMapperImplTest {

    // create mapper instance
    private final DateMapperImpl mapper = new DateMapperImpl();

}
