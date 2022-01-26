package de.ckraus.commons.mappers;

import de.ckraus.commons.mappers.config.CommonsMappersApplicationContextProvider;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentMap;

@Component("defaultTypeMapperFactory")
@Getter
@SuppressWarnings({ "javadoc", "unused" })
public class DefaultTypeMapperFactoryImpl extends TypeMapperFactoryImpl
        implements DefaultTypeMapperFactory<ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>>> {


    @Override
    public void afterPropertiesSet() throws Exception {
        var bigDecimalMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getBigDecimalMapper();
        this.addTypeMapper(bigDecimalMapper);

        var bigIntegerMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getBigIntegerMapper();
        this.addTypeMapper(bigIntegerMapper);

        var booleanMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getBooleanMapper();
        this.addTypeMapper(booleanMapper);

        var byteMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getByteMapper();
        this.addTypeMapper(byteMapper);

        var characterMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getCharacterMapper();
        this.addTypeMapper(characterMapper);

        var dateMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getDateMapper();
        this.addTypeMapper(dateMapper);

        var doubleMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getDoubleMapper();
        this.addTypeMapper(doubleMapper);

        var floatMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getFloatMapper();
        this.addTypeMapper(floatMapper);

        var gregorianCalendarMapper =
                CommonsMappersApplicationContextProvider.getMapperConfig().getGregorianCalendarMapper();
        this.addTypeMapper(gregorianCalendarMapper);

        var integerMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getIntegerMapper();
        this.addTypeMapper(integerMapper);

        var localDateMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLocalDateMapper();
        this.addTypeMapper(localDateMapper);

        var localDateTimeMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLocalDateTimeMapper();
        this.addTypeMapper(localDateTimeMapper);

        var localTimeMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLocalTimeMapper();
        this.addTypeMapper(localTimeMapper);

        var longMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getLongMapper();
        this.addTypeMapper(longMapper);

        var shortMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getShortMapper();
        this.addTypeMapper(shortMapper);

        var stringMapper = CommonsMappersApplicationContextProvider.getMapperConfig().getStringMapper();
        this.addTypeMapper(stringMapper);
    }

}
