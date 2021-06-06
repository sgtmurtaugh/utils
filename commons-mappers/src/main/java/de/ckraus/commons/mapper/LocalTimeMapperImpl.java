package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component("localTimeMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalTimeMapperImpl extends TemporalTypeMapperBase<LocalTime> implements LocalTimeMapper {

    /**
     * Constructor
     */
    public LocalTimeMapperImpl() {
        super(LocalTime.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalTimeMapperImpl(LocalTime defaultValue) {
        super(LocalTime.class, defaultValue);
    }

}
