package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalDateTimeMapperImpl extends TemporalTypeMapperBase<LocalDateTime> implements LocalDateTimeMapper {

    /**
     * Constructor
     */
    public LocalDateTimeMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalDateTimeMapperImpl(LocalDateTime defaultValue) {
        super(defaultValue);
    }

}
