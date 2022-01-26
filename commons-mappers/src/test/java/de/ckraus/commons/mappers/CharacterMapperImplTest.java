package de.ckraus.commons.mappers;

import de.ckraus.commons.mappers.config.CommonsMappersApplicationContextProvider;
import de.ckraus.commons.mappers.config.CommonsMappersConfig;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@ContextConfiguration("/spring/commons-mappers-spring-beans.xml")
@ContextConfiguration(classes = CommonsMappersConfig.class)
class CharacterMapperImplTest {

    // create mapper instance
    private final CharacterMapperImpl mapper = new CharacterMapperImpl();
    private final CharacterMapperImpl anotherMapper = new CharacterMapperImpl('a', Boolean.FALSE);

    @Test
    void isEvaluateCodePoints() {
        assertEquals(Boolean.TRUE, mapper.isEvaluateCodePoints());
        assertEquals(Boolean.FALSE, anotherMapper.isEvaluateCodePoints());
    }

    @Test
    void getIntegerMapper() {
        assertNotNull(mapper.getIntegerMapper());

        DefaultTypeMapperFactory defaultTypeMapperFactory =
                CommonsMappersApplicationContextProvider.getMapperConfig().getDefaultTypeMapperFactory();

        IntegerMapper integerMapper = defaultTypeMapperFactory.getIntegerMapper();
        assertEquals(integerMapper, mapper.getIntegerMapper());
    }
}
