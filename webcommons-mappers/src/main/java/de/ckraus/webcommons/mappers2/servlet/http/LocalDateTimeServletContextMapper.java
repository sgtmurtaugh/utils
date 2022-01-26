package de.ckraus.webcommons.mappers2.servlet.http;//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.ServletContext;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//public class LocalDateTimeServletContextMapper extends ServletContextUtilsBase<LocalDateTime> {
//
//    /**
//     * Constructor
//     */
//    LocalDateTimeServletContextMapper() {
//        super( LocalDateTime.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
//     * @return
//     */
//    public static LocalDateTimeServletContextMapper getInstance() {
//        return ServletContextTypeMapperUtils.getLocalDateTimeMapper();
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
