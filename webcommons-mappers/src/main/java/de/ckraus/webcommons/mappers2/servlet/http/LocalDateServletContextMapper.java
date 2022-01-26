package de.ckraus.webcommons.mappers2.servlet.http;//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.ServletContext;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class LocalDateServletContextMapper extends ServletContextUtilsBase<LocalDate> {
//
//    /**
//     * Constructor
//     */
//    LocalDateServletContextMapper() {
//        super( LocalDate.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
//     * @return
//     */
//    public static LocalDateServletContextMapper getInstance() {
//        return ServletContextTypeMapperUtils.getLocalDateMapper();
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
