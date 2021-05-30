package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalTimeMapperImpl extends TemporalTypeMapperBase<LocalTime> implements LocalTimeMapper {

    /**
     * Constructor
     */
    public LocalTimeMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalTimeMapperImpl(LocalTime defaultValue) {
        super(defaultValue);
    }

}
