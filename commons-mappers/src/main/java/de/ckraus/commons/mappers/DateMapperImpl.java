package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("dateMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class DateMapperImpl extends TypeMapperBase<Date> implements DateMapper {

    /**
     * Constructor
     */
    public DateMapperImpl() {
        super(Date.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public DateMapperImpl(Date defaultValue) {
        super(Date.class, defaultValue);
    }

}
