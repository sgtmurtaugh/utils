//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.http.HttpSession;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//public class LocalDateTimeHttpSessionMapper extends HttpSessionUtilsBase<LocalDateTime> {
//
//    /**
//     * Constructor
//     */
//    LocalDateTimeHttpSessionMapper() {
//        super( LocalDateTime.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
//     * @return
//     */
//    public static LocalDateTimeHttpSessionMapper getInstance() {
//        return HttpSessionTypeMapperUtils.getLocalDateTimeMapper();
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
//}
