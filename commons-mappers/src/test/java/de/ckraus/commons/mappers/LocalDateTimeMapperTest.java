package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDateTime;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class LocalDateTimeMapperTest {

    private final LocalDateTimeMapper mapper = () -> LocalDateTime.class;

}
