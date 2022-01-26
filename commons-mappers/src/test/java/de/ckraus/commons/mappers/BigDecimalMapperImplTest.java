package de.ckraus.commons.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
class BigDecimalMapperImplTest {

    private final BigDecimalMapper mapper = new BigDecimalMapperImpl();

    @Test
    void map() {
    }

}
