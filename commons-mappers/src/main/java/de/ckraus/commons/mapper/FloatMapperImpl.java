package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class FloatMapperImpl extends NumericTypeMapperBase<Float> implements FloatMapper {

    /**
     * Constructor
     */
    public FloatMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public FloatMapperImpl( Float defaultValue ) {
        super( defaultValue );
    }

}
