//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.http.HttpServletRequest;
//import java.math.BigDecimal;
//import java.time.LocalTime;
//
//public class LocalTimeHttpServletRequestMapper extends HttpServletRequestUtilsBase<LocalTime> {
//
//    /**
//     * Constructor
//     */
//    LocalTimeHttpServletRequestMapper() {
//        super( LocalTime.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
//     * @return
//     */
//    public static LocalTimeHttpServletRequestMapper getInstance() {
//        return HttpServletRequestTypeMapperUtils.getLocalTimeMapper();
//    }
//
//    @Override
//    protected TypeMapper<LocalTime> getMapper() {
//        return TypeMapperUtils.getLocalTimeMapper();
//    }
//
//    @Override
//    protected LocalTime mapValue( Object value, LocalTime defaultValue ) {
//        return this.getMapper().mapObject( value, defaultValue );
//    }
//
//    @Override
//    protected LocalTime mapValue( String value, boolean bTrim, boolean bEmptyIsNull, LocalTime defaultValue ) {
//        return this.getMapper().map( value, bTrim, bEmptyIsNull, defaultValue );
//    }
//
//}
