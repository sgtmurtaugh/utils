package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.commons.logging.slf4j.Slf4JLogger;
import de.ckraus.commons.mapper.*;
import de.ckraus.commons.utils.CommonsUtils;
import lombok.NonNull;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by ckraus on 07.08.15.
 */
@SuppressWarnings({ "WeakerAccess", "javadoc", "unused" })
public class TypeMapperHttpServletRequestUtils {

    private static final String CLASS = TypeMapperHttpServletRequestUtils.class.getSimpleName();
    protected static Slf4JLogger log = new Slf4JLogger(TypeMapperHttpServletRequestUtils.class);

    private static TypeMapperHttpServletRequestUtils instance = null;

    private ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> mapRegistredTypeMappers = null;

    /**
     * Constructor
     */
    private TypeMapperHttpServletRequestUtils() {
        super();
    }

    /**
     * getInstance
     *
     * @return
     */
    protected static synchronized TypeMapperHttpServletRequestUtils getInstance() {
        if (null == instance) {
            // TODO Application Context ermitteln nicht erzeugen!
            try {
                ApplicationContext context = CommonsUtils.getInstance().getApplicationContext();
                instance = (TypeMapperHttpServletRequestUtils) context.getBean("typeMapperUtils");
            }
            catch (BeansException be) {
                // TODO: logging
            }

            if (null == instance) {
                // TODO: logging
                instance = new TypeMapperHttpServletRequestUtils();
            }
        }
        return instance;
    }


    /* ### getter- / setter-Methods ############ */


    /**
     * get
     *
     * @return
     */
    public static <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazz) {
        return clazz.cast(getInstance().getTypeMapper(clazz));
    }

    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public static BigDecimalMapperImpl getBigDecimalMapper() {
        return getMapper(BigDecimalMapperImpl.class);
    }


    /* ### additional Methods ############ */

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public static BigIntegerMapperImpl getBigIntegerMapper() {
        return getMapper(BigIntegerMapperImpl.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public static BooleanMapperImpl getBooleanMapper() {
        return getMapper(BooleanMapperImpl.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public static ByteMapperImpl getByteMapper() {
        return getMapper(ByteMapperImpl.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public static CharacterMapperImpl getCharacterMapper() {
        return getMapper(CharacterMapperImpl.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public static DateMapperImpl getDateMapper() {
        return getMapper(DateMapperImpl.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public static DoubleMapperImpl getDoubleMapper() {
        return getMapper(DoubleMapperImpl.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public static FloatMapperImpl getFloatMapper() {
        return getMapper(FloatMapperImpl.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public static GregorianCalendarMapperImpl getGregorianCalendarMapper() {
        return getMapper(GregorianCalendarMapperImpl.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public static IntegerMapperImpl getIntegerMapper() {
        return getMapper(IntegerMapperImpl.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    public static LocalDateMapperImpl getLocalDateMapper() {
        return getMapper(LocalDateMapperImpl.class);
    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    public static LocalDateTimeMapperImpl getLocalDateTimeMapper() {
        return getMapper(LocalDateTimeMapperImpl.class);
    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    public static LocalTimeMapperImpl getLocalTimeMapper() {
        return getMapper(LocalTimeMapperImpl.class);
    }

    /**
     * getLongMapper
     *
     * @return
     */
    public static LongMapperImpl getLongMapper() {
        return getMapper(LongMapperImpl.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public static ShortMapperImpl getShortMapper() {
        return getMapper(ShortMapperImpl.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public static StringMapperImpl getStringMapper() {
        return getMapper(StringMapperImpl.class);
    }

    /**
     * getRegisteredTypeMappers
     *
     * @return
     */
    public ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> getRegisteredTypeMappers() {
        if (null == mapRegistredTypeMappers) {
            mapRegistredTypeMappers = new ConcurrentHashMap<>();
        }
        return mapRegistredTypeMappers;
    }

    /**
     * setRegisteredTypeMappers
     *
     * @param mapMappers
     */
    private void setRegisteredTypeMappers(ConcurrentMap<Class<? extends TypeMapper>, TypeMapper<?>> mapMappers) {
        this.mapRegistredTypeMappers = mapMappers;
    }

    /**
     * addRegisteredTypeMapper
     *
     * @param typeMapper
     */
    protected TypeMapper<?> addRegisteredTypeMapper(@NonNull TypeMapper<?> typeMapper) {
        this.getRegisteredTypeMappers().put(typeMapper.getClass(), typeMapper);
        return typeMapper;
    }

    /**
     * getTypeMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends TypeMapper> T getTypeMapper(@NonNull Class<T> clazzTypeMapper) {
        T typeMapper = null;

        if (this.getRegisteredTypeMappers().containsKey(clazzTypeMapper)) {
            typeMapper = (T) this.getRegisteredTypeMappers().get(clazzTypeMapper);
        }
        else {
            try {
                typeMapper = (T) this.addRegisteredTypeMapper(clazzTypeMapper.getDeclaredConstructor().newInstance());
            }
            catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return typeMapper;
    }

}
