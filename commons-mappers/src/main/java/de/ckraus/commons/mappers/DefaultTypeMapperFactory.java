package de.ckraus.commons.mappers;

@SuppressWarnings({ "javadoc", "unused" })
public interface DefaultTypeMapperFactory<E> extends TypeMapperFactory<E> {


    /* ### additional Methods ############ */


    /**
     * getBigDecimalMapper
     *
     * @return
     */
    default BigDecimalMapper getBigDecimalMapper() {
        return this.getMapper(BigDecimalMapperImpl.class);
    }

    /**
     * getBigIntegerMapper
     *
     * @return
     */
    default BigIntegerMapper getBigIntegerMapper() {
        return this.getMapper(BigIntegerMapperImpl.class);
    }

    /**
     * getBooleanMapper
     *
     * @return
     */
    default BooleanMapper getBooleanMapper() {
        return this.getMapper(BooleanMapperImpl.class);
    }

    /**
     * getByteMapper
     *
     * @return
     */
    default ByteMapper getByteMapper() {
        return this.getMapper(ByteMapperImpl.class);
    }

    /**
     * getCharacterMapper
     *
     * @return
     */
    default CharacterMapper getCharacterMapper() {
        return this.getMapper(CharacterMapperImpl.class);
    }

    /**
     * getDateMapper
     *
     * @return
     */
    default DateMapper getDateMapper() {
        return this.getMapper(DateMapperImpl.class);
    }

    /**
     * getDoubleMapper
     *
     * @return
     */
    default DoubleMapper getDoubleMapper() {
        return this.getMapper(DoubleMapperImpl.class);
    }

    /**
     * getFloatMapper
     *
     * @return
     */
    default FloatMapper getFloatMapper() {
        return this.getMapper(FloatMapperImpl.class);
    }

    /**
     * getGregorianCalendarMapper
     *
     * @return
     */
    default GregorianCalendarMapper getGregorianCalendarMapper() {
        return this.getMapper(GregorianCalendarMapperImpl.class);
    }

    /**
     * getIntegerMapper
     *
     * @return
     */
    default IntegerMapper getIntegerMapper() {
        return this.getMapper(IntegerMapperImpl.class);
    }

    /**
     * getLocalDateMapper
     *
     * @return
     */
    default LocalDateMapper getLocalDateMapper() {
        return this.getMapper(LocalDateMapperImpl.class);
    }

    /**
     * getLocalDateTimeMapper
     *
     * @return
     */
    default LocalDateTimeMapper getLocalDateTimeMapper() {
        return this.getMapper(LocalDateTimeMapperImpl.class);
    }

    /**
     * getLocalTimeMapper
     *
     * @return
     */
    default LocalTimeMapper getLocalTimeMapper() {
        return this.getMapper(LocalTimeMapperImpl.class);
    }

    /**
     * getLongMapper
     *
     * @return
     */
    default LongMapper getLongMapper() {
        return this.getMapper(LongMapperImpl.class);
    }

    /**
     * getShortMapper
     *
     * @return
     */
    default ShortMapper getShortMapper() {
        return this.getMapper(ShortMapperImpl.class);
    }

    /**
     * getStringMapper
     *
     * @return
     */
    default StringMapper getStringMapper() {
        return this.getMapper(StringMapperImpl.class);
    }

}
