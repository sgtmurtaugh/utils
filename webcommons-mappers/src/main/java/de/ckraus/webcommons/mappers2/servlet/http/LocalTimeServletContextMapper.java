package de.ckraus.webcommons.mappers2.servlet.http;//package de.materna.cms.customers.kbscore.cae.utils.typemapper.http;
//
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapper;
//import de.materna.cms.customers.kbscore.cae.utils.typemapper.TypeMapperUtils;
//import lombok.NonNull;
//
//import javax.servlet.ServletContext;
//import java.math.BigDecimal;
//import java.time.LocalTime;
//
//public class LocalTimeServletContextMapper extends ServletContextUtilsBase<LocalTime> {
//
//    /**
//     * Constructor
//     */
//    LocalTimeServletContextMapper() {
//        super( LocalTime.class );
//    }
//
//    /**
//     * Ermittelt eine Instanz per {@link ServletContextTypeMapperUtils}
//     * @return
//     */
//    public static LocalTimeServletContextMapper getInstance() {
//        return ServletContextTypeMapperUtils.getLocalTimeMapper();
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
