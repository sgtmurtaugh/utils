package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class StringMapperImpl extends TypeMapperBase<String> implements StringMapper {

    /**
     * Constructor
     */
    public StringMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public StringMapperImpl(String defaultValue) {
        super(defaultValue);
    }

}
