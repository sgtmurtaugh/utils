//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.http.HttpServletRequest;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class LocalDateHttpServletRequestMapper extends HttpServletRequestUtilsBase<LocalDate> {
//
//    /**
//     * Constructor
//     */
//    LocalDateHttpServletRequestMapper() {
//        super( LocalDate.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link HttpServletRequestTypeMapperUtils}
//     * @return
//     */
//    public static LocalDateHttpServletRequestMapper getInstance() {
//        return HttpServletRequestTypeMapperUtils.getLocalDateMapper();
//    }
//
//    @Override
//    protected TypeMapper<LocalDate> getMapper() {
//        return TypeMapperUtils.getLocalDateMapper();
//    }
//
//    @Override
//    protected LocalDate mapValue( Object value, LocalDate defaultValue ) {
//        return this.getMapper().mapObject( value, defaultValue );
//    }
//
//    @Override
//    protected LocalDate mapValue( String value, boolean bTrim, boolean bEmptyIsNull, LocalDate defaultValue ) {
//        return this.getMapper().map( value, bTrim, bEmptyIsNull, defaultValue );
//    }
//
//}
