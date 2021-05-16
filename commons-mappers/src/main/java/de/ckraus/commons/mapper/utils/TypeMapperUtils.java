package de.ckraus.commons.mapper.utils;

import de.ckraus.commons.logging.slf4j.Slf4JLogger;
import de.ckraus.commons.mapper.*;
import de.ckraus.commons.utils.CommonsUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by ckraus on 07.08.15.
 */
@SuppressWarnings( { "WeakerAccess", "javadoc", "unused" } )
public class TypeMapperUtils {

    private static final String CLASS = TypeMapperUtils.class.getSimpleName();
    protected static Slf4JLogger log = new Slf4JLogger( TypeMapperUtils.class );

    private static TypeMapperUtils instance = null;

    private ConcurrentMap<Class<? extends TypeMapper<?>>, TypeMapper<?>> mapRegistredTypeMappers = null;

    private DefaultTypeMappers defaultTypeMappers = null;


    /**
     * Constructor
     */
    private TypeMapperUtils() {
        super();
    }

    /**
     * getInstance
     *
     * @return
     */
    protected static synchronized TypeMapperUtils getInstance() {
        if ( null == instance ) {
            // TODO Application Context ermitteln nicht erzeugen!
            try {
                ApplicationContext context = CommonsUtils.getInstance().getApplicationContext();
                instance = ( TypeMapperUtils ) context.getBean( "typeMapperUtils" );
            } catch ( BeansException be ) {
                // TODO: logging
            }

            if ( null == instance ) {
                // TODO: logging
                instance = new TypeMapperUtils();
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
    public static <T extends TypeMapper<?>> T get( Class<T> clazz ) {
        final String METHOD = CLASS + ".get(Class<T>)";

        T mapper = null;

        if ( null != clazz ) {
            mapper = clazz.cast( getInstance().getTypeMapper( clazz ) );
        }
        return mapper;
    }

    /**
     * getDefaults
     *
     * @return
     */
    public static DefaultTypeMappers getDefaults() {
        return getInstance().getDefaultTypeMappers();
    }

    /**
     * getRegisteredTypeMappers
     *
     * @return
     */
    public ConcurrentMap<Class<? extends TypeMapper<?>>, TypeMapper<?>> getRegisteredTypeMappers() {
        if ( null == mapRegistredTypeMappers ) {
            //            this.setRegisteredTypeMappers(
            //                    new ConcurrentHashMap<>()
            //            );
            mapRegistredTypeMappers = new ConcurrentHashMap<>();
        }
        return mapRegistredTypeMappers;
    }


    /* ### additional Methods ############ */

    /**
     * setRegisteredTypeMappers
     *
     * @param mapMappers
     */
    private void setRegisteredTypeMappers( ConcurrentMap<Class<? extends TypeMapper<?>>, TypeMapper<?>> mapMappers ) {
        this.mapRegistredTypeMappers = mapMappers;
    }

    /**
     * addRegisteredTypeMapper
     *
     * @param typeMapper
     */
    protected TypeMapper<?> addRegisteredTypeMapper( TypeMapper<?> typeMapper ) {
        if ( null != typeMapper ) {
            this.getRegisteredTypeMappers().put( typeMapper.getClass(), typeMapper );
        }
        return typeMapper;
    }

    /**
     * getDefaultTypeMappers
     *
     * @return
     */
    public DefaultTypeMappers getDefaultTypeMappers() {
        if ( null == defaultTypeMappers ) {
            defaultTypeMappers = new DefaultTypeMappers();
        }
        return defaultTypeMappers;
    }

    /**
     * getTypeMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings( "unchecked" )
    public <T extends TypeMapper> T getTypeMapper( Class<T> clazzTypeMapper ) {
        final String METHOD = CLASS + ".getTypeMapper(Class<T>)";
        //        log.logEnter(METHOD, clazzTypeMapper);

        T typeMapper = null;

        if ( null != clazzTypeMapper ) {
            if ( this.getRegisteredTypeMappers().containsKey( clazzTypeMapper ) ) {
                typeMapper = ( T ) this.getRegisteredTypeMappers().get( clazzTypeMapper );
            } else {
                try {
                    typeMapper = ( T ) this
                            .addRegisteredTypeMapper( clazzTypeMapper.getDeclaredConstructor().newInstance() );
                } catch ( InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e ) {
                    e.printStackTrace();
                }
            }
        }
        //        log.logReturn(METHOD, typeMapper);
        return typeMapper;
    }


    /**
     * Static Nested Class DefaultTypeMappers
     */
    public class DefaultTypeMappers {

        /**
         * Constructor
         */
        private DefaultTypeMappers() {
            super();
        }

        /**
         * getBigDecimalMapper
         *
         * @return
         */
        public BigDecimalMapperImpl getBigDecimalMapper() {
            return get( BigDecimalMapperImpl.class );
        }

        /**
         * getBigIntegerMapper
         *
         * @return
         */
        public BigIntegerMapperImpl getBigIntegerMapper() {
            return get( BigIntegerMapperImpl.class );
        }

        /**
         * getBooleanMapper
         *
         * @return
         */
        public BooleanMapperImpl getBooleanMapper() {
            return get( BooleanMapperImpl.class );
        }

        /**
         * getByteMapper
         *
         * @return
         */
        public ByteMapperImpl getByteMapper() {
            return get( ByteMapperImpl.class );
        }

        /**
         * getCharacterMapper
         *
         * @return
         */
        public CharacterMapperImpl getCharacterMapper() {
            return get( CharacterMapperImpl.class );
        }

        /**
         * getDateMapper
         *
         * @return
         */
        public DateMapperImpl getDateMapper() {
            return get( DateMapperImpl.class );
        }

        /**
         * getDoubleMapper
         *
         * @return
         */
        public DoubleMapperImpl getDoubleMapper() {
            return get( DoubleMapperImpl.class );
        }

        /**
         * getFloatMapper
         *
         * @return
         */
        public FloatMapperImpl getFloatMapper() {
            return get( FloatMapperImpl.class );
        }

        /**
         * getGregorianCalendarMapper
         *
         * @return
         */
        public GregorianCalendarMapperImpl getGregorianCalendarMapper() {
            return get( GregorianCalendarMapperImpl.class );
        }

        /**
         * getIntegerMapper
         *
         * @return
         */
        public IntegerMapperImpl getIntegerMapper() {
            return get( IntegerMapperImpl.class );
        }

        /**
         * getLocalDateMapper
         *
         * @return
         */
        public LocalDateMapperImpl getLocalDateMapper() {
            return get( LocalDateMapperImpl.class );
        }

        /**
         * getLocalDateTimeMapper
         *
         * @return
         */
        public LocalDateTimeMapperImpl getLocalDateTimeMapper() {
            return get( LocalDateTimeMapperImpl.class );
        }

        /**
         * getLocalTimeMapper
         *
         * @return
         */
        public LocalTimeMapperImpl getLocalTimeMapper() {
            return get( LocalTimeMapperImpl.class );
        }

        /**
         * getLongMapper
         *
         * @return
         */
        public LongMapperImpl getLongMapper() {
            return get( LongMapperImpl.class );
        }

        /**
         * getShortMapper
         *
         * @return
         */
        public ShortMapperImpl getShortMapper() {
            return get( ShortMapperImpl.class );
        }

        /**
         * getStringMapper
         *
         * @return
         */
        public StringMapperImpl getStringMapper() {
            return get( StringMapperImpl.class );
        }

    }

}
