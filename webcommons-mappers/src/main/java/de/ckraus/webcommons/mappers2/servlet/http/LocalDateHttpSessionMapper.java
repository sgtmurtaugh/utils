//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.http.HttpSession;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class LocalDateHttpSessionMapper extends HttpSessionUtilsBase<LocalDate> {
//
//    /**
//     * Constructor
//     */
//    LocalDateHttpSessionMapper() {
//        super( LocalDate.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
//     * @return
//     */
//    public static LocalDateHttpSessionMapper getInstance() {
//        return HttpSessionTypeMapperUtils.getLocalDateMapper();
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
//}
