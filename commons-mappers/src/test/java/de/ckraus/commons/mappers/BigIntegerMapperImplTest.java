package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
class BigIntegerMapperImplTest {

    private final BigIntegerMapper mapper = new BigIntegerMapperImpl();

    @Test
    void map() {
    }

}
