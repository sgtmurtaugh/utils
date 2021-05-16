package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class LongMapperImpl extends NumericTypeMapperBase<Long> implements LongMapper {

    /**
     * Constructor
     */
    public LongMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public LongMapperImpl( Long defaultValue ) {
        super( defaultValue );
    }

}
