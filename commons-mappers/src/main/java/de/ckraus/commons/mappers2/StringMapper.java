package de.ckraus.commons.mappers2;

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
    String mapObject(Object obj, String defaultValue);

    /**
     * Delegates to {@link #map(String, String)} with usage of {@link #getDefaultValue()}
     *
     * @param s - string to map
     *
     * @return mapped string
     */
    @Override
    String map(String s);

    /**
     * Delegates to {@link #map(String, boolean, boolean, String)} with usage of {@link #isTrimString()} and {@link
     * #isEmptyStringNull()}
     *
     * @param s - string to map
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    @Override
    String map(String s, String defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - flag for string handling
     * @param bEmptyIsNull - flag for empty string handling
     * @param defaultValue - The value
     *
     * @return mapped string
     */
    @Override
    String map(String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue);

}
