package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
class StringMapperImplTest {

    private final StringMapperImpl mapper = new StringMapperImpl();

    @Test
    void map() {
    }

}
