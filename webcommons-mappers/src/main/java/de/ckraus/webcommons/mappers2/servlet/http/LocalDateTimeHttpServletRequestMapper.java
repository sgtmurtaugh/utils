//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.http.HttpServletRequest;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//public class LocalDateTimeHttpServletRequestMapper extends HttpServletRequestUtilsBase<LocalDateTime> {
//
//    /**
//     * Constructor
//     */
//    LocalDateTimeHttpServletRequestMapper() {
//        super( LocalDateTime.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
//     * @return
//     */
//    public static LocalDateTimeHttpServletRequestMapper getInstance() {
//        return HttpServletRequestTypeMapperUtils.getLocalDateTimeMapper();
//    }
//
//    @Override
//    protected TypeMapper<LocalDateTime> getMapper() {
//        return TypeMapperUtils.getLocalDateTimeMapper();
//    }
//
//    @Override
//    protected LocalDateTime mapValue( Object value, LocalDateTime defaultValue ) {
//        return this.getMapper().mapObject( value, defaultValue );
//    }
//
//    @Override
//    protected LocalDateTime mapValue( String value, boolean bTrim, boolean bEmptyIsNull,
//            LocalDateTime defaultValue ) {
//        return this.getMapper().map( value, bTrim, bEmptyIsNull, defaultValue );
//    }
//
//}
