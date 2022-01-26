package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
class DoubleMapperImplTest {

    private final DoubleMapperImpl mapper = new DoubleMapperImpl();

    @Test
    void map() {
    }

}
