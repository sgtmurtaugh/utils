package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
class LongMapperImplTest {

    private final LongMapperImpl mapper = new LongMapperImpl();

    @Test
    void map() {
    }

}
