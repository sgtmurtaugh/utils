package de.ckraus.commons.mapper.conf;

import de.ckraus.commons.mapper.TypeMapperFactory;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("mapperConfig")
@ComponentScan("de.ckraus.commons.mapper")
@Getter
public class MapperConfig {

    private TypeMapperFactory typeMapperFactory;

    @Autowired
    @Qualifier("typeMapperFactory")
    protected void setTypeMapperFactory(TypeMapperFactory typeMapperFactory) {
        this.typeMapperFactory = typeMapperFactory;
    }

}
