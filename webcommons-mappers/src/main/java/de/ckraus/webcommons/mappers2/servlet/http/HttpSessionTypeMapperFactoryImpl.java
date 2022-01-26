package de.ckraus.webcommons.mappers2.servlet.http;

import de.ckraus.webcommons.mappers2.servlet.ScopeTypeMapperFactoryBase;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component("httpSessionTypeMapperFactory")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class HttpSessionTypeMapperFactoryImpl extends ScopeTypeMapperFactoryBase<HttpSession>
        implements HttpSessionTypeMapperFactory {

    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public BigDecimalHttpSessionMapper getBigDecimalMapper() {
        return this.getMapper(BigDecimalHttpSessionMapper.class);
    }

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public BigIntegerHttpSessionMapper getBigIntegerMapper() {
        return this.getMapper(BigIntegerHttpSessionMapper.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public BooleanHttpSessionMapper getBooleanMapper() {
        return this.getMapper(BooleanHttpSessionMapper.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public ByteHttpSessionMapper getByteMapper() {
        return this.getMapper(ByteHttpSessionMapper.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public CharacterHttpSessionMapper getCharacterMapper() {
        return this.getMapper(CharacterHttpSessionMapper.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public DateHttpSessionMapper getDateMapper() {
        return this.getMapper(DateHttpSessionMapper.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public DoubleHttpSessionMapper getDoubleMapper() {
        return this.getMapper(DoubleHttpSessionMapper.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public FloatHttpSessionMapper getFloatMapper() {
        return this.getMapper(FloatHttpSessionMapper.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public GregorianCalendarHttpSessionMapper getGregorianCalendarMapper() {
        return this.getMapper(GregorianCalendarHttpSessionMapper.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public IntegerHttpSessionMapper getIntegerMapper() {
        return this.getMapper(IntegerHttpSessionMapper.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalDateHttpSessionMapper getLocalDateMapper() {
    //        return this.getMapper(LocalDateHttpSessionMapper.class);
    //    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalDateTimeHttpSessionMapper getLocalDateTimeMapper() {
    //        return this.getMapper(LocalDateTimeHttpSessionMapper.class);
    //    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    // TODO: Mit Java 8+ wieder einkommentieren!

    //    public LocalTimeHttpSessionMapper getLocalTimeMapper() {
    //        return this.getMapper(LocalTimeHttpSessionMapper.class);
    //    }

    /**
     * getLongMapper
     *
     * @return
     */
    public LongHttpSessionMapper getLongMapper() {
        return this.getMapper(LongHttpSessionMapper.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public ShortHttpSessionMapper getShortMapper() {
        return this.getMapper(ShortHttpSessionMapper.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public StringHttpSessionMapper getStringMapper() {
        return this.getMapper(StringHttpSessionMapper.class);
    }

}
