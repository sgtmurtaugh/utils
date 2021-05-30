package de.ckraus.commons.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused", "WeakerAccess" })
public class StringUtilitiesImpl extends UtilitiesBase<String> implements StringUtilities {

    private final static String CLASS = StringUtilitiesImpl.class.getSimpleName();
    //    protected static Logger log = LoggerFactory.getLogger(StringUtilities.class);


    /**
     * Constructor
     */
    public StringUtilitiesImpl() {
        super();
    }

}
