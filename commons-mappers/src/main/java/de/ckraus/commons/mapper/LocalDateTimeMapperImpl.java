package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("localDateTimeMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalDateTimeMapperImpl extends TemporalTypeMapperBase<LocalDateTime> implements LocalDateTimeMapper {

    /**
     * Constructor
     */
    public LocalDateTimeMapperImpl() {
        super(LocalDateTime.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalDateTimeMapperImpl(LocalDateTime defaultValue) {
        super(LocalDateTime.class, defaultValue);
    }

}
