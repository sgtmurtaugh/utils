package de.ckraus.scrappy.commons.mappers;

import de.ckraus.commons.mappers.CharacterMapper;
import de.ckraus.commons.mappers.CharacterMapperImpl;
import de.ckraus.commons.mappers.IntegerMapper;
import de.ckraus.commons.mappers.TypeMapperFactory;
import de.ckraus.commons.mappers.config.CommonsMappersApplicationContextProvider;

public class MapperRunner {

    public static void main(String[] args) {
        TypeMapperFactory typeMapperFactory =
                CommonsMappersApplicationContextProvider.getMapperConfig().getTypeMapperFactory();

        CharacterMapper characterMapper = typeMapperFactory.getMapper(CharacterMapperImpl.class);
        IntegerMapper integerMapper = characterMapper.getIntegerMapper();

        System.out.println(typeMapperFactory);
        System.out.println(characterMapper);
        System.out.println(integerMapper);
    }
}
