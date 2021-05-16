package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class DoubleMapperImpl extends NumericTypeMapperBase<Double> implements DoubleMapper {

    /**
     * Constructor
     */
    public DoubleMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public DoubleMapperImpl( Double defaultValue ) {
        super( defaultValue );
    }

}
