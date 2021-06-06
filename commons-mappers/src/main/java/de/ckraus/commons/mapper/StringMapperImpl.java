package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("stringMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class StringMapperImpl extends TypeMapperBase<String> implements StringMapper {

    /**
     * Constructor
     */
    public StringMapperImpl() {
        super(String.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public StringMapperImpl(String defaultValue) {
        super(String.class, defaultValue);
    }

}
