package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeTypeMapperFactoryBase;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

@Component("servletContextTypeMapperFactory")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class ServletContextTypeMapperFactoryImpl extends ScopeTypeMapperFactoryBase<ServletContext>
        implements ServletContextTypeMapperFactory {

    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public BigDecimalServletContextMapper getBigDecimalMapper() {
        return this.getMapper(BigDecimalServletContextMapper.class);
    }

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public BigIntegerServletContextMapper getBigIntegerMapper() {
        return this.getMapper(BigIntegerServletContextMapper.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public BooleanServletContextMapper getBooleanMapper() {
        return this.getMapper(BooleanServletContextMapper.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public ByteServletContextMapper getByteMapper() {
        return this.getMapper(ByteServletContextMapper.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public CharacterServletContextMapper getCharacterMapper() {
        return this.getMapper(CharacterServletContextMapper.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public DateServletContextMapper getDateMapper() {
        return this.getMapper(DateServletContextMapper.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public DoubleServletContextMapper getDoubleMapper() {
        return this.getMapper(DoubleServletContextMapper.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public FloatServletContextMapper getFloatMapper() {
        return this.getMapper(FloatServletContextMapper.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public GregorianCalendarServletContextMapper getGregorianCalendarMapper() {
        return this.getMapper(GregorianCalendarServletContextMapper.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public IntegerServletContextMapper getIntegerMapper() {
        return this.getMapper(IntegerServletContextMapper.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalDateServletContextMapper getLocalDateMapper() {
    //        return this.getMapper(LocalDateServletContextMapper.class);
    //    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalDateTimeServletContextMapper getLocalDateTimeMapper() {
    //        return this.getMapper(LocalDateTimeServletContextMapper.class);
    //    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalTimeServletContextMapper getLocalTimeMapper() {
    //        return this.getMapper(LocalTimeServletContextMapper.class);
    //    }

    /**
     * getLongMapper
     *
     * @return
     */
    public LongServletContextMapper getLongMapper() {
        return this.getMapper(LongServletContextMapper.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public ShortServletContextMapper getShortMapper() {
        return this.getMapper(ShortServletContextMapper.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public StringServletContextMapper getStringMapper() {
        return this.getMapper(StringServletContextMapper.class);
    }

}
