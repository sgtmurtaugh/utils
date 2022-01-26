package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
class StringMapperTest {

    private final StringMapper mapper = () -> String.class;

    @Test
    void mapObject() {
    }

    @Test
    void map() {
    }

    @Test
    void testMap() {
    }

    @Test
    void testMap1() {
    }
}
