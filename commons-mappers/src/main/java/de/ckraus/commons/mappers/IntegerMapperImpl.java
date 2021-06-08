package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("integerMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class IntegerMapperImpl extends NumericTypeMapperBase<Integer> implements IntegerMapper {

    /**
     * Constructor
     */
    public IntegerMapperImpl() {
        super(Integer.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public IntegerMapperImpl(Integer defaultValue) {
        super(Integer.class, defaultValue);
    }

}
