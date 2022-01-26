package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.time.LocalTime;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class LocalTimeMapperTest {

    private final LocalTimeMapper mapper = () -> LocalTime.class;

}
