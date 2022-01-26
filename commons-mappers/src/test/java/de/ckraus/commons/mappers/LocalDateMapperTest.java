package de.ckraus.commons.mappers;

import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
public class LocalDateMapperTest {

    private final LocalDateMapper mapper = () -> LocalDate.class;

}
