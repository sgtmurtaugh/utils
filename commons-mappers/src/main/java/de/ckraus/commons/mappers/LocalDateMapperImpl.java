package de.ckraus.commons.mappers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("localDateMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class LocalDateMapperImpl extends TemporalTypeMapperBase<LocalDate> implements LocalDateMapper {

    /**
     * Constructor
     */
    public LocalDateMapperImpl() {
        super(LocalDate.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LocalDateMapperImpl(LocalDate defaultValue) {
        super(LocalDate.class, defaultValue);
    }

}
