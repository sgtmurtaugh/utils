package de.ckraus.commons.mappers;

import de.ckraus.commons.mappers.config.CommonsMappersApplicationContextProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

        TypeMapperFactoryImpl typeMapperFactory =
                CommonsMappersApplicationContextProvider.getApplicationContext().getBean(TypeMapperFactoryImpl.class);

        IntegerMapper integerMapper = typeMapperFactory.getIntegerMapper();
        assertEquals(integerMapper, mapper.getIntegerMapper());
    }
}
