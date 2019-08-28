package de.ckraus.commons.mapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter( AccessLevel.PROTECTED )
@SuppressWarnings( { "javadoc", "unused" } )
public class StringMapperImpl extends TypeMapperBase<String> implements StringMapper {

    private final static String CLASS = StringMapperImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(StringMapper.class);


    /**
     * Constructor
     */
    public StringMapperImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    public StringMapperImpl( String defaultValue ) {
        super( defaultValue );
    }

}
