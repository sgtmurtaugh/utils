package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeTypeMapperFactoryBase;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component("httpSeervletRequestTypeMapperFactory")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class HttpServletRequestTypeMapperFactoryImpl extends ScopeTypeMapperFactoryBase<HttpServletRequest>
        implements HttpServletRequestTypeMapperFactory {

    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public BigDecimalHttpServletRequestMapper getBigDecimalMapper() {
        return this.getMapper(BigDecimalHttpServletRequestMapper.class);
    }

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public BigIntegerHttpServletRequestMapper getBigIntegerMapper() {
        return this.getMapper(BigIntegerHttpServletRequestMapper.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public BooleanHttpServletRequestMapper getBooleanMapper() {
        return this.getMapper(BooleanHttpServletRequestMapper.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public ByteHttpServletRequestMapper getByteMapper() {
        return this.getMapper(ByteHttpServletRequestMapper.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public CharacterHttpServletRequestMapper getCharacterMapper() {
        return this.getMapper(CharacterHttpServletRequestMapper.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public DateHttpServletRequestMapper getDateMapper() {
        return this.getMapper(DateHttpServletRequestMapper.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public DoubleHttpServletRequestMapper getDoubleMapper() {
        return this.getMapper(DoubleHttpServletRequestMapper.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public FloatHttpServletRequestMapper getFloatMapper() {
        return this.getMapper(FloatHttpServletRequestMapper.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public GregorianCalendarHttpServletRequestMapper getGregorianCalendarMapper() {
        return this.getMapper(GregorianCalendarHttpServletRequestMapper.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public IntegerHttpServletRequestMapper getIntegerMapper() {
        return this.getMapper(IntegerHttpServletRequestMapper.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalDateHttpServletRequestMapper getLocalDateMapper() {
    //        return this.getMapper(LocalDateHttpServletRequestMapper.class);
    //    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalDateTimeHttpServletRequestMapper getLocalDateTimeMapper() {
    //        return this.getMapper(LocalDateTimeHttpServletRequestMapper.class);
    //    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalTimeHttpServletRequestMapper getLocalTimeMapper() {
    //        return this.getMapper(LocalTimeHttpServletRequestMapper.class);
    //    }

    /**
     * getLongMapper
     *
     * @return
     */
    public LongHttpServletRequestMapper getLongMapper() {
        return this.getMapper(LongHttpServletRequestMapper.class);
    }

    /**
     * getOWASPAntiSamyHtmlMapper
     *
     * @return
     */
    public OWASPAntiSamyHtmlHttpServletRequestMapper getOWASPAntiSamyHtmlMapper() {
        return this.getMapper(OWASPAntiSamyHtmlHttpServletRequestMapper.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public ShortHttpServletRequestMapper getShortMapper() {
        return this.getMapper(ShortHttpServletRequestMapper.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public StringHttpServletRequestMapper getStringMapper() {
        return this.getMapper(StringHttpServletRequestMapper.class);
    }

}
