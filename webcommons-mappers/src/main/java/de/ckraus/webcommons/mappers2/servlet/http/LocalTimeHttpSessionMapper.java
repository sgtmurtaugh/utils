//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.http.HttpSession;
//import java.math.BigDecimal;
//import java.time.LocalTime;
//
//public class LocalTimeHttpSessionMapper extends HttpSessionUtilsBase<LocalTime> {
//
//    /**
//     * Constructor
//     */
//    LocalTimeHttpSessionMapper() {
//        super( LocalTime.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link HttpSessionTypeMapperUtils}
//     * @return
//     */
//    public static LocalTimeHttpSessionMapper getInstance() {
//        return HttpSessionTypeMapperUtils.getLocalTimeMapper();
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
//}
