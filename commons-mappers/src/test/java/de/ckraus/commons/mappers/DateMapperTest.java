package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class DateMapperTest {

    private final DateMapper mapper = () -> Date.class;

}
