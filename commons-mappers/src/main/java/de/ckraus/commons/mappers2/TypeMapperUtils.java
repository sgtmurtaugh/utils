package de.ckraus.commons.mappers2;

import de.materna.cms.cae.util.CMUtil;
import de.materna.cms.customers.kbscore.cae.constants.KBSCoreSpringBeans;
import lombok.NonNull;

@SuppressWarnings("javadoc")
public class TypeMapperUtils {

    /**
     * Constructor
     */
    private TypeMapperUtils() {
        super();
    }

    /**
     * @return
     */
    public static synchronized TypeMapperFactoryImpl getFactory() {
        return CMUtil.getSpringBean(KBSCoreSpringBeans.BEAN_TYPE_MAPPER_FACTORY, TypeMapperFactoryImpl.class);
    }

    /* ### additional Methods ############ */

    /**
     * getMapper
     *
     * @param clazzTypeMapper
     * @param <T>
     *
     * @return
     */
    public static <T extends TypeMapper<?>> T getMapper(@NonNull Class<T> clazzTypeMapper) {
        return getFactory().getMapper(clazzTypeMapper);
    }

    /**
     * getMapperForType
     *
     * @param clazz
     * @param <T>
     * @param <E>
     *
     * @return
     */
    public static <T extends TypeMapper<E>, E> T getMapperForType(@NonNull Class<E> clazz) {
        return getFactory().getMapperForType(clazz);
    }

    /**
     * getBigDecimalMapper
     *
     * @return
     */
    public static BigDecimalMapper getBigDecimalMapper() {
        return getFactory().getBigDecimalMapper();
    }

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    public static BigIntegerMapper getBigIntegerMapper() {
        return getFactory().getBigIntegerMapper();
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    public static BooleanMapper getBooleanMapper() {
        return getFactory().getBooleanMapper();
    }

    /**
     * getByteMapper
     *
     * @return
     */
    public static ByteMapper getByteMapper() {
        return getFactory().getByteMapper();
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    public static CharacterMapper getCharacterMapper() {
        return getFactory().getCharacterMapper();
    }

    /**
     * getDateMapper
     *
     * @return
     */
    public static DateMapper getDateMapper() {
        return getFactory().getDateMapper();
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    public static DoubleMapper getDoubleMapper() {
        return getFactory().getDoubleMapper();
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    public static FloatMapper getFloatMapper() {
        return getFactory().getFloatMapper();
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    public static GregorianCalendarMapper getGregorianCalendarMapper() {
        return getFactory().getGregorianCalendarMapper();
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    public static IntegerMapper getIntegerMapper() {
        return getFactory().getIntegerMapper();
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    public static LocalDateMapper getLocalDateMapper() {
        return getFactory().getLocalDateMapper();
    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    public static LocalDateTimeMapperImpl getLocalDateTimeMapper() {
        return getFactory().getLocalDateTimeMapper();
    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    public static LocalTimeMapperImpl getLocalTimeMapper() {
        return getFactory().getLocalTimeMapper();
    }

    /**
     * getLongMapper
     *
     * @return
     */
    public static LongMapper getLongMapper() {
        return getFactory().getLongMapper();
    }

    /**
     * getOWASPAntiSamyHtmlMapper
     *
     * @return
     */
    public static OWASPAntiSamyHtmlMapper getOWASPAntiSamyHtmlMapper() {
        return getFactory().getOWASPAntiSamyHtmlMapper();
    }

    /**
     * getShortMapper
     *
     * @return
     */
    public static ShortMapper getShortMapper() {
        return getFactory().getShortMapper();
    }

    /**
     * getStringMapper
     *
     * @return
     */
    public static StringMapper getStringMapper() {
        return getFactory().getStringMapper();
    }

}
