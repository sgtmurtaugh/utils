package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class DateMapperImpl extends TypeMapperBase<Date> implements DateMapper {

    /**
     * Constructor
     */
    public DateMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public DateMapperImpl(Date defaultValue) {
        super(defaultValue);
    }

}
