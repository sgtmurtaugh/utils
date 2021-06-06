package de.ckraus.commons.mapper;

@SuppressWarnings({ "javadoc" })
public interface StringMapper extends TypeMapper<String> {

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    default String mapObject(Object obj, String defaultValue) {
        String e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof String) {
            e = this.map((String) obj, defaultValue);
        }
        else {
            e = this.map(obj.toString(), defaultValue);
        }
        return e;
    }

    /**
     * Delegates to {@link #map(String, String)} with usage of {@link #getDefaultValue()}
     *
     * @param s - string to map
     *
     * @return mapped string
     */
    @Override
    default String map(String s) {
        return this.map(s, this.getDefaultValue());
    }

    /**
     * Delegates to {@link #map(String, boolean, boolean, String)} with usage of {@link #isTrimString()} and {@link
     * #isEmptyStringNull()}
     *
     * @param s - string to map
     * @param defaultValue - The default value
     *
     * @return mapped string
     */
    @Override
    default String map(String s, String defaultValue) {
        return this.map(s, this.isTrimString(), this.isEmptyStringNull(), defaultValue);
    }

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return mapped string
     */
    @Override
    default String map(String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue) {
        String sRetVal = defaultValue;
        String sPrepared = this.prepare(s, bTrim, bEmptyIsNull);

        if (sPrepared != null) {
            sRetVal = sPrepared;
        }
        return sRetVal;
    }

}
